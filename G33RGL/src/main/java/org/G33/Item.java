package org.G33;

public class Item {

    //W.I.P idea to but pre-defined potion from the beginging but thats for later stage into the project
    /*public enum PotionType {
        Health_Potion, Mana_Potion
    }*/


    private final String potionType;
    private int potionAmmount;

    public Item(String potionType, int potionAmmount) {
        if (potionAmmount < 0) {
            throw new IllegalArgumentException("Potion ammount must be 0 or higher" + potionAmmount);
            //If the ammount is below zero, it should not be created at throw an IAE
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
        if (potionAmmount < 0) {
            throw new IllegalStateException("Something went wrongg, potion used up more than is should had");
            //This scenario shouldn't happen in theory, it only decreases the ammount it has but this is implemented as a "if scenario"-
        }
        this.potionAmmount = potionAmmount;
    }


    public void usePotion(Creature p, Item i) {
        //This if-equals is a temprorary thing, change it later stage of the project but for now it works if you limit to only Health potion
        if (i.potionType.equals("Health")) {
            int tempHP = p.getHitPoints(); //
            int tempRestoreHP = i.getPotionAmmount(); //Bring in the ammount to a temp golder
            int newRestoredHP = tempHP + tempRestoreHP; //Add the ammount of the potion and the players HP together
            p.setHitPoints(newRestoredHP); //Set now the new value from the temp to the player
            int newAmmountLeftOnThePotion = tempRestoreHP - i.potionAmmount; //Decrease the ammount of the potion
            i.setPotionAmmount(newAmmountLeftOnThePotion); //Set the new ammount

        }
    }

    @Override
    public String toString() {
        return "This is a " + getPotionType() + " Potion, with the amount " + getPotionAmmount();
    }
}
