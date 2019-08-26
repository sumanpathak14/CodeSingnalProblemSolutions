package CodeSignal;

public class LongestWordClass {

	static String longestWord(String text) {
		String[] s = text.split("[^a-zA-Z]");
	    String t = "";
	    for(int i = 0; i < s.length;i++){
	        if(s[i].length() > t.length() )
	            t = s[i];
	    }
	    return t;
	}
	
	public static void main(String[] args) {
		String text="Ready, steady, go!";
		String longest=longestWord(text);
		System.out.println(longest);
	}

}
