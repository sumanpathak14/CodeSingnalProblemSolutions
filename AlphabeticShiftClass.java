package CodeSignal;

public class AlphabeticShiftClass {

	static String alphabeticShift(String inputString) {
       StringBuilder sb=new StringBuilder();
              
       for (int i=0;i<inputString.length();i++) {
    	   if(inputString.charAt(i)!='z') {
    		sb.append((char)(inputString.charAt(i)+1));  
    	   }
    	   else {
    		   sb.append('a');
    	   }
    	   
       }
       
       return sb.toString();
	}
	
	public static void main(String[] args) {
		String inputString="crazy";
		String outputString=alphabeticShift(inputString);
		System.out.println(outputString);
	}

}
