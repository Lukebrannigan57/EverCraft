package adventure;

public class Attacker {

    private static int hitPoints;
    String type;

    public Attacker(String type) {
        this.type = type;
    }

    public static int attackRoll() {
        int attackRoll = Dice.diceTwenty();
        return attackRoll;
    }

    public String getType() {
        return "Human";
    }

    public int getHitPoints() {
        hitPoints = 5;
        if (adventurerHit(true)){
            hitPoints = hitPoints - 1;
        }
        return hitPoints;
    }

    public static boolean adventurerHit(boolean result) {
        return result;
    }

    public static int getArmorClass() {
        int armorClass = 10;
        return armorClass;
    }
}
