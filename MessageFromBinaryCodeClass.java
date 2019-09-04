package CodeSignal;

public class MessageFromBinaryCodeClass {

	static String messageFromBinaryCode(String code) {
		String message="";
		
		char nextChar;
		
		for(int i=0;i<=code.length()-8;i=i+8) {
			nextChar=(char)Integer.parseInt(code.substring(i,i+8),2);
			message+=nextChar;
		}
		
		return message;
	}
	
	public static void main(String[] args) {
		String code ="01001101011000010111100100100000011101000110100001100101001000000100011001101111011100100110001101100101001000000110001001100101001000000111011101101001011101000110100000100000011110010110111101110101";
		String message=messageFromBinaryCode(code);
		System.out.println(message);
	}

}
