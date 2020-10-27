import java.util.ArrayList;
import java.util.List;


public class MagicBook {
    //using new List<>() works too, decied to go with ArrayList though
    //added static Magic before hand is possible, did not do it mainly because of not needed to yet
    private List<Magic> magicBook = new ArrayList<>();

    //Call on this to get the entire list of spells in the book.
    /*public List<Magic> getMagicBook() {
        return magicBook;
    }*/


    public void addMagicBook(String name, int manaCost, int damage) {
        magicBook.add(new Magic(name, manaCost, damage) {
            public void checkIfResistOrWeak(Creature creature) {

            }
        });
    }

    //Primitivt sätt att kolla vad som finns i magicbook, behöver bättre lösning
    public String printOutArrayList() {
        StringBuffer sb = new StringBuffer();
        for (Magic print : magicBook) {
            sb.append(print);
            sb.append(", ");
            //NOTE at every entry in the Arraylist is added with ", " with the space at the end of the entry, rememeber that
        }
        return sb.toString();
    }
}
