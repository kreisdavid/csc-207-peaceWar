# csc-207-peaceWar

David Kreis                        - for homework
David Kreis and Corey Simmonds     - for the lab
[kreisdav][simmonds17]

CSC 207 (Fall 2015) - Week 3


The repository was named before the inclusion of the new method of 
  submission. Both the lab and the homework are found in this repository.
 Lab is found in the Stack folder, homework is found in the Program folder.

No late days were used.


Lab
   Worked on by both David and Corey
  Struture:
     csc-207-peaceWar/
          Stack/
              src/
                 Stack.java
                 StackArray.java
                 Pancake.java



Homework
   Worked on only by David
  Structure:
      csc-207-peaceWar/
           Program/
              src/
                 PeaceWarGame.java
                 Player.java
                 Move.java
                 RandomPlayer.java
                 HumanPlayer.java
                 Watermelon.java
                 
                 
                 
                 
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
