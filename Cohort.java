import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cohort<C extends Creature> {
	  private Map<String, C> citizens = new HashMap<>();
	 
	  public void addNewCitizen(String address, C creature) {
	    citizens.put(address, creature);
	  }
	 
	  public ArrayList<C> getAllCitizensToFight() {
	    ArrayList<C> allAligned = new ArrayList<>(citizens.values());
	    Collections.sort(allAligned);
	    return allAligned;
	  }
	 
	  public C getCitizenAT(String address) {
	    return citizens.get(address);
	  }
	 
	  public int size() {
	    return citizens.size();
	  }
	 
	  public boolean isEmpty() {
	    return citizens.isEmpty();
	  }
	 
	  @Override
	  public String toString() {
	    ArrayList<C> citizensAligned = getAllCitizensToFight();
	    String ret = "";
	    for (C creature: citizensAligned) {
	      ret += creature + "\n";
	    }
	    return ret;
	  }

}
