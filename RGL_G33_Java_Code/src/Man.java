public class Man extends Creature {

    private int mana = 0;
    private Position mansPosition;//plz dont chng it change this method, it was created to interact with map.
    public Man(int hitPoints, int attackPower, int defensePower) {
        super(hitPoints, attackPower, defensePower);
    }

    public int getMana() {
        return mana;
    }

    public Position getMansPosition() {  // plz dont chng it change this method, it was created to interact with map.
        return mansPosition;
    }

    public void setMansPosition(Position mansPosition) {//plz dont chng it change this method, it was created to interact with map.
        this.mansPosition = mansPosition;
    }

    @Override
    public String toString() {
        return "HP: " + getHitPoints() +
                ", Attack: " + getAttackPower() + ", Defense: " + getDefensePower();
    }
}
