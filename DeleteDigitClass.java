package CodeSignal;

public class DeleteDigitClass {
	static int deleteDigit(int n) {
		int maxNum=0;
		for (int t = 1; t < n; t *= 10)
			maxNum = Math.max(((n/t)/10)*t + n%t, maxNum);
		return maxNum;
	}
	
	public static void main(String[] args) {
		int n=152;
		int maxNum=deleteDigit(n);
		System.out.println(maxNum);
	}

}
