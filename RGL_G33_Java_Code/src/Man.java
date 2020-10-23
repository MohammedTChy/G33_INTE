public class Man extends Creature {

    private int mana = 0;
    public Man(int hitPoints, int attackPower, int defensePower) {
        super(hitPoints, attackPower, defensePower);
    }

    public int getMana() {
        return mana;
    }


    @Override
    public String toString() {
        return "HP: " + getHitPoints() +
                ", Attack: " + getAttackPower() + ", Defense: " + getDefensePower();
    }
}
