package CodeSignal;

public class IsBeautifulStringClass {

	static boolean isBeautifulString(String inputString) {
		int[] abc = new int[26];
	    char[] s = inputString.toCharArray();
	    for(char c: s){
	    	abc[c - 97]++;
	        
	    }
	    int t = inputString.length();
	    
	    for(int i: abc){
	    	
	        if(t < i)
	            return false;
	        else
	            t = i;
	    }
	    return true;
	}
	
	
	public static void main(String[] args) {
		String inputString ="bbc";
		boolean isBeautiful=isBeautifulString(inputString);
		
		System.out.println(isBeautiful);
	}

}
