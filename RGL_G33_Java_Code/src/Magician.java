public class Magician extends Creature {

    private int mana;

    public Magician(int hitPoints, int attackPower, int defensePower, int mana) {
        super(hitPoints, attackPower, defensePower);
        checkManaNotBelowZero(mana);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        checkManaNotBelowZero(mana);
        this.mana = mana;
    }

    private void checkManaNotBelowZero(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("Mana less than 0");
        }
    }

    @Override
    public String toString() {
        return "HP: " + getHitPoints() +
                ", Attack: " + getAttackPower() + ", Defense: " + getDefensePower() + ", Mana: " + getMana();
    }
}
