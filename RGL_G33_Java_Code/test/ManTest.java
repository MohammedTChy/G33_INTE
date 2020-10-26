import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManTest {

    @Test
    void testGetHitPoints() {
        Man m = new Man(2000,200,92);
        assertEquals(2000, m.getHitPoints());
    }

    @Test
    void testSetHitPoints() {
        Man m = new Man(2000,200,92);
        m.setHitPoints(1999);
        assertEquals(1999, m.getHitPoints());
    }

    @Test
    void negativeHitPointsThrowsIAE() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            new Man(-2,200,92);
        });
        assertEquals( "HP less than 0", e.getMessage());
    }

    @Test
    void setNegativeHitPointsThrowsIAE() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
         Man m = new Man(-500,200,92);
         m.setHitPoints(-2555);
      });
    }

    @Test
    void testGetAttackPower() {
        Man m = new Man(1999, 200, 91);
        assertEquals(200, m.getAttackPower());
    }

    @Test
    void testGetDefensePower() {
        Man m = new Man(1999, 200, 91);
        assertEquals(91, m.getDefensePower());
    }

    @Test
    void testManaIsZero() {
        Man m = new Man(1999, 200, 91);
        assertEquals(0,m.getMana());
    }

    @Test
    void testToString() {
        Man m = new Man(2000, 200, 90);
        assertEquals("HP: 2000, Attack: 200, Defense: 90", m.toString());
    }

    @Test
    void testGetMaxHealth() {
        Man m = new Man(2000,200,92);
        assertEquals(2500, m.getMaxHealth());
    }

    @Test
    void testSetNewMaxHealth(){
        Man m = new Man(2000,200,92);
        m.setNewMaxHealth(500);
        assertEquals(3000, m.getMaxHealth());
    }
}