public class Frost extends Magic {


    private static final String nameFrost = "Frost";


    public Frost (int manaCost, int damage){
        super(nameFrost, manaCost, damage);
        setFrost(true);

    }

    @Override
    public void checkIfResistOrWeak(Creature creature) {
        int damage = getDamage();
        //Idea is to check if the creature is weak or resisting against the elemen
        //If statement here to check if its immun
        //Then damage is  zero

        //else the damage is multiplied

    }//Wrtie the combat code here on how it should react
}
