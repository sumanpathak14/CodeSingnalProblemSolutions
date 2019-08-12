package CodeSignal;

public class bishopAndPawnClass {

	static boolean bishopAndPawn(String bishop, String pawn) {

		return Math.abs((bishop.charAt(0) - 96) - (pawn.charAt(0) - 96)) ==
		           Math.abs(bishop.charAt(1) - pawn.charAt(1));		
	}
	public static void main(String[] args) {
		String bishop="a1";
		String pawn="c3";
		
		boolean ifPossible=bishopAndPawn(bishop, pawn);
		System.out.println(ifPossible);
	}

}
