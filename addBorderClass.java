package CodeSignal;

public class addBorderClass {

	static String[] addBorder(String[] picture) {
		String[] outputArr=new String[picture.length+2];
	    int charLen=picture[0].length()+2;
	    StringBuilder bord=new StringBuilder();
		for(int i=0;i<charLen;i++) {
			bord.append("*");
		}
		outputArr[0]=bord.toString();
		outputArr[picture.length+1]=bord.toString();
		int k=0;
		for(int j=1;j<outputArr.length-1;j++) {
			outputArr[j]="*"+picture[k]+"*";
			k++;
		}
	    return outputArr;
	}
	
	public static void main(String[] args) {
	 String[] inputArr= {"abc","ded"};	
	 String[] outputArr=addBorder(inputArr);
	 
	 for(int i=0;i<outputArr.length;i++) {
		 System.out.println(outputArr[i]);
	 }
	}

}
