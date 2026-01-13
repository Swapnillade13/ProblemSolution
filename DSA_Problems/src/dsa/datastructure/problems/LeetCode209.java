package dsa.datastructure.problems;

public class LeetCode209 {

	//varible slinding window issue
	public int minSubArrayLen(int target, int[] nums) {
		int windowStart = 0;
		int windowLen = Integer.MAX_VALUE;
		int windowSum = 0;
		
		for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
			windowSum +=  nums[windowEnd]; 
			while(windowSum >= target) {
				windowLen = Math.min(windowLen, windowEnd - windowStart + 1);
				windowSum -= nums[windowStart];
				windowStart++;
			}
		}
		
		return windowLen;
	}
	
	public static void main(String args[]) {
		LeetCode209 leet = new LeetCode209();
		int input[] = {2,3,1,2,4,3};
		int target = 7;
		System.out.println(leet.minSubArrayLen(target, input));
		
	}

}
