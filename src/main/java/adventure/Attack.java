package adventure;

public class Attack {

    static int AdventurerAttackRoll = Attacker.getArmorClass() - Adventurer.attackRoll();
    static int AttackerAttackRoll = Adventurer.getArmorClass() - Attacker.attackRoll();
    static boolean successfulAttack;

    public static boolean AdventurerAttack(){
        int attack = AdventurerAttackRoll;
        if(AdventurerAttackRoll < 0){
            successfulAttack = true;
        } else {
            successfulAttack = false;
        }
        return successfulAttack;
    }

    public static boolean AttackerAttack() {
        int attack = AttackerAttackRoll;
        if (AttackerAttackRoll < 0) {
            successfulAttack = true;
        } else {
            successfulAttack = false;
        }
        return successfulAttack;
    }

}
