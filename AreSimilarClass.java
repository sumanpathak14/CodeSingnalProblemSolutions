package CodeSignal;

import java.util.ArrayList;
import java.util.List;

public class AreSimilarClass {

	static boolean areSimilar(int[] a, int[] b) {
		boolean isSimilar=false;
		
		if(a.length!=b.length) {isSimilar=false;return isSimilar;}
		int count=0;
		int match=0;
        int sum1=0;
        int sum2=0;
        List<Integer> indexes=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			
            sum1=a[i]+sum1;
            sum2=b[i]+sum2;
            if(a[i]==b[i]) {
				count++;
				continue;
			}
			else if (a[i]!=b[i]) {
				match++;
				indexes.add(i);
			}
		}
		if(count==a.length) {isSimilar=true; return isSimilar;}		
		if(sum1!=sum2)
		{
			isSimilar=false; 
			return isSimilar;
		}else {
			
			if(match==2){
				if(a[indexes.get(0)]==b[indexes.get(1)]) {
				isSimilar=true; return isSimilar;
				}
				}
			else if(match!=2){
				
				isSimilar=false; return isSimilar;}
		}

		return isSimilar;
	}
	public static void main(String[] args) {
		int[] a= {1, 1, 4};
		int[] b= {1, 2, 3};
		boolean isSimilar=areSimilar(a, b);
		System.out.println(isSimilar);
	}

}
