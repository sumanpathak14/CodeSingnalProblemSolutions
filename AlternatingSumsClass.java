package CodeSignal;

import java.util.ArrayList;
import java.util.List;

public class AlternatingSumsClass {

	static int[] alternatingSums(int[] a) {
		List<Integer> line1=new ArrayList<Integer>();
		List<Integer> line2=new ArrayList<Integer>();
		
		int flag=0;
		for(int i=0;i<a.length;i++) {
			if(flag==0) {
				line1.add(a[i]);
				flag=1;
				
			}
			else {
				line2.add(a[i]);
				flag=0;
				
			}
			
		}
		int sumLine1=0;
		int sumLine2=0;
		int[] result=new int[2];
		for(int i=0;i<line1.size();i++) {
			
			sumLine1=sumLine1+line1.get(i);
		}
		for(int i=0;i<line2.size();i++) {
			
			sumLine2=sumLine2+line2.get(i);
		}
		result[0]=sumLine1;
		result[1]=sumLine2;
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] a= {50, 60, 60, 45, 70};
		int[] b=alternatingSums(a);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
