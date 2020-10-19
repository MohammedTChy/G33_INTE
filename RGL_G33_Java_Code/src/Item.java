public class Item {

    //W.I.P idea
    /*public enum PotionType {
        Health_Potion, Mana_Potion
    }*/


    private final String potionType;
    private int potionAmmount;

    public Item(String potionType, int potionAmmount) {
        if(potionAmmount < 0){
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

    //Potion interaktion, inte nöjd men en början, har ej fixat mana då den inte finns med
    //Idéen är att den kollar vilken typ av potion det är, tar den potion och adderar upp, kollar ej limit, då det finns inte för tilfället med att lägga det.
    public void usePotion(Player player, Item item) {
        if (item.potionType.equals("Health")) {
            int hP = player.getHitPoints();
            int restoreHp = item.getPotionAmmount();
            int addHp = hP + restoreHp;
            player.setHitPoints(addHp);
        }
    }

    @Override
    public String toString() {
        return "This is a  " + getPotionType() + " Potion, with the ammount "+ getPotionAmmount();
    }
}
