
public abstract class Creature implements ICreature, Comparable<Creature> {
	private Abilities abilities;
	private String nickname;
	private long score;
	
	protected Creature (double stamina, double speed, int agility, String nickname, long score)  {
		this.abilities = new Abilities(stamina, speed, agility);
	    this.nickname = nickname;
	    this.score = score;
	}
	
	@Override
	public int compareTo(Creature o) {
	    return this.abilities.compareTo(o.abilities);
	 }
	 
	@Override
	public String getNickname() {
	    return this.nickname;
	}
	 
	@Override
	public void setNickname(String nickname) {
	    this.nickname = nickname;
	}
	  
	@Override
	public void updateScore(long amount) throws NumberFormatException {
	    if (amount <= 0) {
	      throw new NumberFormatException("Expecting positive bonus value, got: " + amount);
	    }
	    
	    this.score += amount;
	}
	 
	@Override
	public void powerUp(double stamina, double speed, int agility) {
	    abilities.update(stamina, speed, agility);
	  }

	@Override
	public String toString() {
		return "Nickname: " + this.nickname + "\nScore: " + this.score +
		           "\nAbilities: " + this.abilities;
	}
	

}
