
public class Combat {
	
	private player character;
	private man monster;
	private boolean playerTurn;
	private boolean activeCombat;
	
	public Combat(player player, man monster) {
		this.monster = monster;
		character = player;
		playerTurn = true;
		activeCombat = true;
	}
	
	public void turn(){
	
		if(character.getHealth()<0) {
			activeCombat=false;
		}
		else if(monster.getHealth()<0) {
			activeCombat=false;
		}
		
		else if (playerTurn) {
			PlayerTurn(character);
		}
		
		else {
			MonsterTurn(monster);
		}
	}
	
	
	
}
