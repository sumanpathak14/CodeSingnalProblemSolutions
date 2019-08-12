package CodeSignal;


public class CountCommonCharacter {

	static int commonCharacterCount(String s1, String s2) {
		int commonCount=0;
	    char[] s1ToChar = s1.toCharArray();
	    char[] s2ToChar = s2.toCharArray();
	    for(int i=0;i<s1ToChar.length;i++){
		        for(int j=0;j<s2ToChar.length;j++){
		            if(s1ToChar[i]==s2ToChar[j]){
		                commonCount++;
	                    s2ToChar[j] = Character.MIN_VALUE;
		                break;
		            }
	                
		        }
		    }
	    
	    return commonCount;
	  
	}
	
	public static void main(String[] args) {
		
		String s1="aabcc";
		String s2="adcaa";
		
		//String s1="zzzz";
		//String s2="zzzzzzz";
		
		//String s1="abca";
		//String s2="xyzbac";
		
		int count=commonCharacterCount(s1, s2);
		System.out.println(count);
	}

}
