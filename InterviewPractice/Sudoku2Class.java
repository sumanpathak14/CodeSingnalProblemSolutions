package codesignal_interview;

public class Sudoku2Class {

	static boolean sudoku2(char[][] grid) {
		return everyRow(grid) && everyCol(grid) && everyCube(grid);
	}
	
	static boolean everyCol(char[][] grid) {
		for (int i=0;i<9;i++) {
			int[] temp =new int[9];
			for(int j=0;j<9;j++) {
				if(Character.isDigit(grid[j][i])) {
					int num=Integer.parseInt(String.valueOf(grid[j][i]));
					temp[num-1]++;
					if(temp[num-1]>1) return false;
				}
			}
		}
		return true;
	}
	
	static boolean everyRow(char[][] grid) {
		for (int i=0;i<9;i++) {
			int[] temp =new int[9];
			for(int j=0;j<9;j++) {
				if(Character.isDigit(grid[i][j])) {
					int num=Integer.parseInt(String.valueOf(grid[i][j]));
					temp[num-1]++;
					if(temp[num-1]>1) return false;
				}
			}
		}
		return true;
	}
	
	static boolean everyCube(char[][] grid) {
		for (int i=0;i<9;i+=3) {
			for(int j=0;j<9;j+=3) {
				if(!notOk(grid, i, j)) {
					return false;
				}
			}
		}
		return true;
	}
	
	static boolean notOk(char[][] grid, int row,int col) {
		int[] temp =new int[9];
		int rowEnd=row+3;
		int colEnd=col+3;
		int tempCol=col;
		
		while(row<rowEnd) {
			col=tempCol;
			while(col<colEnd) {
				if(Character.isDigit(grid[row][col])) {
					int num=Integer.parseInt(String.valueOf(grid[row][col]));
					temp[num-1]++;
					if(temp[num-1]>1) return false;
				}
				col++;
			}
		
		row++;
		}
		return true;
	}
	
	public static void main(String[] args) {
		char[][] grid= {{'.','.','.','1','4','.','.','2','.'}, 
				{'.','.','6','.','.','.','.','.','.'}, 
				{'.','.','.','.','.','.','.','.','.'}, 
				{'.','.','1','.','.','.','.','.','.'}, 
				{'.','6','7','.','.','.','.','.','9'}, 
				{'.','.','.','.','.','.','8','1','.'}, 
				{'.','3','.','.','.','.','.','.','6'}, 
				{'.','.','.','.','.','7','.','.','.'}, 
				{'.','.','.','5','.','.','.','7','.'}};
		boolean isValid=sudoku2(grid);
		System.out.println(isValid);
		
	}

}
