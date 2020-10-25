public abstract class Creature {

    private int hitPoints;
    private int attackPower;
    private int defensePower;
    private int maxHealth;

    public Creature(int hitPoints, int attackPower, int defensePower) {
        checkHitPointsNotBelowZero(hitPoints);
        this.hitPoints = hitPoints;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.maxHealth = hitPoints + 500;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        checkHitPointsNotBelowZero(hitPoints);
        if (maxHealth <= hitPoints) {
            this.hitPoints = maxHealth;
        }
        if (maxHealth >= hitPoints) {
            this.hitPoints = hitPoints;
        }
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setNewMaxHealth(int newMaxHealth) {
        this.maxHealth += newMaxHealth;
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
