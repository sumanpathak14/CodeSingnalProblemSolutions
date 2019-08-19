package CodeSignal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsMAC48AddressClass {

	static boolean isMAC48Address(String inputString) {
		Pattern p = Pattern.compile("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");
		Matcher m = p.matcher(inputString);
		return m.find();
	}
	
	public static void main(String[] args) {
		String inputString="00-1B-63-84-45-E6";
		boolean isMACAddress=isMAC48Address(inputString);
		System.out.println(isMACAddress);
	}

}
