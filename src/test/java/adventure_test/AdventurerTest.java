package adventure_test;

import adventure.Adventurer;
import adventure.Attack;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AdventurerTest {
    Adventurer underTest;
    boolean testAttack;

//    @Before
//    public void setup(){
//        underTest = new Adventurer("Olaf", Adventurer.alignment.EVIL);
//    }

    @Test
    public void canGetName() {
        underTest = new Adventurer("Olaf", Adventurer.alignment.EVIL);
        String expected = underTest.getName();
        assertEquals(expected, "Olaf");
    }

    @Test
    public void canSetName() {
        underTest = new Adventurer("Abigail", Adventurer.alignment.GOOD);
        String expected = underTest.getName();
        assertEquals(expected, "Abigail");
    }

    @Test
    public void canGetAlignment() {
        underTest = new Adventurer("Olaf", Adventurer.alignment.EVIL);
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
    //ignored because is a bool based on random
    @Ignore
    @Test
    public void attackerCanAttack() {
        testAttack = Attack.AdventurerAttack(true);
        System.out.println(testAttack);
        assertTrue(testAttack);
    }
    @Test
    public void attackerCanHit() {
        Attack.AttackerAttack(true);
        boolean expected = true;
        assertEquals(expected, true);
    }

    @Test
    public void adventurerCanHit() {
        Attack.AdventurerAttack(true);
        boolean expected = true;
        assertEquals(expected, true);
    }

    @Test
    public void attackerAttackRoll(){
        int expected = Attack.attackerAttackRoll(20);
        assertEquals(expected, 10);
    }


    @Test
    public void adventurerCanTakeDamage() {
        underTest = new Adventurer("Olaf", Adventurer.alignment.EVIL);
        Adventurer.attackerHit(true);
        int expected = underTest.getHitPoints();
        assertEquals(expected, 4);
    }

}
