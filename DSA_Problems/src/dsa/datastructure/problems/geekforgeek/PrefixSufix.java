package dsa.datastructure.problems.geekforgeek;

public class PrefixSufix {

	static int preffix(int[] inp) {
		int n = inp.length;
		int[] pref = new int[n];
		
		pref[0] = inp[0];
		for(int i = 1; i < n; i++) {
			pref[i] = pref[i-1]+inp[i];
		}
		
		for (int i = 0; i < pref.length; i++) {
			System.out.println(pref[i]);
		}
		
		return 0;
	}

	static int suffix(int[] inp) {
		int n = inp.length;
		int[] suff = new int[n];
		
		suff[n-1] = inp[n-1];
		for(int i = n-2; i >= 0; i--) {
			suff[i] = suff[i+1]+inp[i];
		}
		
		for (int i = 0; i < suff.length; i++) {
			System.out.println(suff[i]);
		}
		return 0;
	}

	public static void main(String[] args) {
		int inp[] = { 2, 4, 6, 8 };

		PrefixSufix p = new PrefixSufix();
		suffix(inp);
		preffix(inp);
	}

}
