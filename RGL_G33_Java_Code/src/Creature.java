public abstract class Creature {

    private int hitPoints;
    private int attackPower;
    private int defensePower;
    private Position mansPosition;//plz dont chng it change this method, it was created to interact with map.
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

    public Position getMansPosition() {  // plz dont chng it change this method, it was created to interact with map.
        return mansPosition;
    }

    public void setMansPosition(Position mansPosition) {//plz dont chng it change this method, it was created to interact with map.
        this.mansPosition = mansPosition;
    }


    public int getAttackPower() {
        return attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }
}
