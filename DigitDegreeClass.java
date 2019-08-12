package CodeSignal;

public class DigitDegreeClass {
	static int digitDegree(int n) {
		int degree=0;
		int sum=0;
		
		String number = String.valueOf(n);
		if(number.length()==1) {
			return degree;
		}
		for(int i = 0; i < number.length(); i++) {
		    int j = Character.digit(number.charAt(i), 10);
		    sum=sum+j;
		}
		degree++;
		n=sum;
		System.out.println(n);
		sum=0;
		if(n/100!=0||n/10!=0||n/1000!=0||n/10000!=0) {degree++;}
		while(n/10>0) {
			n=n%10;
			sum=sum+n;
			
		}
		
		return degree;
	}
	
	public static void main(String[] args) {
		int n=777773;
		
		int degree=digitDegree(n);
		System.out.println(degree);
	}

}
