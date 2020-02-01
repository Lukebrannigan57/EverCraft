package adventure_test;

import adventure.Adventurer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventurerTest {
    Adventurer underTest;

    @Test
    public void canGetName() {
        underTest = new Adventurer("Olaf");
        String expected = underTest.getName();
        assertEquals(expected, "Olaf");

    }
}
