public class Item {

    //W.I.P idea
    /*public enum PotionType {
        Health_Potion, Mana_Potion
    }*/


    private final String potionType;
    private int potionAmmount;

    public Item(String potionType, int potionAmmount) {
        if (potionAmmount < 0) {
            throw new IllegalArgumentException("Potion ammount must be 0 or higher" + potionAmmount);
        }
        this.potionType = potionType;
        this.potionAmmount = potionAmmount;
    }


    public String getPotionType() {
        return potionType;
    }

    public int getPotionAmmount() {
        return potionAmmount;
    }

    public void setPotionAmmount(int potionAmmount) {
        this.potionAmmount = potionAmmount;
    }

    //Potion interaktion, inte nöjd men en början, har ej fixat mana då den inte finns med
    //Idéen är att den kollar vilken typ av potion det är, tar den potion och adderar upp, kollar ej limit, då det finns inte för tilfället med att lägga det.
    public void usePotion(Player p, Item i) {
        if (i.potionType.equals("Health")) {
            int hP = p.getHitPoints();
            int restoreHp = i.getPotionAmmount();
            int addHp = hP + restoreHp;
            p.setHitPoints(addHp);
            int newAmmountLeftOnThePotion = restoreHp - i.potionAmmount;
            i.setPotionAmmount(newAmmountLeftOnThePotion);

        }
    }

    @Override
    public String toString() {
        return "This is a " + getPotionType() + " Potion, with the amount " + getPotionAmmount();
    }
}
