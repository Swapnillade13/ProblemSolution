package dsa.datastructure.problems.geekforgeek;

public class SecondLargest {

	public static void main(String args[]) {
		int[] arr = {1,2,3,4};
		int left = 0;
	       int right = arr.length - 1;
	       
	       while(right > left) {
	           int temp = arr[left];
	           arr[left] = arr[right];
	           arr[right] = temp;
	           
	           left++;
	           right--;
	       }
	       
	      System.out.println(arr);
	}
	
}
