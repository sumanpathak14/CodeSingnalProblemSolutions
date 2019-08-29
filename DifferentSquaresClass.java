package CodeSignal;

import java.util.HashSet;
import java.util.Set;

public class DifferentSquaresClass {
	
	static int differentSquares(int[][] matrix) {
			
		Set<Integer> s = new HashSet<Integer>();
		
	    for(int i = 0;i < matrix.length - 1;i++)
	        for(int j = 0;j < matrix[0].length - 1;j++){
	            int temp = 
	                matrix[i][j] * 1000 +
	                matrix[i][j+1] * 100 +
	                matrix[i+1][j] * 10 +
	                matrix[i+1][j+1];
	            s.add(temp);
	            
	        }
	    
	    return s.size();
		
		
	}
	
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,1},{2,2,2},{2,2,2},{1,2,3},{2,2,1}};
		
		int squareCount=differentSquares(matrix);
		
		System.out.println(squareCount);
	}
}
