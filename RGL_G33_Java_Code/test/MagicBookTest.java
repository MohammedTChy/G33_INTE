import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicBookTest {


   //behöver Göra om testet, behöver idéer om hur jag ska göra det
    @Test
    void testingToPutInMagicBook(){
        MagicBook m = new MagicBook();
        m.addMagicBook("Fire", 10, 15);
        m.addMagicBook("Air", 8, 12);
        m.printOutArrayList();


    }
}