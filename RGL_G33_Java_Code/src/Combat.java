import java.util.Random;

public class Combat {

	private Creature player; 
	private Creature monster;
	private boolean playerTurn;
	private boolean activeCombat;

	public Combat(Creature player, Creature monster) { 
		this.monster = monster;
		this.player = player;
		playerTurn = true;
		activeCombat = true;
	}
	
	public Creature getMonster() {
		return monster;
	}
	
	public Creature getPlayer() {
		return player;
	}	

	public void turn() {

		while (activeCombat) {

			if (player.getHitPoints() <= 0 || monster.getHitPoints() <= 0) {
				activeCombat = false;
			} 
			
			else if (!playerTurn) {
				
			}
			
			else {
				// ToDo
			}
		}
	}

	public int basicAttack(Creature attacker) {
		return attacker.getAttackPower();
	}
	
	public int criticalAttack(Creature attacker) {
		return 2*attacker.getAttackPower();
	}
	
	public int finalDamageValue(int damageBeforeDefense, Creature defender) {
		int finalDmg = damageBeforeDefense - defender.getDefensePower();
		if (finalDmg < 0) {
			finalDmg = 0;
		}
		return finalDmg;
	}
	
	public void inflictDamage(int finalDamageValue, Creature defender) {
		int currentHealth = defender.getHitPoints();
		
		
		int finalHealth = currentHealth-finalDamageValue;
		if (finalHealth<0) {
			finalHealth = 0;
		}
		defender.setHitPoints(finalHealth);
	}
	

	public void monsterTurn(int number) {
		
		if (number <9) {
			//normal attack
		}
		else if (number <10 && number > 8) {
			//critical attack
		}
		
		//more can be added
		
	}
	
	public int random() {
		Random turn = new Random();
		int attack = turn.nextInt(9);
		return attack;
	}


}