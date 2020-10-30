import java.util.HashMap;
import java.util.Map;

public class Magician extends Creature {

    private final static int DRAGON_EXTRA_DMG = 30;
    private final static int MAGICIAN_PENALTY_DMG = 50;
    private int mana;
    private Map<String, Magic> magicBook = new HashMap<>(); //Sparar spells här

    public Magician(int hitPoints, int attackPower, int defensePower, int mana) {
        super(hitPoints, attackPower, defensePower);
        checkManaNotBelowZero(mana);
        this.mana = mana;
    }

    @Override
    public boolean checkIfResistant(Magic magic) {
        return (magic instanceof Frost || magic instanceof Fire);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        checkManaNotBelowZero(mana);
        this.mana = mana;
    }

    public void addMagic(Magic magic) {
        String magicName = magic.getName();
        if (magicBook.get(magicName) == null) {
            magicBook.put(magic.getName(), magic);
        } else {
            throw new IllegalStateException("Spell already exists");
        }

        //Add the specific class here into the magicBook
    }

    private void dealDamage(Creature creature, boolean isResistant, int damage, int manaCost) {

        if (getMana() >= manaCost) {
            if (isResistant) {
                creature.setHitPoints(creature.getHitPoints() - damage / 2);
            } else {
                creature.setHitPoints(creature.getHitPoints() - damage);
            }
            setMana(getMana() - manaCost);
        }
    }

    public void castMagic(String name, Creature creature) {
        Magic magic = getMagicBook().get(name);
        if (magic != null && creature != null) {
            if (creature instanceof Man) {

                boolean isResistant = creature.checkIfResistant(magic);
                dealDamage(creature, isResistant, magic.getDamage(), magic.getManaCost());

            } else if (creature instanceof Dragon) {

                boolean isResistant = creature.checkIfResistant(magic);
                dealDamage(creature, isResistant, magic.getDamage() + DRAGON_EXTRA_DMG, magic.getManaCost());

            } else if (creature instanceof Magician) {

                boolean isResistant = creature.checkIfResistant(magic);
                dealDamage(creature, isResistant, magic.getDamage() - MAGICIAN_PENALTY_DMG, magic.getManaCost());
            }
        }
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
