import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {

    @Test
    void testGetHitPoints() {
        Dragon m = new Dragon(2000, 200, 92);
        assertEquals(2000, m.getHitPoints());
    }

    @Test
    void negativeHitPointsThrowsIAE() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            Dragon m = new Dragon(-2000, 200, 92);
        });
        assertEquals("HP less than 0", e.getMessage());
    }

    @Test
    void setHitPoints() {
        Dragon m = new Dragon(2000, 200, 92);
        m.setHitPoints(1900);
        assertEquals(1900, m.getHitPoints());
    }

    @Test
    void setNegativeHitPointsThrowsIAE() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            Dragon m = new Dragon(2000, 200, 92);
            m.setHitPoints(-2000);
        });
    }

    @Test
    void testGetAttackPower() {
        Dragon m = new Dragon(2000, 200, 92);
        assertEquals(200, m.getAttackPower());
    }

    @Test
    void testSetAttackPower() {
        Dragon m = new Dragon(2000, 200, 92);
        m.setAttackPower(199);
        assertEquals(199, m.getAttackPower());
    }

    @Test
    void testNegativeAttackPowerInConstructor() {
        Dragon m = new Dragon(2000, -200, 92);
        assertEquals(0, m.getAttackPower());
    }

    @Test
    void testSetNegativeAttackPower() {
        Dragon m = new Dragon(2000, 200, 92);
        m.setAttackPower(-199);
        assertEquals(0, m.getAttackPower());
    }

    @Test
    void testGetDefensePower() {
        Dragon m = new Dragon(2000, 200, 92);
        assertEquals(92, m.getDefensePower());
    }

    @Test
    void testGetExp() {
        Dragon m = new Dragon(2000, 200, 92);
        assertEquals(200, m.getExp());
    }

    @Test
    void testSetExp() {
        Dragon m = new Dragon(2000, 200, 92);
        m.setExp(1999);
        assertEquals(1999, m.getExp());
    }

    @Test
    void testSetExpToNegative() {
        Dragon m = new Dragon(2000, 200, 92);
        m.setExp(-2000);
        assertEquals(0, m.getExp());
    }

    @Test
    void testGetGold() {
        Dragon m = new Dragon(2000, 200, 92);
        assertEquals(40, m.getGold());
    }

    @Test
    void testSetGold() {
        Dragon m = new Dragon(2000, 200, 92);
        m.setGold(1998);
        assertEquals(1998, m.getGold());
    }

    @Test
    void testSetGoldToNegative() {
        Dragon m = new Dragon(2000, 200, 92);
        m.setGold(-40);
        assertEquals(0, m.getGold());
    }
}