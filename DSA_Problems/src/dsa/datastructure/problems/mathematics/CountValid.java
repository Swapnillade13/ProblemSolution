package dsa.datastructure.problems.mathematics;

public class CountValid {

	public int countValid(int n, int[] arr) {

		boolean marking[] = new boolean[10];
        for(int i = 0; i < arr.length; i++) {
            marking[arr[i]] = true;
        }
        
        int countallow = 0;
        int countZero = 0;
        
        for(int i = 0; i <= 9; i++) {
            if(!marking[i]) {
                countallow++;
                countZero++;
            }
            if(i == 0) {
                countZero++;
            }
        }
        
        long total =  (long)9 * (long)(Math.pow(10, n-1));
        long exclude =  (long)countZero * (long)(Math.pow(countallow, n-1));
        
        long ans = total - exclude;
        
        return (int)ans;
        
        
    }


	public static void main(String args[]) {
		CountValid valid = new CountValid();
		int inp[] = {1, 2, 3};
		System.out.println(valid.countValid(6, inp));
	}

}
