
/**
* The possible move in a Peace-War Game.
*/
public enum Move {
	PEACE, WAR;
	/**
	* @return the string representation of this Move.
	*/
	public static String toString(Move move){
		if(Move.PEACE == move){
			return "peace";
		} else {
			return "war";
		}
	}

}

