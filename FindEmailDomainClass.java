package CodeSignal;

public class FindEmailDomainClass {
	static String findEmailDomain(String address) {
		String emailDomain="";
				
		emailDomain = address.substring(address.lastIndexOf("@") + 1);
		
		return emailDomain;
	}
	
	public static void main(String[] args) {
		String address="prettyandsimple@example.com";
		String emailDomain=findEmailDomain(address);
		
		System.out.println(emailDomain);
	}

}
