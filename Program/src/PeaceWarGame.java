import java.util.Random;

public class PeaceWarGame {
	
	private int p1Score;
	private int p2Score;
	private Player player1;
	private Player player2;
	private int numRounds;
	private Move p1Move;
	private Move p2Move;
	private Random rand;

	public PeaceWarGame(Player player1, Player player2, int numRounds){
		this.player1 = player1;
		this.player2 = player2;
		this.numRounds = numRounds;
		this.p1Score = 0;
		this.p2Score = 0;
		this.rand = new Random();
		//need to implement rand
	}

	public void play(){
		//play plays the whole game, all the rounds. 
		for(int i = 0; i < this.numRounds; i++){
			System.out.println("Year " + (i + 1));
			this.p1Move = this.player1.takeTurn(i+1, rand);
			this.p2Move = this.player2.takeTurn(i+1, rand);
			System.out.println("Player 1 chose " + this.p1Move.toString());
			System.out.println("Player 2 chose " + this.p2Move.toString());
			
			//figuring out the message based on the choices of moves
			if(this.p1Move == Move.PEACE){
				if(this.p2Move == Move.PEACE){
					System.out.println("Peace for everyone!");
					this.p1Score += 3;
					this.p2Score += 3;
				} else {
					System.out.println("Player 2 crushes player 1!");
					this.p2Score += 5;
				}
			} else {
				if(this.p2Move == Move.PEACE){
					System.out.println("Player 1 crushes player 2!");
					this.p1Score += 5;
				} else {
					System.out.println("Everyone to arms!");
					this.p1Score++;
					this.p2Score++;
				}
			}//outer else
			System.out.println(""); //for formatting
		}//for loop
		
	}//play
	
	public int getPlayer1Score(){
		return this.p1Score;
	}
	
	public int getPlayer2Score(){
		return this.p2Score;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2){
			System.out.println("Usage: PeaceWarGame <#/rounds> <ai|player>");
			System.exit(0);
		}//args check
		if(!args[1].equalsIgnoreCase("ai") && !args[1].equalsIgnoreCase("player")){
			System.out.println("Usage: PeaceWarGame <#/rounds> <ai|player>");
			System.exit(0);
		}//args[1] check
		
		PeaceWarGame game;
		if(args[1].equalsIgnoreCase("ai")){
			Player p1 = new RandomPlayer("Bot 1");
			Player p2 = new RandomPlayer("Bot 2");
			game = new PeaceWarGame(p1, p2, Integer.parseInt(args[0]));
		} else {
			Player p1 = new HumanPlayer("Human");
			Player p2 = new RandomPlayer("Bot");
			game = new PeaceWarGame(p1, p2, Integer.parseInt(args[0]));
		}//else
		
		game.play();
		
		System.out.println("Final");
		System.out.println("Player 1: " + game.getPlayer1Score());
		System.out.println("Player 2: " + game.getPlayer2Score());
		if(game.getPlayer1Score() > game.getPlayer2Score()){
			System.out.println(">>> Player 1 wins! <<<");
		} else if(game.getPlayer2Score() > game.getPlayer1Score()){
			System.out.println(">>> Player 2 wins! <<<");
		} else {
			System.out.println(">>> It's a tie! <<<");
		}
		System.out.println(""); //for looks
	}//main


}


