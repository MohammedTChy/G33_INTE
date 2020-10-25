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
				//player need a seperate user interface class to choose attacks
				//is not yet implemented because its outside the scope of project
				//so for now makes use of random class to simulate choices
				int playerChoice = random();
				playerTurn(playerChoice, player, monster);
				playerTurn = false;
			}
		}
	}
	
	public void turnTester(int attackType, int totalTurns) {

		do {

			if (player.getHitPoints() <= 0 || monster.getHitPoints() <= 0) {
				activeCombat = false;
			} 
			
			else if (!playerTurn) {
				monsterTurn(attackType, monster, player);
				playerTurn = true;
			}
			
			else {
				//Note that turnTester uses monsterTurn method for simplicity
				monsterTurn(attackType, player, monster);
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

	public void playerTurn(int number, Creature attacker, Creature defender) {
		
		//Practically works like monster class, but may now have new implementations
		//of abilities separate from monsters to choose from.
		
		if (number>1) {
			number = 0;
			}
		
		switch(number) {
		case 0:
			int damage = basicAttack(attacker);
			int finalDamage = finalDamageValue(damage, defender);
			inflictDamage(finalDamage,defender);
			break;
		case 1:
			int criticalDamage = criticalAttack(attacker);
			int criticalFinalDamage = finalDamageValue(criticalDamage, defender);
			inflictDamage(criticalFinalDamage,defender);
			break;
		case 2:
			break;
		default:
			break;
		}
		
		//more can be added, even non combat effects
		
	}	
	public int random() {
		Random turn = new Random();
		int attack = turn.nextInt(10);
		return attack;
	}

}