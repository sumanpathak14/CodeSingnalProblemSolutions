package CodeSignal;

public class ValidTimeClass {

	static boolean validTime(String time) {
		boolean isValid=true;
		String[] s = time.split(":");
		if(Integer.parseInt(s[0])>23||Integer.parseInt(s[1])>59) {
			isValid=false;
		}
		
		return isValid;
	}
	
	public static void main(String[] args) {
		String time= "13:58";
		boolean isValid=validTime(time);
		
		System.out.println(isValid);
	}

}
