
import java.util.Random;

public class Watermelon implements Player {
	
	private String name;
	private String strategy;
	
	public Watermelon(){
		this.name = "Watermelon";
		this.strategy = "lol, like i would post my strategy on my public github";
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.strategy;
	}
	
	@Override
	public Move takeTurn(int num, Random rand) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void recordOpponentMove(int num, Move move) {
		// TODO Auto-generated method stub
	}

}

