
package CodeSignal;

public class FindLucky {

	static boolean isLucky(int n) {
		boolean isLuckyFlag=false;
		int m=n;
		int numOfDigits=0;
		int halfLength=0;
		int[] digitArr= {};
		while(n>0) {
			n=n/10;
			numOfDigits++;
		}
		int counter=0;
		digitArr=new int[numOfDigits];
		halfLength=numOfDigits/2;
		while(m>0) {
			
			digitArr[numOfDigits-1]=m%10;
			
			m=m/10;
			numOfDigits--;
		}
		
		int sum_part1=0;
		int sum_part2=0;
		while(counter<digitArr.length) {
			if(counter<halfLength) {sum_part1=sum_part1+digitArr[counter];}
			else {sum_part2=sum_part2+digitArr[counter];}
			
			counter++;
		}
		
		if(sum_part1==sum_part2) isLuckyFlag=true;
		return isLuckyFlag;
	}
	
	public static void main(String[] args) {
		int n=134008;
		boolean islucky=isLucky(n);
		System.out.println(islucky);
		
	}

}
