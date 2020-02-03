package adventure_test;

import adventure.Attacker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AttackerTest {
    Attacker underTest;


    @Test
    public void attackerHasType() {
        underTest = new Attacker("Human");
        String expected = underTest.getType();
        assertEquals(expected, "Human");


    }
}
