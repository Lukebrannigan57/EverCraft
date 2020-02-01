package adventure_test;

import adventure.Adventurer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventurerTest {
    Adventurer underTest;

    @Test
    public void canGetName() {
        underTest = new Adventurer("Olaf", Adventurer.alignment.EVIL);
        String expected = underTest.getName();
        assertEquals(expected, "Olaf");
    }

    @Test
    public void canSetName() {
        underTest = new Adventurer("Abigail", Adventurer.alignment.EVIL);
        String expected = underTest.getName();
        assertEquals(expected, "Abigail");
    }

    @Test
    public void canGetAlignment() {
        underTest = new Adventurer("Moriarty", Adventurer.alignment.EVIL);
        Enum expected = underTest.getAlignment();
        assertEquals(expected, Adventurer.alignment.EVIL);
    }

    @Test
    public void canSetAlignment() {
        underTest = new Adventurer("Karl Marx", Adventurer.alignment.GOOD);
        Enum expected = underTest.getAlignment();
        assertEquals(expected, Adventurer.alignment.GOOD);
    }

    @Test
    public void canGetArmorClass() {
        underTest = new Adventurer("Joan of Arc", Adventurer.alignment.GOOD);
        int expected = underTest.getArmorClass();
        assertEquals(expected, 10);
    }

    @Test
    public void canGetHitPoints() {
        underTest = new Adventurer("John Brown", Adventurer.alignment.GOOD);
        int expected = underTest.getHitPoints();
        assertEquals(expected, 5);
    }
}
