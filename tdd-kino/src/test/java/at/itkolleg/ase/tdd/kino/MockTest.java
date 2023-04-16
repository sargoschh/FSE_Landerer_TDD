package at.itkolleg.ase.tdd.kino;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class MockTest {

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

    }
}
