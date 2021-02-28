
public class Warg extends Creature implements IBite {
	private double bitePower;
	 
	  public Warg(double stamina, double speed, int agility, String nickname, long score, double bitePower) {
	    super(stamina, speed, agility, nickname, score);
	    this.bitePower = bitePower;
	  }
	 
	  @Override
	  public void powerUp(double stamina, double speed, int agility) {
	    super.powerUp(stamina / 2, speed * 4, agility);
	  }
	 
	  @Override
	  public double getBitePower() {
	    return this.bitePower;
	  }
	 
	  @Override
	  public String toString() {
	    return super.toString() + "\nBite Power: " + this.bitePower;
	  }

}
