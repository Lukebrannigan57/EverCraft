import adventure.Dice;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class DiceTest {
    Dice underTest;

    @Test
    public void canRollTwentySideDice() {
        underTest = new Dice();
        boolean expected = (Dice.diceTwenty() > 0 && Dice.diceTwenty() < 21);
        System.out.println(Dice.diceTwenty());
        System.out.println(Dice.diceTwenty());
        assertTrue(expected);

    }
}
