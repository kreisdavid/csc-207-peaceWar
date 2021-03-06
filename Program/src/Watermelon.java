
import java.util.Random;

public class Watermelon implements Player {
	
	/**
	 * Watermelon is a bot that plays the PeaceWarGame. It is designed to recognize the strategy
	 * of its opponent (current implementation includes only the most likely scenarios) and to then
	 * play the optimal strategy against that opponent to maximize the points scored for Watermelon.
	 * 
	 * Watermelon begins the game with a predetermined pattern of moves, set so that each of the strategies
	 * it is designed to detect will produce a different pattern of moves in response, thus making them 
	 * distinguishable. If Watermelon is able to determine the opponent's strategy, it plays the appropriate
	 * strategy that will result in the maximum number of points for itself. If Watermelon is unable to 
	 * determine its opponent's strategy, it will utilize the Tit for Tat strategy. 
	 * 
	 * Watermelon is currently programed to detect the following strategies:
	 * Tit for Tat
	 * Tit for Two Tats
	 * Suspicious Tit for Tat
	 * Pavlov
	 * Grudger
	 * Always Peace
	 * Always War
	 * True Peace Maker
	 * 
	 * Research on www.iterated-prisoners-dilemma.net was the source for knowledge of the different common
	 * strategies. 
	 * 
	 * Watermelon has 4 strategies that it may use after the initial set sequence of moves:
	 * Always War
	 * Always Peace
	 * Alternating Peace and War
	 * Tit for Tat
	 */
	
	private String name;
	private String strategy;
	private Move[] probe; //to hold initial results from set pattern
	private Move[] react; //used if opponent strategy cannot be determined
	private int bestStrategy;
	
	public Watermelon(){
		this.name = "Watermelon";
		this.strategy = "Starts with a set pattern in order to determine the opponent's strategy, then plays optimally for discovered strategy.";
		this.probe = new Move[9];
		this.react = new Move[1];
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
		//the first 9 moves are predetermined to act as a test for the opponent strategy
		//the rest of the moves are based on what the strategy of the opponent has been determined to be
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
			if(this.bestStrategy == 1){
				return Move.PEACE;
			} else if(this.bestStrategy == 2){
				return Move.WAR;
			} else if(this.bestStrategy == 3){
				if(num % 2 == 0){
					return Move.PEACE;
				} else {
					return Move.WAR;
				}
			} else if(this.bestStrategy == 0){
				//here we put in t4t strategy using react
				return this.react[0];
			} else{
				System.out.println("Well shit");
				System.exit(0);
				//program should never reach here
				//big problems if does
				
				return null;
				//to make the compiler happy, there is a return statement
			}
		}

	}//takeTurn
	
	@Override
	public void recordOpponentMove(int num, Move move) {
		// TODO Auto-generated method stub
		if(num < 10){
			this.probe[num - 1] = move;
		}
		if(num == 9){
			if(this.probe[0].equals(Move.PEACE) && this.probe[1].equals(Move.WAR) && this.probe[2].equals(Move.WAR) 
					&& this.probe[3].equals(Move.PEACE) && this.probe[4].equals(Move.PEACE) && this.probe[5].equals(Move.WAR)
					&& this.probe[6].equals(Move.PEACE) && this.probe[7].equals(Move.WAR)&& this.probe[8].equals(Move.WAR)){
				this.bestStrategy = 1;
				//determine if t4t
			} else if(this.probe[0].equals(Move.PEACE) && this.probe[1].equals(Move.PEACE) && this.probe[2].equals(Move.WAR) 
					&& this.probe[3].equals(Move.WAR) && this.probe[4].equals(Move.PEACE) && this.probe[5].equals(Move.PEACE)
					&& this.probe[6].equals(Move.PEACE) && this.probe[7].equals(Move.PEACE)&& this.probe[8].equals(Move.WAR)){
				this.bestStrategy = 3;
				//determine if t42t
			} else if(this.probe[0].equals(Move.WAR) && this.probe[1].equals(Move.WAR) && this.probe[2].equals(Move.WAR) 
					&& this.probe[3].equals(Move.PEACE) && this.probe[4].equals(Move.PEACE) && this.probe[5].equals(Move.WAR)
					&& this.probe[6].equals(Move.PEACE) && this.probe[7].equals(Move.WAR)&& this.probe[8].equals(Move.WAR)){
				this.bestStrategy = 1;
				//determine if st4t
			} else if(this.probe[0].equals(Move.PEACE) && this.probe[1].equals(Move.WAR) && this.probe[2].equals(Move.PEACE) 
					&& this.probe[3].equals(Move.PEACE) && this.probe[4].equals(Move.PEACE) && this.probe[5].equals(Move.WAR)
					&& this.probe[6].equals(Move.WAR) && this.probe[7].equals(Move.PEACE)&& this.probe[8].equals(Move.WAR)){
				this.bestStrategy = 2;
				//determine if pavlov
			} else if(this.probe[0].equals(Move.PEACE) && this.probe[1].equals(Move.WAR) && this.probe[2].equals(Move.WAR) 
					&& this.probe[3].equals(Move.WAR) && this.probe[4].equals(Move.WAR) && this.probe[5].equals(Move.WAR)
					&& this.probe[6].equals(Move.WAR) && this.probe[7].equals(Move.WAR)&& this.probe[8].equals(Move.WAR)){
				this.bestStrategy = 2;
				//determine if grudger
			} else if(this.probe[0].equals(Move.PEACE) && this.probe[1].equals(Move.PEACE) && this.probe[2].equals(Move.PEACE) 
					&& this.probe[3].equals(Move.PEACE) && this.probe[4].equals(Move.PEACE) && this.probe[5].equals(Move.PEACE)
					&& this.probe[6].equals(Move.PEACE) && this.probe[7].equals(Move.PEACE)&& this.probe[8].equals(Move.PEACE)){
				this.bestStrategy = 2;
				//determine if always peace
			} else if(this.probe[0].equals(Move.WAR) && this.probe[1].equals(Move.WAR) && this.probe[2].equals(Move.WAR) 
					&& this.probe[3].equals(Move.WAR) && this.probe[4].equals(Move.WAR) && this.probe[5].equals(Move.WAR)
					&& this.probe[6].equals(Move.WAR) && this.probe[7].equals(Move.WAR)&& this.probe[8].equals(Move.WAR)){
				this.bestStrategy = 2;
				//determine if always war
			} else if(this.probe[0].equals(Move.PEACE) && this.probe[1].equals(Move.PEACE) && this.probe[3].equals(Move.PEACE) 
					&& this.probe[4].equals(Move.PEACE) && this.probe[5].equals(Move.PEACE) && this.probe[6].equals(Move.PEACE) 
					&& this.probe[7].equals(Move.PEACE)){
				//determine if tpm
				if(this.probe[2].equals(Move.WAR) || this.probe[8].equals(Move.WAR)){
					this.bestStrategy = 3;
					//probable that its tpm, random variation makes it likely but not certain
				} else{
					this.bestStrategy = 0;
					//if pattern is close but not perfect
					//if both index 2 and 8 are peace, then probability is unlikely
				}
			} else{
				this.bestStrategy = 0;
				//pattern not detected
			}
		}//if num == 9
		if(num >= 9 && this.bestStrategy == 0){
			this.react[0] = move;
			//if strategy could not be determined, store the last move of the opponent to be played back at them
		}
	}//recordOpponentMove

}//class

