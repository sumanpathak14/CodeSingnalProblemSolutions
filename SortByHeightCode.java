package CodeSignal;

import java.util.ArrayList;
import java.util.List;

public class SortByHeightCode {

	static int[] sortByHeightNew(int[] a) {
		int[] sortedArray=new int[a.length];
		
		List<Integer> nonTree=new ArrayList<Integer>();
		List<Integer> treeIndex=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			if(a[i]==-1) {
				treeIndex.add(i);
			}
			else {
				nonTree.add(a[i]);
			}
		}
		
		nonTree.sort(null);
		for(int i:treeIndex) {
			sortedArray[i]=-1;
		}
		int k=0;
		for(int j=0;j<sortedArray.length;j++) {
			if(sortedArray[j]!=-1) {
				sortedArray[j]=nonTree.get(k);
				k++;
			}
		}
		
		return sortedArray;
	}
	
	public static void main(String[] args) {
		int[] a= {-1,150,190,170,-1,-1,160,180};
		int[] sortedArray=sortByHeightNew(a);
		for (int i:sortedArray) {
			System.out.println(i);
		}
		
	}

}
