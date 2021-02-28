import java.util.ArrayList;

public class LordOfJava {
	private Parameters parameters;
	private Cohort<Dragon> dragons = new Cohort<>();
	private Cohort<Warg> wargs = new Cohort<>();
	private Cohort<Mumakil> mumakils = new Cohort<>();
	
	public LordOfJava(String OS, String gamePATH, String credentials, int noLives) {
	    this.parameters = new Parameters(OS, gamePATH, credentials, noLives);
	  }
	 
	  public void addCreature(Creature creature, String address) {
	    if (creature instanceof Dragon) {
	      dragons.addNewCitizen(address, (Dragon)creature);
	    } else  if (creature instanceof Warg) {
	      wargs.addNewCitizen(address, (Warg)creature);
	    } else if (creature instanceof Mumakil) {
	      mumakils.addNewCitizen(address, (Mumakil)creature);
	    } else {
	      throw new IllegalArgumentException(
	                "Creature type unknown: " + creature.getClass().getName());
	    }
	  }
	 
	  public int battleDragonsWargs() {
	    if (dragons.size() < wargs.size()) {
	      return -1;
	    }
	    if (dragons.size() > wargs.size()) {
	      return 1;
	    }
	 
	    ArrayList<Dragon> dragonsToFight = dragons.getAllCitizensToFight();
	    ArrayList<Warg> wargsToFight = wargs.getAllCitizensToFight();
	    int score = 0;
	    for (int i=0; i<wargs.size(); i++) {
	      int duelResult = dragonsToFight.get(i).compareTo(wargsToFight.get(i));
	      score += duelResult > 0 ? +1 : duelResult < 0 ? -1 : 0;
	    }
	    return score;
	  }
	 
	  @Override
	  public String toString() {
	    return "" + parameters + "\n" + dragons + "\n" + wargs + "\n" + mumakils;
	  }

}
