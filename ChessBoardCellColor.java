package CodeSignal;

public class ChessBoardCellColor {

	static boolean chessBoardCellColor(String cell1, String cell2) {
		return ((cell1.charAt(0)%2==cell1.charAt(1)%2)==(cell2.charAt(0)%2==cell2.charAt(1)%2));		
	}
	
	public static void main(String[] args) {
		String cell1="A1";
		String cell2="C3";

		boolean isSame=chessBoardCellColor(cell1, cell2);
		System.out.println(isSame);
	}

}
