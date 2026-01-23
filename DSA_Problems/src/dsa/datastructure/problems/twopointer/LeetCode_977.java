package dsa.datastructure.problems.twopointer;

public class LeetCode_977 {

	public int[] sortedSquares(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		int squares[] = new int[nums.length];
		int highsqr = nums.length-1;
		
		while(end > start) {
			int startSqr = nums[start] * nums[start];
			int endSqr = nums[end] * nums[end];
			if(startSqr > endSqr) {
				squares[highsqr] = startSqr;
				start++;
			} else {
				squares[highsqr] = endSqr;
				end--;
			}
			highsqr--;
		}
		
		return squares;
		
	}

	public static void main(String args[]) {
		LeetCode_977 leet = new LeetCode_977();
		int input[] = {-4,-1,0,3,10};
		int res[] = leet.sortedSquares(input);
		System.out.println(res);
	}
	
}
