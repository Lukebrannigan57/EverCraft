package adventure;

public class Adventurer {

    String name;
    String alignment;

<<<<<<< Updated upstream
    public Adventurer(String name, String alignment) {
=======
    public enum alignment{
        GOOD,
        NEUTRAL,
        EVIL
    };

    public Adventurer(String name, Enum alignment) {
>>>>>>> Stashed changes
        this.name = name;
        this.alignment = alignment;

    }

    public String getName() {
        return name;
    }

    public String getAlignment() {
        return alignment;
    }

    public int getArmorClass() {
        return 10;
    }

    public int getHitPoints() {
        return 5;
    }
}
