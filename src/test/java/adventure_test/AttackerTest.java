package adventure_test;

import adventure.Attack;
import adventure.Attacker;
import adventure.Dice;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AttackerTest {
    Attacker underTest;
    boolean testAttack;

    @Before
    public void setup(){
        underTest = new Attacker("Human");
    }

    @Test
    public void attackerHasType() {
        String expected = underTest.getType();
        assertEquals(expected, "Human");
    }
    @Test
    public void attackerHasAc() {
        int expected = underTest.getArmorClass();
        assertEquals(expected, 10);
    }

    @Ignore
    @Test
    public void attackerCanBeAttacked(){
        boolean expected = (underTest.getArmorClass() < Dice.diceTwenty());
        System.out.println(Dice.diceTwenty());
        System.out.println(underTest.getArmorClass());

        assertTrue(expected);
    }

    public void attackerCanBeAttackedTwo() {
        testAttack = Attack.AttackerAttack(true);
        boolean expected = 
        assertTrue

    }
}
