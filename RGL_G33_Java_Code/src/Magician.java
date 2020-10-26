
import java.util.HashMap;
import java.util.Map;

public class Magician extends Creature {

    private int mana;
    private Map<String, Magic> magicBook = new HashMap<>(); //Sparar spells här


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

    public void addMagic(Magic magic) {
        magicBook.put(magic.getName(), magic);
        //Add the specific class here into the magicBook
    }

    public void castMagic(String name, Creature creature) {
        getMagicBook().get(name).checkIfResistOrWeak(creature);
        //get the magic skill to use on the creature and check if that creature has a resist or weakness to the element
        //Maybe redo this one but this is just a rough scetch of an idea
    }

    public Map<String, Magic> getMagicBook() {
        return magicBook;
    }

    /*public void manaChange(int amount){
        mana += amount;
        checkManaNotBelowZero(mana);
    }*/

    private void checkManaNotBelowZero(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("Mana less than 0");
        }
    }



    @Override
    public String toString() {
        return "HP: " + getHitPoints() + ", Attack: " + getAttackPower() + ", Defense: " + getDefensePower() + ", Mana: " + getMana();
    }
}
