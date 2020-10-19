
public class Combat {
	
	private man player; //should be player later
	// A player object is probably more complex and has a man object within
	private man monster;
	private boolean playerTurn;
	private boolean activeCombat;
	
	public Combat(man player, man monster) { //should be player later
		this.monster = monster;
		this.player = player;
		playerTurn = true;
		activeCombat = true;
	}
	
	public void turn(){
	
		if(player.getHealth()<0||monster.getHealth()<0) {
			activeCombat=false;
		}
		else if (!playerTurn) {
			//implement simple random method to decide monster attack
			int damage = basicAttack(monster); //for now just basic attack
			int finalDamage = finalDamageValue(damage, player);
			player.loseHealth(finalDamage);
		}
		
		else {
			//ToDo
		}
	}
	
	public int basicAttack(man man) {
		//return attack power
		//should be man.getAttackPower
		return 10; 
	}
	
	public int powerAttack(man man) {
		//return attack power*2
		return 10*2; 
	}
	
	public int defense(man man) {
		//man.getDefensePower
		return 1; //return defense value
	}
	
	public int finalDamageValue(int damageBeforeDefense, man player) {
		return damageBeforeDefense-player.getDefensePower;
	}
	
}
