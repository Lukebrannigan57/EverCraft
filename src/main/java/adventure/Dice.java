package adventure;

public class Dice {
    public static int diceTwenty(){
        int sides = 20;
        int roll = (int) (Math.random() * sides) + 1;
        return roll;
    }
}
