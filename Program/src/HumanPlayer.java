
import java.util.*;

public class HumanPlayer implements Player {
	
	private String name;
	private String strategy;
	private Scanner read;
	
	public HumanPlayer(String name){
		this.name = name;
		this.strategy = "Human intuition.";
		this.read = new Scanner(System.in);
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
		
		//need to prompt here
		
		return null;
	}
	
	@Override
	public void recordOpponentMove(int num, Move move) {
		// TODO Auto-generated method stub
		// a human does not need this function
	}

}

