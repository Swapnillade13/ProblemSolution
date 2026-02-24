package dsa.datastructure.problems.bitmanipulate;

public class CountSetBit {

	public static int countSetBits(int n) { 
		int count = 0;
		
		for(int bit = 0; bit < 32; bit++) {
			int cycleLen = (1 << (bit+1));
			
			if (cycleLen > n + 1) break;
			
			int fullLen = (n+1)/cycleLen;
			count = count + fullLen * (cycleLen / 2);
			
			int reminder = (n+1) % cycleLen;
			count = count + Math.max(0, reminder - (cycleLen / 2));
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		System.out.println(countSetBits(4));
		
	}

}
