import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicianTest {

    @Test
    void testGetHitPoints() {
        Magician m = new Magician(2000, 200, 92, 40);
        assertEquals(2000, m.getHitPoints());
    }

    @Test
    void negativeHitPointsThrowsIAE() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            new Magician(-2, 200, 92, 40);
        });
        assertEquals("HP less than 0", e.getMessage());
    }

    @Test
    void setHitPoints() {
        Magician m = new Magician(2000, 200, 92, 40);
        m.setHitPoints(1900);
        assertEquals(1900, m.getHitPoints());
    }

    // Need to figure out how to write this one
    //Hope this works ~Tahmid
    @Test
    void setNegativeHitPointsThrowsIAE() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            Magician m = new Magician(2000, 200, 92, 40);
            m.setHitPoints(-2000);
        });
    }

    @Test
    void testGetAttackPower() {
        Magician m = new Magician(1999, 200, 91, 40);
        assertEquals(200, m.getAttackPower());
    }

    @Test
    void testGetDefensePower() {
        Magician m = new Magician(1999, 200, 91, 40);
        assertEquals(91, m.getDefensePower());
    }

    @Test
    void getMana() {
        Magician m = new Magician(2000, 200, 92, 40);
        assertEquals(40, m.getMana());
    }

    @Test
    void getManaIfManaISZero() {
        Magician m = new Magician(2000, 200, 92, 0);
        assertEquals(0, m.getMana());
    }

    @Test
    void negativeManaThrowsIAE() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            new Magician(2000, 200, 92, -40);
        });
        assertEquals("Mana less than 0", e.getMessage());
    }

    @Test
    void setMana() {
        Magician m = new Magician(2000, 200, 92, 40);
        m.setMana(30);
        assertEquals(30, m.getMana());
    }

    //Need to figure out how to write this one
    //Hope this works ~Tahmid
    @Test
    void setNegativeManaThrowsIAE() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            Magician m = new Magician(2000, 200, 92, 40);
            m.setMana(-40);
        });
    }

    @Test
    void testToString() {
        Magician m = new Magician(2000, 200, 92, 40);
        assertEquals("HP: 2000, Attack: 200, Defense: 92, Mana: 40", m.toString());
    }
}