
public interface ICreature {
	 String getNickname();
	 void setNickname(String nickname);
	 void updateScore(long amount) throws NumberFormatException;
	 void powerUp(double stamina, double speed, int agility);

}
