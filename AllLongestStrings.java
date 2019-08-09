package CodeSignal;

public class AllLongestStrings {

	static String[] getAllLongestStrings(String[] inputArray) {
		String[] outputArray= {};
		int max_length=0;
		int occurence=0;
		for (int i=0;i<inputArray.length;i++) {
			if (inputArray[i].length()>max_length) {
				max_length=inputArray[i].length();
			}
		}
		int j=0;
		outputArray= new String[inputArray.length];
		for (int i=0;i<inputArray.length;i++) {
			if (inputArray[i].length()==max_length) {
				outputArray[j]=inputArray[i];
				j++;
				occurence++;
			}
		}
		
		
		String[] out=new String[occurence];
		
		for(int z=0;z<occurence;z++) {
			out[z]=outputArray[z];
		}
		
		return out;
	}
	
	
	public static void main(String[] args) {
		String[] input={"aba", 
		                "aa", 
		                "ad", 
		                "vcd", 
		                "aba"};
		
		String[] out= getAllLongestStrings(input);
		System.out.println(out);
		

	}

}
