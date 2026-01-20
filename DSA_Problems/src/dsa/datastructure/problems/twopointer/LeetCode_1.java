package dsa.datastructure.problems.twopointer;

import java.util.HashMap;

public class LeetCode_1 {

	public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int sum = 0;
        int ret[] = new int[2];
//        while(end > start) {
//            sum = nums[start] + nums[end];
//            if(sum < target) {
//                end--;
//            } else if (sum > target) {
//                start++;
//            } else if (sum == target) {
//            	ret[0] = start;
//            	ret[1] = end;
//                return ret;
//            }
//        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int item = 0; item < nums.length; item++) {
        	map.put(nums[item], item);
        	int x = target - nums[item];
        	if(map.containsKey(x)) {
        		ret[0] = item;
            	ret[1] = map.get(x);
                return ret;
        	}
        }

        return null;
    }
	
	public static void main (String args[]) {
		LeetCode_1 leet = new LeetCode_1();
		int input[] = {2,7,11,15};
		System.out.println(leet.twoSum(input, 9));
	}
	
}
