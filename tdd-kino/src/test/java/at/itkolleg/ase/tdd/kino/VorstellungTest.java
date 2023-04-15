package at.itkolleg.ase.tdd.kino;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VorstellungTest {
    private Vorstellung vorstellung;
    private KinoSaal kinoSaal;
    private Map<Character, Integer> reihen;
    private LocalDate date;
    private Zeitfenster zeitfenster = Zeitfenster.ABEND;

    /**
     * Wird vor jedem Test ausgeführt -
     * es wird ein neuer Saal mit Reihen und eine Vorstellung zum Testen erstellt.
     */
    @BeforeEach
    void setUp() {
        reihen = new HashMap<>();
        reihen.put('A', 10);
        reihen.put('B', 12);
        kinoSaal = new KinoSaal("Test Saal", reihen);
        date = LocalDate.of(2023, 4, 15);
        vorstellung = new Vorstellung(kinoSaal, zeitfenster, date, "Test Film", 10.0f);
    }

    /**
     * Es wird getestet, ob der in der Vorstellung gespeicherte Film dem erwarteten Wert entspricht.
     */
    @Test
    void testGetFilm() {
        assertEquals("Test Film", vorstellung.getFilm());
    }

    /**
     * Es wird getestet, ob der in der Vorstellung gespeicherte Kinosaal dem erwarteten Wert entspricht.
     */
    @Test
    void testGetSaal() {
        assertEquals(kinoSaal, vorstellung.getSaal());
    }

    /**
     * Es wird getestet, ob das in der Vorstellung gespeicherte Zeitfenster dem erwarteten Wert entspricht.
     */
    @Test
    void testGetZeitfenster() {
        assertEquals(zeitfenster, vorstellung.getZeitfenster());
    }

    /**
     * Es wird getestet, ob das in der Vorstellung gespeicherte Datum dem erwarteten Wert entspricht.
     */
    @Test
    void testGetDatum() {
        assertEquals(date, vorstellung.getDatum());
    }

    /**
     * Ein neues Ticket wird erstellt. Es wird nun getestet, ob das Ticket nicht "null" ist
     * und ob der im Ticket gespeicherte Saal, das Datum und das Zeitfenster den erwarteten
     * Werten entsprechen.
     */
    @Test
    void testKaufeTicket() {
        Ticket ticket = vorstellung.kaufeTicket('A', 5, 15.0f);
        assertNotNull(ticket);
        assertEquals("Test Saal", ticket.getSaal());
        assertEquals(date, ticket.getDatum());
        assertEquals(zeitfenster, ticket.getZeitfenster());
    }

    /**
     * Hier wird getestet, ob beim Kauf eines Tickets mit zu wenig Geld das entsprechende
     * ErrorHandling ausgeführt wird.
     */
    @Test
    void testKaufeTicketNotEnoughMoney() {
        assertThrows(IllegalArgumentException.class, () -> vorstellung.kaufeTicket('A', 5, 5.0f));
    }

    /**
     * Hier wird getestet, ob beim Kauf eines Tickets mit nicht vorhandenem Sitz das entsprechende
     * ErrorHandling ausgeführt wird.
     */

    @Test
    void testKaufeTicketInvalidSeat() {
        assertThrows(IllegalArgumentException.class, () -> vorstellung.kaufeTicket('C', 5, 15.0f));
    }

    /**
     * Hier wird getestet, ob beim Kauf eines Tickets mit bereits vergebenem Sitz das entsprechende
     * ErrorHandling ausgeführt wird.
     */

    @Test
    void testKaufeTicketSeatTaken() {
        vorstellung.kaufeTicket('A', 5, 15.0f);
        assertThrows(IllegalStateException.class, () -> vorstellung.kaufeTicket('A', 5, 15.0f));
    }

    /**
     * Hier wird eine neue Vorstellung mit denselben Informationen der Testvorstellung erstellt. Beide werden
     * verglichen und der Test sollte dadurch positiv ausfallen.
     */
    @Test
    void testEquals() {
        Vorstellung otherVorstellung = new Vorstellung(kinoSaal, zeitfenster, date, "Test Film", 10.0f);
        assertEquals(vorstellung, otherVorstellung);
    }

    /**
     * Hier wird eine neue Vorstellung mit anderem Zeitfenster, verglichen mit der Testvorstellung, erstellt. Beide werden
     * verglichen und der Test sollte dadurch positiv ausfallen.
     */
    @Test
    void testNotEquals() {
        Vorstellung otherVorstellung = new Vorstellung(kinoSaal, Zeitfenster.NACHT, date, "Test Film", 10.0f);
        assertNotEquals(vorstellung, otherVorstellung);
    }
}
