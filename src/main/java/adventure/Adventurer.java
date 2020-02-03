package adventure;

public class Adventurer {


    private final Enum alignment;
    String name;

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

    public int getArmorClass() {
        return 10;
    }

    public int getHitPoints() {
        return 5;
    }
}
