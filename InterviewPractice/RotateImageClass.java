package codesignal_interview;

public class RotateImageClass {

	static int[][] rotateImage(int[][] a) {
		int n=a.length,i,j;
		int[][] rotatedArray= new int[n][n];
		
		for(i=0;i<n;i++) {
			for(j=n-1;j>=0;j--) {
				rotatedArray[i][n-j-1]=a[j][i];
			}
		}
		
		return rotatedArray;
	}
	
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][] rotatedArray=rotateImage(a);
		for(int i=0;i<rotatedArray.length;i++) {
			for(int j=0;j<rotatedArray[i].length;j++) {
				System.out.print(rotatedArray[i][j]);
			}
			System.out.println();
		}
	}

}
