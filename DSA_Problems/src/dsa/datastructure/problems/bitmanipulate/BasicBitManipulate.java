package dsa.datastructure.problems.bitmanipulate;

public class BasicBitManipulate {

	private int countingSetBit(int n) {
		int count = 0;
		int temp = n;
		while(temp > 0) {
			count = count + temp&1;
			temp = temp>>1;
		}
		
		return count;
		
	}
	
	public static void main(String args[]) {
		int n =1;
		int k = n-1;
		while (k > 0) {
            if((1<<k) == n) {
            	System.out.println("YES");
            }
            k--;
        }
		System.out.println(1<<n);
		if((1>>n) == n) System.out.println(1>>n);
		else System.out.println("Even");
		
		BasicBitManipulate m = new BasicBitManipulate();
		System.out.println(m.countingSetBit(n));
		
		
	}
	
}
