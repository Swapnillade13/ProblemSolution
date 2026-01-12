package dsa.datastructure.problems;

public class LeetCode643 {

	public double findMaxAverage(int[] nums, int k) {
		int windowStart = 0;
		double sum = 0;
		double maxSum = Double.NEGATIVE_INFINITY;
		if(nums.length == 1) {
			return (double) nums[0];
		}
		for(int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
			sum += nums[windowEnd];
			if(windowEnd >= k -1) {
				double avg = sum / k;
				maxSum = Math.max(maxSum, avg);
				sum -= nums[windowStart];
				windowStart++;
			}
		}
		
		return maxSum;
	}
	
	public static void main(String args[]) {
		LeetCode643 leet = new LeetCode643();
		int input[] = {4,0,4,3,3};
		
		System.out.println(leet.findMaxAverage(input, 5));
	}

}
