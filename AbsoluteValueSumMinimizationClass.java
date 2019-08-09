package CodeSignal;

public class AbsoluteValueSumMinimizationClass {

	static int absoluteValuesSumMinimization(int[] a) {
		int x=0;
		
		int sum;
		int[] sumArr=new int[a.length];
		for(int i=0;i<a.length;i++) {
			sum=0;
			for(int j=0;j<a.length;j++) {
				sum=sum+Math.abs(a[j]-a[i]);
			}
			sumArr[i]=sum;	
		}
		int min=sumArr[0];
		int index=0;
		for(int k=1;k<sumArr.length;k++) {
			if(sumArr[k]<min) {
				min=sumArr[k];
				index=k;
			}
		}
		
		return a[index];
	}
	
	
	public static void main(String[] args) {
		int[] a = {2, 4, 7};
		int x=absoluteValuesSumMinimization(a);
		System.out.println(x);
	}

}
