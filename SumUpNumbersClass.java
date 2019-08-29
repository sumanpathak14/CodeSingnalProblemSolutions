package CodeSignal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumUpNumbersClass {

	static int sumUpNumbers(String inputString) {
		int sum=0;
		
		Pattern p = Pattern.compile("[0-9]+");
	    Matcher m = p.matcher(inputString);
	    while(m.find()) {
	    	sum += Integer.parseInt(inputString.substring(m.start(),m.end()));
	    }
		
		return sum;
	}
	
	public static void main(String[] args) {
		String inputString="there are some (12) digits 5566 in this 770 string 239";
		int sum=sumUpNumbers(inputString);
		System.out.println(sum);
	}

}
