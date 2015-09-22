
import java.util.Random;

public class RandomPlayer implements Player {
	
	private String name;
	private String strategy;
	
	public RandomPlayer(String name){
		this.name = name;
		this.strategy = "This computer player will randomly pick either PEACE or WAR each turn.";
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
		int r = rand.nextInt();
		if(r % 2 == 0){
			return Move.WAR;
		} else {
			return Move.PEACE;
		}
		//randomly choose WAR or PEACE
	}
	
	@Override
	public void recordOpponentMove(int num, Move move) {
		// TODO Auto-generated method stub
		//this bot doesn't need this function
	}

}

