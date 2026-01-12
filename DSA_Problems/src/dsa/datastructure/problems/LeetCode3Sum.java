package dsa.datastructure.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode3Sum {

	public List<List<Integer>> threeSum(int[] nums) {

		int start = 0;
		boolean flag = true;
		List<List<Integer>> returnans = new ArrayList<List<Integer>>();

		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] != 0) {
				flag = false;
			}
		}
		if (flag) {
			List<Integer> ans = new ArrayList<Integer>();
			ans.add(0);
			ans.add(0);
			ans.add(0);
			returnans.add(ans);
			return returnans;
		}
		Arrays.sort(nums);
		for (int i = 1; i <= nums.length - 2; i++) {
			int sum = nums[start] + nums[i] + nums[i + 1];
			if (sum == 0) {
				returnans.add(Arrays.asList(nums[start], nums[i], nums[i + 1]));
			}
		}

		return returnans;
	}
	
	public static void main(String args[]) {
		LeetCode3Sum leet = new LeetCode3Sum();
		int input[] = {-1,0,1,2,-1,-4};
		System.out.println(leet.threeSum(input));
	}

}
