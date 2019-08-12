package CodeSignal;

public class DepositProfitClass {

	static int depositProfit(double deposit, double rate, double threshold) {
		int year=1;
		double currentThreshold=deposit+(rate*deposit/100);
		System.out.println(currentThreshold);
		
		while(currentThreshold<threshold) {
			year++;
			currentThreshold=currentThreshold+(rate*currentThreshold/100);
			System.out.println(currentThreshold);
		}
		
		return year;
	}
	
	public static void main(String[] args) {
		int deposit=100;
		int rate = 20;
		int threshold=170;
		
		int year=depositProfit(deposit, rate, threshold);
		System.out.println(year);
	
	}

}
