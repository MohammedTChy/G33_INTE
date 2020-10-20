public abstract class Creature {

    private int hitPoints;
    private int attackPower;
    private int defensePower;

    public Creature(int hitPoints, int attackPower, int defensePower) {
        checkHitPointsNotBelowZero(hitPoints);
        this.hitPoints = hitPoints;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        checkHitPointsNotBelowZero(hitPoints);
        this.hitPoints = hitPoints;
    }

    private void checkHitPointsNotBelowZero(int hitPoints) {
        if (hitPoints < 0) {
            throw new IllegalArgumentException("HP less than 0");
        }
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }
}
