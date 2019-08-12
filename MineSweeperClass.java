package CodeSignal;

public class MineSweeperClass {

	static int[][] minesweeper(boolean[][] matrix) {
		int[][] result=new int[matrix.length][matrix[0].length];
		int count;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				count =0;
				for(int k=i-1;k<=i+1;k++) {
					for(int h=j-1;h<=j+1;h++) {
						if(k>=0 && h>=0 &&k<matrix.length&& h<matrix[0].length) {
							if(matrix[k][h]==true) {
								count++;
							}
						}
					}
				}
				if(matrix[i][j]==true) {
					count=count-1;
				}
				result[i][j]=count;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		boolean[][] matrix= {{true,false,false},{false,true,false},{false,false,false}};
		int[][] result = new int[matrix.length][matrix[0].length];
		result=minesweeper(matrix);
		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.println(result[i][j]);
			}
		}
	}

}
