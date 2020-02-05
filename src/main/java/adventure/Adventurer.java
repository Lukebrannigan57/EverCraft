package adventure;
import adventure.Attack;


public class Adventurer {

    private final Enum alignment;
    private static int hitPoints;
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
        this.hitPoints = getHitPoints();
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
    public static boolean attackerHit(boolean result) {
        return result;
    }

    public static int getHitPoints() {
        hitPoints = 5;
        if (attackerHit(true)){
            hitPoints = hitPoints - 1;
        }
        return hitPoints;
    }


}
