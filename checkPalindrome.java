package CodeSignal;

public class checkPalindrome {

	public static void main(String[] args) {
		String s="zzzazzazz";
		char[] c=s.toCharArray();
		int j=c.length-1;
		String result="what?";
		for(int i=0;i<c.length;i++) {
			if(c[i]==c[j]) {
				System.out.println("c[i],c[j]:"+c[i]+" "+c[j]);
				result= "It is a palin.";
			}
			else {
				result="what?";
				return;
			}
			j=j-1;
		}
		System.out.println(result);
	}

}
