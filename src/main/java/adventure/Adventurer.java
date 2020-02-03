package adventure;

public class Adventurer {


    private final Enum alignment;
    String name;

    public static int attackRoll() {
        int attackRoll = Dice.diceTwenty();
        return attackRoll;
    }

    public enum alignment{
        GOOD,
        NEUTRAL,
        EVIL
    };

    public Adventurer(String name, Enum alignment) {
        this.name = name;
        this.alignment = alignment;
    }

    public String getName() {
        return name;
    }

    public Enum getAlignment() {
        return alignment;
    }

    public static int getArmorClass() {
        return 10;
    }

    public int getHitPoints() {
        return 5;
    }
}
