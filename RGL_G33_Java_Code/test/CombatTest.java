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
	
	

}


//ett sorts mellan-interface f�r spelarens actions
//Varav testerna g�r for loop f�r att anv�nda samma attack
//om och om igen f�r att klarl�gga systemet.






