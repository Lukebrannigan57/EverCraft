package adventure_test;

import adventure.Adventurer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventurerTest {
    Adventurer underTest;

    @Test
    public void canGetName() {
        underTest = new Adventurer("Olaf", "Evil");
        String expected = underTest.getName();
        assertEquals(expected, "Olaf");
    }

    @Test
    public void canSetName() {
        underTest = new Adventurer("Abigail", "Evil");
        String expected = underTest.getName();
        assertEquals(expected, "Abigail");
    }

    @Test
    public void canSetAlignment() {
        underTest = new Adventurer("Moriarty", "Evil");
        String expected = underTest.getAlignment();
        assertEquals(expected, "Evil");
    }
}
