package at.itkolleg.ase.tdd.kino;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class KinoVerwaltungTest {

    private List<Vorstellung> vorstellungen = new ArrayList<>();
    private KinoVerwaltung kinoVerwaltung;
    private KinoSaal ks1;
    private LocalDate date1 = LocalDate.now();
    private Vorstellung v1;

    private Zeitfenster zeitfenster = Zeitfenster.ABEND;
    @BeforeEach
    void setUp() {
        Map<Character,Integer> map = new HashMap<>();
        map.put('A',10);
        map.put('B',10);
        map.put('C',15);

        ks1 = new KinoSaal("SuperSaal",map);

        v1 = new Vorstellung(ks1, zeitfenster, date1, "Eragon", 15.99f);

        kinoVerwaltung = new KinoVerwaltung();

        kinoVerwaltung.einplanenVorstellung(v1);
    }

    /**
     * Überprüft, ob in der KinoVerwaltung die mitgegebene Vorstellung vorhanden ist.
     */
    @Test
    void testVorstellungEinplanen() {
        assertTrue(kinoVerwaltung.getVorstellungen().contains(v1));
    }

    /**
     * Überprüft, ob beim Einplanen einer doppelten Vorstellung das entsprechende
     * ErrorHandling ausgeführt wird.
     */
    @Test
    void testVorstellungEinplanenBereitsEingeplant() {
        assertThrows(IllegalArgumentException.class, () -> kinoVerwaltung.einplanenVorstellung(v1));
    }

    /**
     * Überprüft, ob die Größe der Vorstellungs-Liste 1 entspricht
     * und ob die gespeicherte Vorstellung der vorgegebenen entspricht.
     */
    @Test
    void getVorstellungen() {
        assertEquals(1, kinoVerwaltung.getVorstellungen().size());
        assertEquals(v1, kinoVerwaltung.getVorstellungen().get(0));
    }

    /**
     * Hier wird getestet, ob beim Kauf eines Tickets mit zu wenig Geld das entsprechende
     * ErrorHandling ausgeführt wird.
     */
    @Test
    void testKaufeTicketNotEnoughMoney() {
        assertThrows(IllegalArgumentException.class, () -> kinoVerwaltung.kaufeTicket(v1, 'A', 5, 5.0f));
    }

    /**
     * Hier wird getestet, ob beim Kauf eines Tickets mit nicht vorhandenem Sitz das entsprechende
     * ErrorHandling ausgeführt wird.
     */

    @Test
    void testKaufeTicketInvalidSeat() {
        assertThrows(IllegalArgumentException.class, () -> kinoVerwaltung.kaufeTicket(v1,'C', 5, 15.0f));
    }

    /**
     * Hier wird getestet, ob beim Kauf eines Tickets mit bereits vergebenem Sitz das entsprechende
     * ErrorHandling ausgeführt wird.
     */

    @Test
    void testKaufeTicketSeatTaken() {
        kinoVerwaltung.kaufeTicket(v1,'A', 5, 16.0f);
        assertThrows(IllegalStateException.class, () -> kinoVerwaltung.kaufeTicket(v1,'A', 5, 16.0f));
    }

    /**
     * Ein neues Ticket wird über die Kinoverwaltung erstellt. Es wird nun getestet, ob das Ticket nicht "null" ist
     * und ob der im Ticket gespeicherte Saal, das Datum und das Zeitfenster den erwarteten
     * Werten entsprechen.
     */
    @Test
    void testKaufeTicket() {
        Ticket ticket = kinoVerwaltung.kaufeTicket(v1, 'A', 5, 20.0f);
        assertNotNull(ticket);
        assertEquals("SuperSaal", ticket.getSaal());
        assertEquals(zeitfenster, ticket.getZeitfenster());
        assertEquals(date1, ticket.getDatum());
    }
}
