import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CombatTest {

	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void constructorCreatesCombatObject() {
		
        Man m = new Man(500,50,50);
        Dragon d = new Dragon(1000, 100, 200);
        Combat c = new Combat(m, d);
        
        assertEquals(m, c.getPlayer());
        assertEquals(d, c.getMonster());
	}
	
	@Test
	void basicAttackEqualsAttackPower() {
        Man m = new Man(500,50,50);
        Dragon d = new Dragon(1000, 100, 200);
        Combat c = new Combat(m, d);
        
        assertEquals(m.getAttackPower(), c.basicAttack(m));
	}
	
	@Test
	void criticalAttackEqualsDoubleAttackPower() {
        Man m = new Man(500,50,50);
        Dragon d = new Dragon(1000, 100, 200);
        Combat c = new Combat(m, d);
        
        assertEquals(2*m.getAttackPower(), c.criticalAttack(m));		
	}
	
	@Test
	void calculateFinalDamageWithBasicAttack() {
        Man m = new Man(500,50,50);
        Dragon d = new Dragon(1000, 100, 200);
        Combat c = new Combat(m, d);
        
        assertEquals(100-50, c.finalDamageValue(c.basicAttack(d), m));
	}
	
	@Test
	void calculateFinalDamageWithCriticalAttack() {
        Man m = new Man(500,50,50);
        Dragon d = new Dragon(1000, 100, 200);
        Combat c = new Combat(m, d);
        
        assertEquals(200-50, c.finalDamageValue(c.criticalAttack(d), m));
	}

}


//ett sorts mellan-interface för spelarens actions
//Varav testerna gör for loop för att använda samma attack
//om och om igen för att klarlägga systemet.






