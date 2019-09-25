package codesignal_interview;

import java.util.HashMap;

public class SumInRangeClass {

	static int sumInRange(int[] nums, int[][] queries) {
		int mod=1000000007;
		int result=nums[0];
		HashMap<Integer, Integer> map=new HashMap<>();
		map.put(0, result);
		
		for(int i=1;i<nums.length;i++) {
			result=result+nums[i];
			map.put(i, result%mod);
		}
		
		result=0;
		
		for (int j=0;j<queries.length;j++) {
			if(queries[j][0]==0) {
				result=result%mod+map.get(queries[j][1])%mod;
			}
			else {
				result=result%mod+map.get(queries[j][1])%mod-map.get(queries[j][0]-1)%mod;
			}
		}
		
		return (result+mod)%mod;
	}
	
	public static void main(String[] args) {
		int[] nums= {3,0,-2,6,-3,2};
		int[][] queries= {{0,2},{2,5},{0,5}};
		int result=sumInRange(nums, queries);
		System.out.println(result);
	}

}
