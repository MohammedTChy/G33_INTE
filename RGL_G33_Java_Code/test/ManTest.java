import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManTest {

    @Test
    void testInstanceCreation() {
        Man m = new Man("Aragon", Man.ManType.MEDIC);
        assertEquals("Aragon", m.getName());
        assertEquals(Man.ManType.MEDIC, m.getManType());
    }

    @Test
    void testToString() {
        Man m = new Man("Boromir", Man.ManType.MEDIC);
        assertEquals("Name: Boromir, Type: MEDIC", m.toString());
    }

    @Test
    void testGetHitPoints() {
        Man m = new Man("Boromir", Man.ManType.WARRIOR);
        assertEquals(2000, m.getHitPoints());
    }
}