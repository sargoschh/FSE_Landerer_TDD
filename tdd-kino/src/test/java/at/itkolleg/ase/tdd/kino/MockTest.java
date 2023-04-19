package at.itkolleg.ase.tdd.kino;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class MockTest {

    @Mock
    private Ticket ticket;
    @Mock
    private KinoSaal kinoSaalMock;
    @Mock
    private Vorstellung vorstellungMock;
    @Mock
    private KinoVerwaltung kinoVerwaltungMock;

    @Test
    void testKinoSaal() {
        Mockito.when(kinoSaalMock.pruefePlatz('A', 15)).thenReturn(true);
        assertTrue(kinoSaalMock.pruefePlatz('A', 15));

        Mockito.when(kinoSaalMock.pruefePlatz('A', 20)).thenReturn(false);
        assertFalse(kinoSaalMock.pruefePlatz('A', 20));

        Mockito.when(kinoSaalMock.getName()).thenReturn("ThrillerSaal");
        assertEquals("ThrillerSaal", kinoSaalMock.getName());
    }

    @Test
    void testVorstellung() {
        Mockito.when(vorstellungMock.getFilm()).thenReturn("SuperMarioFilm");
        assertEquals("SuperMarioFilm", vorstellungMock.getFilm());

        Mockito.when(vorstellungMock.getSaal()).thenReturn(kinoSaalMock);
        assertEquals(kinoSaalMock, vorstellungMock.getSaal());

        LocalDate date = LocalDate.now();
        Mockito.when(vorstellungMock.getDatum()).thenReturn(date);
        assertEquals(date, vorstellungMock.getDatum());

        Mockito.when(vorstellungMock.getZeitfenster()).thenReturn(Zeitfenster.NACHT);
        assertEquals(Zeitfenster.NACHT, vorstellungMock.getZeitfenster());

        Mockito.when(vorstellungMock.kaufeTicket('A', 15, 20.0f)).thenReturn(ticket);
        assertEquals(ticket, vorstellungMock.kaufeTicket('A', 15, 20.0f));
    }

    @Test
    void testKinoVerwaltung() {
        assertThrows(IndexOutOfBoundsException.class, () -> kinoVerwaltungMock.getVorstellungen().get(0));

        assertEquals(0, kinoVerwaltungMock.getVorstellungen().size());

        Mockito.when(kinoVerwaltungMock.kaufeTicket(vorstellungMock, 'A', 15, 20.0f)).thenReturn(ticket);
        assertEquals(ticket, kinoVerwaltungMock.kaufeTicket(vorstellungMock, 'A', 15, 20.0f));
    }
}
