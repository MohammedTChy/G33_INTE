public class Dragon extends Creature {

    public static final int SUPER_ATTACK_DMG = 400;

    @Override
    public boolean checkIfResistant(Magic magic) {
        return magic instanceof Fire;
    }

    public Dragon(int hitPoints, int attackPower, int defensePower) { super(hitPoints, attackPower, defensePower);
    }

}
