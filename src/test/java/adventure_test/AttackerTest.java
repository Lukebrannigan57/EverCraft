package adventure_test;

import adventure.Adventurer;
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
    Attack underTest2;
    boolean testAttack = Attack.AttackerAttack(true);;

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

    @Ignore //ignored as the test is the code
    @Test
    public void attackerCanBeAttacked(){
        boolean expected = (underTest.getArmorClass() < Dice.diceTwenty());
        System.out.println(Dice.diceTwenty());
        System.out.println(underTest.getArmorClass());

        assertTrue(expected);
    }

    @Ignore //ignored as based on a random boolean
    @Test
    public void attackerCanBeAttackedTwo() {
        System.out.println(testAttack);
        assertTrue(testAttack);
    }

    @Test
    public void adventurerCanTakeDamage() {
        Attacker.adventurerHit(true);
        int expected = underTest.getHitPoints();
        assertEquals(expected, 4);
    }


}
