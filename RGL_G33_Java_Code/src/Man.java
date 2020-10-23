public class Man extends Creature {

    private int mana = 0;
    private Position mansPosition;
    public Man(int hitPoints, int attackPower, int defensePower,Position mansPosition) {
        super(hitPoints, attackPower, defensePower);
        this.mansPosition=mansPosition;
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
