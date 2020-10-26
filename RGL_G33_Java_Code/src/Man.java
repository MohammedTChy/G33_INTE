public class Man extends Creature {

    private int mana = 0;

    public enum SwordType {
        Iron, Steel, Mithril;
    }

    private SwordType swordType;
    
    public Man(int hitPoints, int attackPower, int defensePower) {
        super(hitPoints, attackPower, defensePower);
    }

    public Man(int hitPoints, int attackPower, int defensePower, SwordType swordType) {
        super(hitPoints, attackPower, defensePower);
        this.swordType = swordType;
    }

    public SwordType getSwordType() {
        return swordType;
    }

    public void setSwordType(SwordType swordType) {
        this.swordType = swordType;
    }

    @Override
    public int getAttackPower() {
        if (swordType != null) {
            return super.getAttackPower() + swordStrength();
        }
        else return super.getAttackPower();
    }

    private int swordStrength() {
        int swordStrength;
        switch (swordType) {
            case Iron:
                swordStrength = 15;
                break;
            case Steel:
                swordStrength = 25;
                break;
            case Mithril:
                swordStrength = 50;
                break;
            default:
                swordStrength = 0;
        }
        return swordStrength;
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
