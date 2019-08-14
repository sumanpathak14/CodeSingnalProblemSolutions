package CodeSignal;

public class BuildPalindromeClass {

	static boolean checkPalindrome(String s) {
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(s.length()-1-i)!=s.charAt(i)) {return false;}
		}
		
		return true;
	}
	
	static String buildPalindrome(String st) {
		String temp = (new StringBuilder(st).reverse()).toString();
		if(checkPalindrome(st)) {
			return st;
		}
		for(int i=0;i<st.length();i++) {
			if(checkPalindrome(st+temp.substring(temp.length()-1-i))) {
				return st+temp.substring(temp.length()-1-i);
			}
		}
		return st+temp.substring(1);
	}

	
	
	public static void main(String[] args) {
		String st ="abcdc";
		String palindrome=buildPalindrome(st);
		
		System.out.println(palindrome);
	}

}
