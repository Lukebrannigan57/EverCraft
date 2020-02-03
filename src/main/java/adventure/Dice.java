package adventure;

public class Dice {

    public static int diceTwenty() {
        int twentySides = 20;
        int rollTwenty = (int) (Math.random() * twentySides) + 1;
        return rollTwenty;

    }
}
