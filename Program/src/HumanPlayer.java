
import java.util.*;

public class HumanPlayer implements Player {
	
	private String name;
	private String strategy;
	private Scanner read;
	private String choice;
	
	public HumanPlayer(String name){
		this.name = name;
		this.strategy = "Human intuition.";
		this.read = new Scanner(System.in);
		this.choice = "";
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
		this.choice = "";
		//prompt for user strategy
		while(!choice.equalsIgnoreCase("war") && !choice.equalsIgnoreCase("peace")){
			System.out.print("Strategy? ");
			choice = read.next();
		}
		if(choice.equalsIgnoreCase("war")){
			return Move.WAR;
		} else {
			return Move.PEACE;
		}
	}
	
	@Override
	public void recordOpponentMove(int num, Move move) {
		// TODO Auto-generated method stub
		// a human does not need this function
	}

}

