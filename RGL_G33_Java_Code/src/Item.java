public class Item {

    public enum PotionType{
        Health_Potion, Mana_Potion
    }

    private final String name;
    private final PotionType potionType;
    private int potionAmmount;

    public Item (String name, PotionType potionType, int potionAmmount){
        this.name = name;
        this.potionType = potionType;
        this.potionAmmount = potionAmmount;
    }

    public String getName() {
        return name;
    }

    public PotionType getPotionType() {
        return potionType;
    }

    public int getPotionAmmount() {
        return potionAmmount;
    }

    //Potion interaktion, inte nöjd men en början, har ej fixat mana då den inte finns med
    public void usePotion(Player player, Item item){
        if(item.potionType.equals("Health_Potion")){
            int hP = player.getHitPoints();
            int restoreHp = item.getPotionAmmount();
            int addHp = hP + restoreHp;
            player.setHitPoints(addHp);
        }
    }
}
