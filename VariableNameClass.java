package CodeSignal;

import java.util.regex.*;

public class VariableNameClass {

	static boolean variableName(String name) {
		boolean isCorrectName=true;
		Pattern p=Pattern.compile("^[_a-zA-Z][a-zA-Z0-9_]*$");
		Matcher m=p.matcher(name);
		isCorrectName=m.matches();
		return isCorrectName;
	}
	
	public static void main(String[] args) {
		String name="var_1__Int";
		boolean isCorrectName=variableName(name);
		System.out.println(isCorrectName);
	}

}
