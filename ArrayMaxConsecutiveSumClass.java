package CodeSignal;

public class ArrayMaxConsecutiveSumClass {
	static int arrayMaxConsecutiveSum(int[] inputArray, int k) {
		int maxSum=0;
		
		
		int tempSum=0;
		
		int j=0;
		
		for(int i=0;i<inputArray.length-k+1;i++) {
			j=i;
			while(j<i+k) {
				tempSum=tempSum+inputArray[j];
				j++;
			}
			if(tempSum>maxSum) {
				maxSum=tempSum;
			}
			tempSum=0;
		}
		
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		int[] inputArray= {2, 3, 5, 1, 6};
		int k=2;
		int maxSum=arrayMaxConsecutiveSum(inputArray, k);
		System.out.println(maxSum);
	}

}
