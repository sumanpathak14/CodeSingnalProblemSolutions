package CodeSignal;

public class DigitsProductClass {
	
	static int digitsProduct(int product) {
		
		if (product < 10)
	        return product > 0? product:10;
	    String r = "";
	    for (int i = 9; i > 1; i--) {
	        while (product % i == 0) {
	        	product /= i;
	            r = Character.toString((char)('0' + i))  + r;
	            
	        }
	    }
	    return product != 1 ? -1 : Integer.parseInt(r);
		
	}
	
	
	public static void main(String[] args) {
		int product=33;
		int number=digitsProduct(product);
		System.out.println(number);
	}

}
