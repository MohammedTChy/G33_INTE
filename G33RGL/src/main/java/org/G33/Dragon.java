package org.G33;

public class Dragon extends Creature {

    int exp = 200;
    int gold = 40;

    public Dragon(int hitPoints, int attackPower, int defensePower) {
        super(hitPoints, attackPower, defensePower);
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        if (exp < 0) {
            exp = 0;
        }
        this.exp = exp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        if (gold < 0) {
            gold = 0;
        }
        this.gold = gold;
    }
}
