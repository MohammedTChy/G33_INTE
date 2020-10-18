import java.util.List;

//TODO Fixa att mana regen tillbaka här eller på en annana class.
//TODO antingen göra magic på två olika sätt, antingen göra en magic attack en i taget eller fixa en arrayList(?)
public class Magic {

    private int mana;
    private int manaAmmount;
    private String name;
    //Valde list för det kanske skulle vara enklare och simpelt, fick tips att försöka med list
    private List<Magic> magicBook;



    public Magic (String name, int manaAmmount){
        this.name = name;
        this.manaAmmount = manaAmmount;
    }


    public int getMana() {
        return mana;
    }

    public int getManaAmmount() {
        return manaAmmount;
    }

    public String getName() {
        return name;
    }

    public List<Magic> getMagicBook() {
        return magicBook;
    }


    public void addMagicBook (String name, int manaAmmount)
   {
       magicBook.add(new Magic(name, manaAmmount));
   }






}
