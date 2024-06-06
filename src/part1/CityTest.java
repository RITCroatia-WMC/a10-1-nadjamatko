package part1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CityTest {

    @Test
    public void testToString() {
        // Test toString() method for each enum value
        assertEquals("Courtwald", Woolie.City.COURTWALD.toString());
        assertEquals("Glassdell", Woolie.City.GLASSDELL.toString());
    }

    @Test
    public void testEnumEquality() {
        // Test equality of enum values
        assertSame(Woolie.City.COURTWALD, Woolie.City.COURTWALD);
        assertSame(Woolie.City.GLASSDELL, Woolie.City.GLASSDELL);

        // Test inequality of enum values
        assertNotSame(Woolie.City.COURTWALD, Woolie.City.GLASSDELL);
    }
}
