package codesignal_interview;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwoClass {

	static boolean sumOfTwo(int[] a, int[] b, int v) {
		Set<Integer> s= new HashSet<>();
		for(int n:a) {
			s.add(v-n);
		}
		for(int m:b) {
			if(s.contains(m)) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {10,20,30,40};
		int v=42;
		
		boolean isASum=sumOfTwo(a, b, v);
		System.out.println(isASum);
	}

}
