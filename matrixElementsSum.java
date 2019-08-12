package CodeSignal;

public class matrixElementsSum {

	static int matrixElementsSum1(int[][] matrix) {
		
		int sum=0;
		
		for(int i=0;i<matrix.length;i++) 
		{
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]!=0 ) {
					sum=sum+matrix[i][j];
				}
				else {
					int z=i;
					while(z<matrix.length) {
						matrix[z][j]=0;
						z++;
					}
				}
				
			}
		}
		
		
		return sum;
	}
	
	public static void main(String[] args) {
		int[][] matrix = new int[][] {{0, 1, 1, 2},{0, 5, 0, 0},{2, 0, 3, 3}};
		
		int sum=matrixElementsSum1(matrix);
		
		System.out.println("Result is:"+sum);

	}

}
