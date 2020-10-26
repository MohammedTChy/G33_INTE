public class Fire extends Magic {

    private static final String nameFire = "Fire";


    public Fire (int manaCost, int damage){
        super(nameFire, manaCost, damage);
        setFire(true);

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
