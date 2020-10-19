import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicTest {


    @Test
    void getMethodTestTheNameOfTheMagic() {
        Magic m = new Magic("Fireball", 10, 5);
        assertEquals("Fireball", m.getName());
    }

    @Test
    void getMethodTestostOfTheMagic() {
        Magic m = new Magic("Fireball", 10, 5);
        assertEquals(10, m.getManaCost());
    }

    @Test
    void getMethodTestOutputOfTheMagic() {
        Magic m = new Magic("Fireball", 10, 5);
        assertEquals(10, m.getManaCost());
    }

    @Test
    void manaCostThrowIAENegativeOne() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Magic("Flash", -1, 0);
        });
    }

    @Test
    void damageThrowIAENegativeOne() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Magic("Flash", 0, -1);
        });
    }

    @Test
    void toStringFormatForTheMagic() {
        Magic m = new Magic("Flash", 1, 1);
        assertEquals("Name = Flash, ManaCost = 1, Damage = 1", m.toString());
    }

    @Test
    void zeroBeingAcceptedAsManaCostAndDamage() {
        Magic m = new Magic("Flash", 0, 0);
        assertEquals("Name = Flash, ManaCost = 0, Damage = 0", m.toString());

    }


}