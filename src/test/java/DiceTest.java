import adventure.Dice;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class DiceTest {

    Dice underTest;
    @Test
    public void canGetRollBetweenOneAndTwenty() {
        underTest = new Dice();
        boolean expected = (Dice.diceTwenty() > 0 && Dice.diceTwenty() < 21);
        System.out.println(Dice.diceTwenty());
        System.out.println(Dice.diceTwenty());
        assertTrue(expected);

    }
}
