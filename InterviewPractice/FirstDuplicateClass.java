package codesignal_interview;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateClass {

	static int firstDuplicate(int[] a) {
		
		Set<Integer> set = new HashSet<>();
		for(int num:a) {
			if(!set.add(num)) {
				return num;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] a= {2, 1, 3, 5, 3, 2};
		int firstDuplicateNumber=firstDuplicate(a);
		System.out.println(firstDuplicateNumber);
	}

}
