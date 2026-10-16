

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Die Test-Klasse TestStuhl.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */

public class TestStuhl
{
    // Höhe 10: zu niedrig
    @Test
    public void test_setHoehe_zuNiedrig()
    {
        Stuhl s;
        s = new Stuhl("Rot", 10, false);

        assertEquals(20, s.getHoehe());
    }

    // Höhe 80: gültig
    @Test
    public void test_setHoehe_OK()
    {
        Stuhl s;
        s = new Stuhl("Blau", 80, true);

        assertEquals(80, s.getHoehe());
    }

    // Höhe 150: zu hoch
    @Test
    public void test_setHoehe_zuHoch()
    {
        Stuhl s;
        s = new Stuhl("Grün", 150, false);

        assertEquals(20, s.getHoehe());
    }

    // Höhe 20: untere Grenze
    @Test
    public void test_setHoehe_GrenzeUnten()
    {
        Stuhl s;
        s = new Stuhl("Schwarz", 20, false);

        assertEquals(20, s.getHoehe());
    }

    // Höhe 120: obere Grenze
    @Test
    public void test_setHoehe_GrenzeOben()
    {
        Stuhl s;
        s = new Stuhl("Weiß", 120, true);

        assertEquals(120, s.getHoehe());
    }
}