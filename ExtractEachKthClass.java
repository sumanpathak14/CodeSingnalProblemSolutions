package CodeSignal;

import java.util.ArrayList;
import java.util.List;

public class ExtractEachKthClass {
	static int[] extractEachKth(int[] inputArray, int k) {
		List<Integer> resultList=new ArrayList<Integer>();
		for(int i=1;i<=inputArray.length;i++) {
			if(i%k!=0) {
				resultList.add(inputArray[i-1]);
			}
		}
		int[] result=resultList.stream().mapToInt(i -> i).toArray();;
		return result;
	}
	
	public static void main(String[] args) {
		int[] inputArray= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int k=3;
		int[] result=extractEachKth(inputArray, k);
		
		for(int r:result) {System.out.println(r);}
	}

}
