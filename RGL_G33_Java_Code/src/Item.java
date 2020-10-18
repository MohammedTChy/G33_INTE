public class Item {

    //W.I.P idea
    /*public enum PotionType {
        Health_Potion, Mana_Potion
    }*/

    private final String name;
    private final String potionType;
    private int potionAmmount;

    public Item(String name, String potionType, int potionAmmount) {
        this.name = name;
        this.potionType = potionType;
        this.potionAmmount = potionAmmount;
    }

    public String getName() {
        return name;
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
        if (item.potionType.equals("Health Potion")) {
            int hP = player.getHitPoints();
            int restoreHp = item.getPotionAmmount();
            int addHp = hP + restoreHp;
            player.setHitPoints(addHp);
        }
    }
}
