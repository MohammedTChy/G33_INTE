import java.util.List;


public class Magic {

    //Mana might be removed from here and implemeneted eleswhere
    private int mana;
    private int manaCost;
    private final String name;
    private int damage;


    public Magic(String name, int manaCost, int damage) {
        if (manaCost < 0 || damage < 0) {
            throw new IllegalStateException("Must have a name, manacost/damage must be either 0 or above");
            //Might need to seperate out each variable, anything below zero is not accepted,
        }
        this.name = name;
        this.manaCost = manaCost;
        this.damage = damage;


    }

    //Find out what this spell can do kind of damage
    public int getDamage() {
        return damage;
    }

    public int getMana() {
        return mana;
    }

    //To find out how much mana it will cost to use this spell
    public int getManaCost() {
        return manaCost;
    }

    //Ras, klass och special item kan påverka manacost
    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    //Ras, klass och special item kan påverka damagae
    public void setDamage(int damage) {
        this.damage = damage;
    }

    //name of the spell
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name = " + getName() + ", ManaCost = " + getManaCost() + ", Damage = " + getDamage();
    }
}
