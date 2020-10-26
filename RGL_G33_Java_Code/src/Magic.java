import java.util.List;


public abstract class Magic {

    //Mana might be removed from here and implemeneted eleswhere
    private int manaCost;
    private final String name;
    private int damage;
    private boolean fire = false;
    private boolean frost = false;


    public Magic(String name, int manaCost, int damage) {
        if (manaCost < 0 || damage < 0) {
            throw new IllegalArgumentException("Must have a name, manacost/damage must be either 0 or above");
            //Might need to seperate out each variable, anything below zero is not accepted, however, they way its setup with OR works too.
        }
        this.name = name;
        this.manaCost = manaCost;
        this.damage = damage;
    }


    public abstract void checkIfResistOrWeak(Creature creature);//Use magic spells from the character

    public boolean isFire() {
        return fire;
    }

    public boolean isFrost() {
        return frost;
    }

    public void setFire(boolean fire) {
        this.fire = fire;
    }

    public void setFrost(boolean frost) {
        this.frost = frost;
    }

    //Find out what this spell can do kind of damage
    public int getDamage() {
        return damage;
    }

    //To find out how much mana it will cost to use this spell
    public int getManaCost() {
        return manaCost;
    }

    //Ras, klass och special item kan påverka manacost
    public void setManaCost(int manaCost) {
        if (manaCost < 0) {
            manaCost = 0;
        }//Auto adjust manaCost to zero if it drops below zero because of skills/ability/items
        this.manaCost = manaCost;
    }

    //Ras, klass och special item kan påverka damagae
    public void setDamage(int damage) {
        if (damage < 0) {
            damage = 0;
        }//Auto adjust damage to zero if it drops below zero because of skills/ability/items/debuffer
        this.damage = damage;
    }//Maybe change from zero to 1 damage, but thats for later if neeeded

    //name of the spell
    public String getName() {
        return name;
    }

    //toString method to show/know how it should me presented/saved
    @Override
    public String toString() {
        return "Name = " + getName() + ", ManaCost = " + getManaCost() + ", Damage = " + getDamage();
    }
}
