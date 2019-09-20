package codesignal_interview;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicatesClass {

	static boolean containsDuplicates(int[] a) {
		Set<Integer> s=new HashSet<Integer>();
		for(int i:a) {
			if(!s.add(i)) return true;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] a = {1,2,3,1};
		boolean conDuplicates=containsDuplicates(a);
		System.out.println(conDuplicates);
		
	}

}
