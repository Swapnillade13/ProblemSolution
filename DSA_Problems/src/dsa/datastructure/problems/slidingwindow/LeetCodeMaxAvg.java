package dsa.datastructure.problems.slidingwindow;

public class LeetCodeMaxAvg {

//	maxSubarrayOfSizeK(3, [2, 1, 5, 1, 3, 2])//9
//	maxSubarrayOfSizeK(2, [2, 3, 4, 1, 5])//7
	
	public int maxSubarrayOfSizeK(int k, int[] nums) {
		int startwindow = 0;
		int windowsum = 0;
		int maxAvg = 0;
		
		for(int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
			windowsum += nums[windowEnd];
			if(windowEnd >= k-1) {
				maxAvg = Math.max(maxAvg, windowsum);
				windowsum -= nums[startwindow];
				startwindow++;
			}
		}
		
		return maxAvg;
	}
	
	public static void main(String args[]) {
		LeetCodeMaxAvg avg = new LeetCodeMaxAvg();
		int input[] = {2, 1, 5, 1, 3, 2};
		System.out.println(avg.maxSubarrayOfSizeK(3, input));
	}
	
	
	
}
