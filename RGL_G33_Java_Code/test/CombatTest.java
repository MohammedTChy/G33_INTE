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
	
	void CreatureCanNotBeInCombatWithItself() {
		//toFix
        Man m = new Man(500,50,50);
        Dragon d = new Dragon(1000, 100, 200);
        Combat c = new Combat(m, d);
        
        assertEquals(m, c.getPlayer());
        assertEquals(d, c.getMonster());
	}	
	
	@Test
	void basicAttackEqualsAttackPower() {
        Man m = new Man(500,50,50);
        Dragon d = new Dragon(1000, 0, 0);
        Combat c = new Combat(m, d);
        
        assertEquals(m.getAttackPower(), c.basicAttack(m));
	}
	
	@Test
	void basicAttackEqualsAttackPowerIfNegative() {
        Man m = new Man(500,-50,50);
        Dragon d = new Dragon(1000, 100, 200);
        Combat c = new Combat(m, d);
        
        assertEquals(m.getAttackPower(), c.basicAttack(m));
	}
	
	@Test
	void criticalAttackEqualsDoubleAttackPower() {
        Man m = new Man(500,100,150);
        Dragon d = new Dragon(1000, 200, 50);
        Combat c = new Combat(m, d);
        
        assertEquals(2*100, c.criticalAttack(m));		
	}
	
	@Test
	void calculateFinalDamageWithBasicAttack() {
        Man m = new Man(500,0,150);
        Dragon d = new Dragon(1000, 200, 0);
        Combat c = new Combat(m, d);
        
        assertEquals(200-150, c.finalDamageValue(c.basicAttack(d), m));
	}
	
	@Test
	void calculateFinalDamageWithCriticalAttack() {
        Man m = new Man(500,0,150);
        Dragon d = new Dragon(1000, 200, 0);
        Combat c = new Combat(m, d);
        
        assertEquals(2*200-150, c.finalDamageValue(c.criticalAttack(d), m));
	}
	
	@Test
	void inflictBasicAttackFinalDamage() {
        Man m = new Man(500,0,150);
        Dragon d = new Dragon(1000, 200, 0);
        Combat c = new Combat(m, d);
        
        int f = c.finalDamageValue(c.basicAttack(d), m);
        
        c.inflictDamage(f, m);
        
        assertEquals(500-(200-150), m.getHitPoints());
	}
	
	@Test
	void negativeAttackPowerCanNotHealDefender() {
        Man m = new Man(500,0,200);
        Dragon d = new Dragon(1000, -100, 0);
        Combat c = new Combat(m, d);
        
        int f = c.finalDamageValue(c.basicAttack(d), m);
        
        c.inflictDamage(f, m);
        
        assertEquals(500, m.getHitPoints());
	}
	
	@Test
	void strongDefensePowerCanNotHealDefender() {
        Man m = new Man(500, 50, 0);
        Dragon d = new Dragon(1000, 0, 100);
        Combat c = new Combat(m, d);
        
        int f = c.finalDamageValue(c.basicAttack(m), d);
        
        c.inflictDamage(f, d);
        
        assertEquals(1000, d.getHitPoints());
	}
	
	@Test
	void randomReturnsNumber0to9() {
        Man m = new Man(500, 50, 0);
        Dragon d = new Dragon(1000, 0, 100);
        Combat c = new Combat(m, d);
        
        int random = c.random();
        
        
        assertTrue(-1<random&&random<10);

	}
	
}