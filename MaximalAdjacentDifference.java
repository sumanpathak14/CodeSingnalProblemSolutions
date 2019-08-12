package CodeSignal;


public class MaximalAdjacentDifference {
	
	static int arrayMaximalAdjacentDifference(int[] inputArray) {
		int maxDiff=0;
		
		for(int i=0;i<inputArray.length;i++) {
			if(i+1<inputArray.length) {
				if(Math.abs(inputArray[i]-inputArray[i+1])>maxDiff) {
					maxDiff=Math.abs(inputArray[i]-inputArray[i+1]);
				}
			}
		}
		
		return maxDiff;
	}
	
	
	public static void main(String[] args) {
		int[] inputArray= {2,4,1,0};

		int maxDiff=arrayMaximalAdjacentDifference(inputArray);
		System.out.println(maxDiff);
	}

}
