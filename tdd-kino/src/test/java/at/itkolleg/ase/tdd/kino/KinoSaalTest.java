package at.itkolleg.ase.tdd.kino;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class KinoSaalTest {
    private KinoSaal kinoSaal;
    private Map<Character, Integer> reihen;

    /**
     * Wird vor jedem Test ausgeführt - es wird ein neuer Saal mit Reihen zum Testen erstellt.
     */
    @BeforeEach
    void setUp() {
        reihen = new HashMap<>();
        reihen.put('A', 10);
        reihen.put('B', 12);
        kinoSaal = new KinoSaal("BaumSaal", reihen);
    }

    /**
     * Es wird getestet, ob getName() den erwarteten Wert zurückgibt.
     */
    @Test
    void testGetName() {
        assertEquals("BaumSaal", kinoSaal.getName());
    }

    /**
     * Es wird getestet, ob true zurückkommt, wenn tatsächlich vorhandene Plätze geprüft werden.
     */
    @Test
    void testPruefePlatzValid() {
        assertTrue(kinoSaal.pruefePlatz('A', 5));
        assertTrue(kinoSaal.pruefePlatz('B', 12));
    }

    /**
     * Es wird getestet, ob false zurückkommt, wenn nicht vorhandene Reihen geprüft werden.
     */
    @Test
    void testPruefePlatzInvalidReihe() {
        assertFalse(kinoSaal.pruefePlatz('C', 5));
    }

    /**
     * Es wird getestet, ob false zurückkommt, wenn nicht vorhandene Plätze in vorhandenen Reihen geprüft werden.
     */
    @Test
    void testPruefePlatzInvalidPlatz() {
        assertFalse(kinoSaal.pruefePlatz('A', 11));
        assertFalse(kinoSaal.pruefePlatz('A', 0));
    }

    /**
     * Hier wird ein neuer Saal mit denselben Reihen und Namen, wie der Testsaal erstellt. Beide werden
     * verglichen und der Test sollte dadurch positiv ausfallen.
     */
    @Test
    void testEquals() {
        KinoSaal otherKinoSaal = new KinoSaal("BaumSaal", reihen);
        assertEquals(kinoSaal, otherKinoSaal);
    }

    /**
     * Hier wird ein neuer Saal mit denselben Reihen und anderem Namen, wie der Testsaal erstellt. Beide werden
     * verglichen und der Test sollte dadurch wieder positiv ausfallen, da auf "notEquals" überprüft wird.
     */
    @Test
    void testNotEquals() {
        KinoSaal otherKinoSaal = new KinoSaal("SteinSaal", reihen);
        assertNotEquals(kinoSaal, otherKinoSaal);
    }
}
