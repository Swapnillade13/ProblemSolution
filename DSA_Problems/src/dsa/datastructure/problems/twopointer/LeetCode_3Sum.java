package dsa.datastructure.problems.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_3Sum {

	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> triples = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++) {
			if(i > 0 && nums[i] == nums[i-1]) {
				continue;
			}
			
			searchForTriple(nums, -nums[i], i+1, triples);
		}
		
		return triples;
	}
	
	private void searchForTriple(int[] nums, int target, int start, List<List<Integer>> triples) {
		int end = nums.length - 1;
		while(start < end) {
			int currsum = nums[start] + nums[end];
			if(currsum == target) {
				triples.add(Arrays.asList(-target, nums[start], nums[end]));
				start++;
				end--;
				
				while(start < end && nums[start] == nums[start-1]) {
					start++;
				} 
				while(start < end && nums[end] == nums[end+1]) {
					end--;
				}
			} else if (currsum < target) {
				start++;
			} else {
				end--;
			}
		}
	}

	public static void main(String args[]) {
		LeetCode_3Sum leet = new LeetCode_3Sum();
		int input[] = { -1,0,1,2,-1,-4 };
		System.out.println(leet.threeSum(input));
	}

}
