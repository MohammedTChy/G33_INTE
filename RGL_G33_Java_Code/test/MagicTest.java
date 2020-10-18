import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicTest {



    @Test
    void getMethodTestTheNameOfTheMagic(){
        Magic m = new Magic("Fireball", 10, 5);
        assertEquals("Fireball",m.getName());
    }

    @Test
    void getMethodTestostOfTheMagic(){
        Magic m = new Magic("Fireball", 10, 5);
        assertEquals(10,m.getManaCost());
    }

    @Test
    void getMethodTestOutputOfTheMagic(){
        Magic m = new Magic("Fireball", 10, 5);
        assertEquals(10,m.getManaCost());
    }

}