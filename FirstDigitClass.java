package CodeSignal;


public class FirstDigitClass {

	static char firstDigit(String inputString) {
		char firstChar=Character.MIN_VALUE;
		for(char c : inputString.toCharArray()) {
			if(Character.isDigit(c)) {
				firstChar=c;
				break;
			}
		}
		
		return firstChar;
	}
	
	public static void main(String[] args) {
		String inputString="var_1__Int";
		
		char firstNum=firstDigit(inputString);
		System.out.println(firstNum);
	}

}
