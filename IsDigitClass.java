package CodeSignal;

public class IsDigitClass {

	static boolean isDigit(char symbol) {
		boolean ifDigit=false;
		
		ifDigit=Character.isDigit(symbol);
		
		return ifDigit;
	}
	
	public static void main(String[] args) {
		char symbol='0';
		boolean ifDigit=isDigit(symbol);
		System.out.println(ifDigit);
	}

}
