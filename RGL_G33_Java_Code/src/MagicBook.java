import java.util.ArrayList;
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


    public void printOutArrayList() {
        System.out.println(getMagicBook());
    }

}
