package CodeSignal;

public class IsIPV4AddressClass {

	static boolean isIPv4Address(String inputString) {
		boolean isIPv4=false;
		
		//retrieve all four elements of the IPv4 address
		String[] parts=inputString.split("[.]");
		
		
		for(int i=0;i<parts.length;i++) {
			System.out.println(parts[i]);
		}
		//check all the elements and their range, update the flag accordingly
		if(parts.length<4||parts.length>4) {
			return isIPv4;
		}
		
		for(int i=0;i<parts.length;i++) {
			if(parts[i]==""||parts[i].isEmpty()||parts[i].length()>3) {
				
				isIPv4=false;break;
				
			}
			else {
				
				if(!parts[i].matches(".*[a-z].*")) {
					if((Integer.parseInt(parts[i]))>255 || (Integer.parseInt(parts[i]))<0) {
						isIPv4=false;break;
					}
					else {
						isIPv4=true;
					}
				}
				else {
					isIPv4=false;break;
				}
			}
		}
		return isIPv4;
	}
	public static void main(String[] args) {
		//String inputString="7283728";
		//String inputString="0..1.0.0";
		String inputString="129380129831213981.255.255.255";
		/*String inputString="255.255.255.255abcdekjhf";*/
		boolean isIPv4=isIPv4Address(inputString);
		System.out.println(isIPv4);
	}

}
