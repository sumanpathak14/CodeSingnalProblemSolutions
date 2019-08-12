package CodeSignal;

public class BoxBlurClass {

	static int[][] boxBlur(int[][] image) {
		//because we need to remove the border values and we need to take only middle cells 
	    int resultRows = image.length - 2, resultCols = image[0].length - 2;
	    int[][] result = new int[resultRows][resultCols];

	    for (int i = 1, resRow = 0; i < (image.length - 1); i++, resRow++) {
	        for (int j = 1, resCol = 0; j < (image[0].length - 1); j++, resCol++) {
	            int upperLeft = image[i - 1][j - 1], upperCenter = image[i - 1][j], upperRight = image[i - 1][j + 1];
	            int middleLeft = image[i][j - 1], middleCenter = image[i][j], middleRight = image[i][j + 1];
	            int lowerLeft = image[i + 1][j - 1], lowerCenter = image[i + 1][j], lowerRight = image[i + 1][j + 1];
	            int sum = (upperLeft + upperCenter + upperRight + middleLeft + middleCenter + middleRight + lowerLeft + lowerCenter + lowerRight);
	            result[resRow][resCol] = (int)Math.floor(((double)sum) / 9.0);
	        }
	    }

	    return result;
	}
	
	public static void main(String[] args) {
		int[][] image= {{0,18,9},{27,9,0},{81,63,45}};
		int[][] result=boxBlur(image);
		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.println(result[i][j]);
			}
		}
	}

}
