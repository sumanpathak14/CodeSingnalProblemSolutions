package CodeSignal;

import java.util.HashMap;
import java.util.Map;

public class palindromeRearrangingClass {

	static boolean palindromeRearranging(String inputString) {
		boolean isPalin=false;
		char[] c=inputString.toCharArray();
		HashMap<Character, Integer> elCount=new HashMap<Character, Integer>();
		
		for(char x : c) {
			if(elCount.containsKey(x)) {
				elCount.put(x, elCount.get(x)+1);
			}
			else {
				elCount.put(x, 1);
			}
		}
		
		int count =0;
		for(Map.Entry<Character,Integer> entry: elCount.entrySet()) {
			if((Integer)(entry.getValue())%2==0) {
				count++;
			}
		}
		
		if(count==elCount.size()||count==elCount.size()-1) {
			isPalin=true;
		}
		
		return isPalin;
	}
	
	public static void main(String[] args) {
		
		String inputString="abbcabb";
		boolean isPalin=palindromeRearranging(inputString);
		System.out.println(isPalin);
	}

}
