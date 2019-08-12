package CodeSignal;

public class EvenDigitsClass {

	static boolean evenDigitsOnly(int n) {
		boolean isEven=false;
		
		int m=n;
		int a;
		
		while(m>0) {
			a=m%10;
			if(a%2==0) {
				isEven=true;
			}
			else {isEven=false;break;}
			m=m/10;
		}
		
		return isEven;
	}
	
	
	public static void main(String[] args) {
		int number=642386;
		boolean isEven=evenDigitsOnly(number);
		System.out.println(isEven);
	}

}
