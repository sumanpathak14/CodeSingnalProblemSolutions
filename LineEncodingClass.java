package CodeSignal;

public class LineEncodingClass {

	static String lineEncoding(String s) {
		StringBuilder sb1=new StringBuilder();
		char[] sCharArray=s.toCharArray();
		char currentChar=sCharArray[0];
		char previousChar=sCharArray[0];
		int currentCount=0;
		for(char c:sCharArray) {
			if(c==currentChar) {
				currentCount++;
			}
			else {
				if(currentCount>1) {
					sb1.append(currentCount);
					sb1.append(previousChar);
				}else if(currentCount==1) {
					
					sb1.append(previousChar);
				}
				
				currentCount=0;
				currentCount++;
				currentChar=c;
				previousChar=c;
			}
		}
		 if(currentCount==1) {
			 sb1.append(currentChar);
		 }
		 else {
			 sb1.append(currentCount);
			 sb1.append(previousChar);
		 }
		
		return sb1.toString();
	}
	
	public static void main(String[] args) {
		String s ="abbcabb";
		String encodedString=lineEncoding(s);
		System.out.println(encodedString);
	}

}
