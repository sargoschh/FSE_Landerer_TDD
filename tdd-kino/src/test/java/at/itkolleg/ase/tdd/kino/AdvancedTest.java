package at.itkolleg.ase.tdd.kino;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class AdvancedTest {

    private List<Vorstellung> vorstellungen = new ArrayList<>();
    private KinoVerwaltung kinoVerwaltung;
    private KinoSaal ks1;
    private LocalDate date1 = LocalDate.now();
    private Vorstellung v1;
    private Vorstellung v2;
    private Vorstellung v3;

    private Zeitfenster zeitfenster = Zeitfenster.ABEND;
    @BeforeEach
    void setUp() {
        Map<Character,Integer> map = new HashMap<>();
        map.put('A',10);
        map.put('B',10);
        map.put('C',15);

        ks1 = new KinoSaal("SuperSaal",map);

        v1 = new Vorstellung(ks1, zeitfenster, date1, "Eragon", 15.99f);
        v2 = new Vorstellung(ks1, Zeitfenster.NACHMITTAG, date1, "Harry Potter", 15.99f);
        v3 = new Vorstellung(ks1, Zeitfenster.NACHT, date1, "Herr der Ringe", 15.99f);

        kinoVerwaltung = new KinoVerwaltung();

        kinoVerwaltung.einplanenVorstellung(v1);
    }

    /**
     * 1. Schreiben Sie einen Test, der validiert, dass das Anlegen einer Vorstellung
     * korrekt funktioniert. Der Test sollte eine fachliche Bezeichnung haben und die
     * Assertions sollten bei Validierungsfehler eine Hinweistext liefern.
     */
    @Test
    void vorstellungAnlegen() {
        Vorstellung vorstellung = new Vorstellung(ks1, zeitfenster, date1, "Eragon", 15.99f);
        assertNotNull(vorstellung, "Die Vorstellung sollte nicht 'null' sein.");
        assertEquals(ks1, vorstellung.getSaal(), "Der Kinosaal sollte '" + ks1.getName() +"' heißen.");
        assertEquals(zeitfenster, vorstellung.getZeitfenster(), "Das Zeitfenster sollte '" + zeitfenster +"' sein.");
        assertEquals(date1, vorstellung.getDatum(), "Das Datum sollte '" + date1 + "' sein.");

    }

    /**
     * 2. Schreiben Sie einen Test, der validiert, dass das Einplanen mehrerer
     * Vorstellungen korrekt funktioniert. Stellen Sie zudem sicher, dass beim möglichen
     * Auftreten eines Fehlers trotzdem alle Validierungen ausgeführt werden.
     */
    @Test
    void testMehrereVorstellungenEinplanen() {
        assertDoesNotThrow(() -> kinoVerwaltung.einplanenVorstellung(v2),
                "Das Einplanen von der Vorstellung fuer den Film '" + v2.getFilm() + "' sollte keine Exception werfen.");
        assertDoesNotThrow(() -> kinoVerwaltung.einplanenVorstellung(v3),
                "Das Einplanen von der Vorstellung fuer den Film '" + v3.getFilm() + "' sollte keine Exception werfen.");
    }

    /**
     * 3. Schreiben Sie einen Test, der sicherstellt, dass ein Fehler geworfen wird,
     * wenn eine Veranstaltung doppelt eingeplant wird.
     */
    @Test
    void testDoppelteVorstellungEinplanen() {
        assertThrows(IllegalArgumentException.class, () -> kinoVerwaltung.einplanenVorstellung(v1),
                "Das Einplanen einer bereits eingeplanten Vorstellung sollte eine Exception werfen.");
    }

    /**
     * 4. Schreiben Sie einen parametrisierten Test, der mehrere Ticketkäufe mit
     * unterschiedlichen Parametern überprüft.
     */
    private static Stream<Arguments> ticketKaufParameter() {
        return Stream.of(
                Arguments.of('A', 1, 25.0f),
                Arguments.of('A', 5, 22.0f),
                Arguments.of('B', 8, 20.0f),
                Arguments.of('B', 4, 20.5f)
        );
    }

    @ParameterizedTest
    @MethodSource("ticketKaufParameter")
    void testKaufeTicketMitVerschiedenenParametern(char reihe, int platz, float geld) {
        Ticket ticket = v1.kaufeTicket(reihe, platz, geld);

        assertNotNull(ticket, "Das gekaufte Ticket sollte nicht null sein");
        assertEquals(reihe, ticket.getReihe(), "Die Reihen sollten übereinstimmen");
        assertEquals(platz, ticket.getPlatz(), "Die Plätze sollten übereinstimmen");
    }

    /**
     * 5. Schreiben Sie eine dynamische TestFactory die den Ticketkauf mit zufälligen
     * Werten bombardiert. Der Test soll sicherstellen, dass der Ticketkauf entweder
     * funktioniert oder nur einen der definierten Fehlermeldungen
     * (z.B. new IllegalArgumentException("Nicht ausreichend Geld.")) ausgibt.
     * Die Tests müssen reproduzierbar sein.
     */
    @TestFactory
    List<DynamicTest> testKaufeTicketMitZufaelligenWerten() {
        int testAnzahl = 100; // Anzahl der zufälligen Tests
        long seed = 42; //
        /*
         * Wird verwendet, um Random mit einem Seed zu erstellen. Dies ermöglicht es, die mit Random generierten
         * Zufallswerte reproduzierbar zu machen. Das ist, vor allem mit Tests, die mehrmals ausgeführt werden, wichtig,
         * da diese konstant sein sollten.
         */
        Random random = new Random(seed);
        List<DynamicTest> dynamicTests = new ArrayList<>(); //Liste mit Tests

        for (int i = 0; i < testAnzahl; i++) { //ForSchleife, die, in diesem Fall, 100-mal durchgeführt werden.
            char reihe = (char) ('A' + random.nextInt(4)); // Zufällige Reihen: 'A', 'B', 'C', 'D'
            int platz = random.nextInt(19) + 1; // Zufällige Plätze: 1-20
            float geld = random.nextFloat() * 20; // Zufällige Geldbeträge: 0.0 - 20.0

            /*
             * In jedem Schleifendurchlauf wird ein DynamicTest-Objekt erstellt und mit den Testwerten befüllt.
             * Der erste Parameter des DynamicTests ist der DisplayName, der nach Ablauf des Tests angezeigt und mit
             * den verwendeten Werten befüllt ist. Anschließend werden in einer Lambda-Expression die eigentlichen
             * Tests durchgeführt. Im Try-Block wird geprüft, ob das Ticket korrekt erstellt wurde und nicht "null" ist,
             * ob die Reihe der vorgegebenen entspricht und ob der Platz dem vorgegebenen entspricht. Sollten
             * Exception auftreten, werden diese in den catch-Blöcken gefangen und auf ihre Korrektheit geprüft.
             */
            DynamicTest dynamicTest = DynamicTest.dynamicTest(
                    "Test Ticketkauf mit Reihe: " + reihe + ", Platz: " + platz + ", Geld: " + geld, () -> {

                        try {
                            Ticket ticket = kinoVerwaltung.kaufeTicket(v1, reihe, platz, geld);
                            assertNotNull(ticket, "Das Ticket sollte nicht null sein");
                            assertEquals(reihe, ticket.getReihe());
                            assertEquals(platz, ticket.getPlatz());
                        } catch (IllegalArgumentException e) {
                            assertTrue(e.getMessage().equals("Nicht ausreichend Geld.")
                                            || e.getMessage().startsWith("Der Platz "),
                                    "Unerwartete IllegalArgumentException: " + e.getMessage());
                        } catch (IllegalStateException e) {
                            assertTrue(e.getMessage().startsWith("Der Platz "),
                                    "Unerwartete IllegalStateException: " + e.getMessage());
                        }
                    });

            dynamicTests.add(dynamicTest);
        }

        return dynamicTests;
    }

}
