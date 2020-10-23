public class Combat {

	private Creature player; // should be player later
	private Creature monster;
	private boolean playerTurn;
	private boolean activeCombat;

	public Combat(Creature player, Creature monster) { // should be player later
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
		return damageBeforeDefense - player.getDefensePower();
	}
	

}
