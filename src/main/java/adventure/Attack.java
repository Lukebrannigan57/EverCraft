package adventure;

public class Attack {

    public static boolean adventurerHit;
    public static boolean attackerHit;
//    static int adventurerAttackRoll = Attacker.getArmorClass() - Adventurer.attackRoll();
//    static int attackerAttackRoll = Adventurer.getArmorClass() - Attacker.attackRoll();
    static int attackerAttackRoll;
    static int adventurerAttackRoll;
    static int attackHit = attackerAttackRoll - Adventurer.getArmorClass();

    public static boolean AdventurerAttack(boolean adventurerHit){
        if(adventurerAttackRoll < 0){
            adventurerHit = true;
        } else {
            adventurerHit = false;
        }
        return adventurerHit;
    }

    public static int attackerAttackRoll(int attackerAttackRoll) {
        return attackHit;
    }
    public static boolean AttackerAttack(boolean attackerHit) {
        if (attackHit < 0) {
            attackerHit = true;
        } else {
            attackerHit = false;
        }
        return attackerHit;
    }

}
