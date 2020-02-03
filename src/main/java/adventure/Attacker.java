package adventure;

public class Attacker {

    int armorClass;
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
        return 5;
    }

    public static int getArmorClass() {
        int armorClass = 10;
        return armorClass;
    }
}
