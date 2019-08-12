package CodeSignal;

import java.util.*;


public class reverseStringInParantheses {

	static String reverseInParentheses(String inputString) 
	{
		int iCountParent = 0;
		int iPosAdd = 0;
		
		if (!inputString.contains("(") || !inputString.contains(")")) return inputString;
		
		List<Integer> lstCharFirst = new ArrayList<Integer>();
		List<Integer> lstCharSecond = new ArrayList<Integer>();
		String[] arrInput = inputString.split("");
		
		
		for (int i = 0; i < arrInput.length; i++) {
			if (arrInput[i].equals("(")) {
				if (iCountParent >= 1) {
					lstCharFirst.add(iPosAdd, i);
				} else {
					lstCharFirst.add(i);
				}
				iCountParent++;
			}
			if (arrInput[i].equals(")")) {
				lstCharSecond.add(i);
				iCountParent--;
				if (iCountParent == 0) {
					iPosAdd = lstCharFirst.size();
				}
			}
		}
		
		String sInParent = inputString.replaceAll("\\("," ").replaceAll("\\)"," ");
		
		String sTempOld = "";
		String sTempNew = "";
		
		for (int i = 0; i < lstCharSecond.size(); i++) {
			
			sTempOld = sInParent.substring(lstCharFirst.get(i), lstCharSecond.get(i) + 1);
			sTempNew = reverseString(sTempOld);
			sInParent = sInParent.replaceAll(sTempOld, sTempNew);
		}
		
		return sInParent.replaceAll(" ","");
	}

	static String reverseString(String input) 
	{
		String sInput = input;
		StringBuilder sResult = new StringBuilder(sInput);
		StringBuilder sResult1 = new StringBuilder(sInput);
		char cFirstHalf;
		char cSecondHalf;
		for (int i = 0; i < sResult.length() / 2; i++) {
		cFirstHalf = sResult.charAt(i);
		cSecondHalf = sResult.charAt(sResult.length()- (i + 1));
		sResult.setCharAt(i, cSecondHalf);
		sResult.setCharAt(sResult.length() - (i + 1), cFirstHalf);
		}
		
		String output=sResult1.reverse().toString();
		System.out.println(sResult.toString());
		
		//return sResult.toString();
		return output;
	}
	
	public static void main(String[] args) {
		String input="foo(bar)baz(blim)";
		String output="";
		
		output=reverseInParentheses(input);
		System.out.println(output);

	}
	
}
