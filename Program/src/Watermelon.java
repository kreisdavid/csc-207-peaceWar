
import java.util.Random;

public class Watermelon implements Player {
	
	private String name;
	private String strategy;
	private Move[] probe;
	private Move[] react;
	private int bestStrategy;
	
	public Watermelon(){
		this.name = "Watermelon";
		this.strategy = "lol, like i would post my strategy on my public github";
		this.probe = new Move[9];
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
		if(num == 1){
			return Move.WAR;
		} else if(num == 2){
			return Move.WAR;
		} else if(num == 3){
			return Move.PEACE;
		} else if(num == 4){
			return Move.PEACE;
		} else if(num == 5){
			return Move.WAR;
		} else if(num == 6){
			return Move.PEACE;
		} else if(num == 7){
			return Move.WAR;
		} else if(num == 8){
			return Move.WAR;
		} else if(num == 9){
			return Move.PEACE;
		} else {
			if(bestStrategy == 1){
				return Move.PEACE;
			} else if(bestStrategy == 2){
				return Move.WAR;
			} else if(bestStrategy == 3){
				if(num % 2 == 0){
					return Move.PEACE;
				} else {
					return Move.WAR;
				}
			} else if(bestStrategy == 0){
				//here we put in t4t strategy using react
			}
		}
		
		
		
		return null;
	}
	
	@Override
	public void recordOpponentMove(int num, Move move) {
		// TODO Auto-generated method stub
	}

}

