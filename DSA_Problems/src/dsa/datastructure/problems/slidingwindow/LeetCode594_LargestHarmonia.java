package dsa.datastructure.problems.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LeetCode594_LargestHarmonia {

	public int findLHS(int[] nums) {

		int maxLen = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num = 0; num < nums.length; num++) {
			map.put(nums[num], map.getOrDefault(nums[num], 0) + 1);
		}

		for (int key : map.keySet()) {
			if(map.containsKey(key+1)) {
				maxLen = Math.max(maxLen, (map.get(key) + map.get(key+1)));
			}
		}

		return maxLen;
	}
	
	public static void main(String args[]) {
		LeetCode594_LargestHarmonia leet = new LeetCode594_LargestHarmonia();
		int input[] = {1,2,3,4};
		System.out.println(leet.findLHS(input));
	}
	
}
