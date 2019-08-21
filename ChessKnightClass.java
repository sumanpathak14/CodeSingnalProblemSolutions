package CodeSignal;

public class ChessKnightClass {
	static int chessKnight(String cell) {
		int possibleMoves=0;
		
		int[] r = new int[] {2, 3, 4, 6, 8};
	    int c1 = Math.min(cell.charAt(0) - 'a', 'h' - cell.charAt(0));
	    int c2 = Math.min(cell.charAt(1) - '1', '8' - cell.charAt(1));
	    int d1 = Math.min(c1, 2);
	    int d2 = Math.min(c2, 2);
	    possibleMoves= r[d1 + d2];
		
		return possibleMoves;
	}

	public static void main(String[] args) {
		String cell="a1";
		int possibleMoves=chessKnight(cell);
		System.out.println(possibleMoves);
	}

}
