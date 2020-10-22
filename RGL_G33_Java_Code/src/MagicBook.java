import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicBook {

    //Funderar på att göra det till en static list

    //Arraylist fungerar också
    private List<Magic> magicBook = new ArrayList<>();

    public List<Magic> getMagicBook() {
        return magicBook;
    }

    public void addMagicBook(String name, int manaCost, int damage) {
        magicBook.add(new Magic(name, manaCost, damage));


    }


    //Primitivt sätt att kolla vad som finns i magicbook, behöver bättre lösning
    public String printOutArrayList() {
        StringBuffer sb = new StringBuffer();
        for (Magic s : magicBook) {
            sb.append(s);
            sb.append(", ");
            //NOTE at every entry in the Arraylist is added with ", " with the space at the end of the entry, rememeber that
        }
        return sb.toString();
    }


}
