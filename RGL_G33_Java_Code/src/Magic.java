import java.util.List;

//TODO Fixa att mana regen tillbaka här eller på en annana class.
//TODO antingen göra magic på två olika sätt, antingen göra en magic attack en i taget eller fixa en arrayList(?)
public class Magic {

    private int mana;
    private int manaCost;
    private String name;
    private int damage;





    public Magic (String name, int manaCost, int damage){
        this.name = name;
        this.manaCost = manaCost;
        this.damage = damage;

    }

    public int getDamage() {
        return damage;
    }

    public int getMana() {
        return mana;
    }

    public int getManaCost() {
        return manaCost;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name = " + getName() + ", ManaCost = " + getManaCost() + ", Damage = "+getDamage();
    }
}
