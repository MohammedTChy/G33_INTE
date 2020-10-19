import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void creatingAHealthPotionType() {
        Item potion = new Item("Health", 200);
        assertEquals("Health", potion.getPotionType());
    }

    @Test
    void creatingAPotionToCheckAmmount() {
        Item p = new Item("Health", 200);
        assertEquals(200, p.getPotionAmmount());
    }

    @Test
    void creatingPotionWithIAEWithNegativeOneAmmount() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Item("Health", -1);
        });
    }

    @Test
    void addingHealthToAPlayerWithPotion() {
        Man m = new Man("Boromir", Man.ManType.WARRIOR);
        Item p = new Item("Health", 500);
        p.usePotion(m, p);
        assertEquals(2500, m.getHitPoints());
    }

    @Test
    void toStringFormatForHealthPotion(){
        Item p = new Item("Health", 550);
        assertEquals("This is a Health Potion, with the amount 550", p.toString());
    }

}