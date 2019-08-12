package CodeSignal;


public class LongestDigitsPrefixClass {
	static String longestDigitsPrefix(String inputString) {
		String prefix="";
		char[] inputChar=inputString.toCharArray();
			
		StringBuilder prefixtemp=new StringBuilder();
		for(int i=0;i<inputChar.length;i++) {
			if(i==0) {
				if(!Character.isDigit(inputChar[i])) {
					break;
				}
			}
			if(Character.isDigit(inputChar[i])) {
				prefixtemp.append(inputChar[i]);
			}
			else if(Character.isAlphabetic(inputChar[i])){
				prefix=prefixtemp.toString();
				break;
			}
			if(i==inputChar.length-1){
				prefix=prefixtemp.toString();
			}
		}
			
		return prefix;
	}
	public static void main(String[] args) {
		String inputString="1j2c42ciu5ie99xr0vq5w1slwhq985fp2239qc196d66m";
		String prefix=longestDigitsPrefix(inputString);
		System.out.println(prefix);
	}

}
