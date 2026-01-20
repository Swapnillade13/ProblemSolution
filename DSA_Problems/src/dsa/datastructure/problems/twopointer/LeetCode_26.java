package dsa.datastructure.problems.twopointer;

public class LeetCode_26 {

	public int removeDuplicates(int[] nums) {
        int x = 1;
        int y = 1;
        while(x < nums.length) {
        	if(nums[y - 1] != nums[x]) {
        		nums[y] = nums[x];
        		y++;
        	} 
        	x++;
        }
        return y;
    }
	
	public static void main(String args[]) {
		LeetCode_26 leet = new LeetCode_26();
		int input[] = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(leet.removeDuplicates(input));
	}
	
}
