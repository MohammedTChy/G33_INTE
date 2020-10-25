import java.util.Random;

public class Combat {

	private Creature player; 
	private Creature monster;
	private boolean playerTurn;
	private boolean activeCombat;

	public Combat(Creature player, Creature monster) { 
        if (player == monster) {
            throw new IllegalArgumentException("Creatures can not combat themselves!");
        }
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
				monsterTurn(random(), monster, player);
				playerTurn = true;
			}
			
			else {
				//player choice should be seperate class
				int playerChoice = 1;
				monsterTurn(playerChoice, player, monster);
				playerTurn = false;
			}
		}
	}
	
	public void turnTester(int attack, int totalTurns) {

		do {

			if (player.getHitPoints() <= 0 || monster.getHitPoints() <= 0) {
				activeCombat = false;
			} 
			
			else if (!playerTurn) {
				monsterTurn(attack, monster, player);
				playerTurn = true;
			}
			
			else {
				monsterTurn(attack, player, monster);
				playerTurn = false;
			}
			totalTurns--;
		} while (activeCombat = true && totalTurns>0);
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


	public void monsterTurn(int number, Creature attacker, Creature defender) {
		
		if (number <9) {
			int damage = basicAttack(attacker);
			int finalDamage = finalDamageValue(damage, defender);
			inflictDamage(finalDamage,defender);
			
		}
		else if (number <10 && number > 8) {
			int damage = criticalAttack(attacker);
			int finalDamage = finalDamageValue(damage, defender);
			inflictDamage(finalDamage,defender);
		}
		
		//more can be added, even non combat effects
		
	}
	
	public int random() {
		Random turn = new Random();
		int attack = turn.nextInt(9);
		return attack;
	}


}