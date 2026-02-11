package dsa.datastructure.problems.geekforgeek;

public class CountDigit {

	private int countDigit(int n) {
		int ip = 1234;
		int count = 0;
		while(ip > 0) {
			ip = ip / 10;
			count++;
		}
		return count;
	}
	
	private boolean checkPalindrome(int n) {
		int rev = 0;
		int temp = n;
		while (n > 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
			if(temp == rev) {
				return true;
			}
		}
		return false;
	}
	
	private int factorial(int n) {
		int fact = 1;
		for(int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	private int traillingZeros(int n) {
		//factorial and return how many zeros are there?
		// 5 5! = 120, 1 zero return 1, 
//		int count = 0;
//		int fact = 1;
//		for(int i = 2; i <= n; i++) {
//			fact = fact * i;
//		}
//		
//		while(fact % 10 == 0) {
//			count++;
//			fact = fact / 10;
//		}
//		return count;
		
		// how trailing zeros works for each multiplication 5 
		int res = 0;
		
		for(int i = 5; i <= n; i = i*5) {
			res = res + n/i;
		}
		
		return res;
	}
	
	private int gcd(int i, int j) {
		//naive
//		int min = Math.min(i, j);
//		
//		while(min > 0) {
//			if(i % min == 0 && j % min == 0) {
//				break;
//			}
//			min--;
//		}
//		return min;
		
		// enuclied
		
		 if(j == 0) return i;
		 else
			 return gcd(j, i % j);
	}
	
	private int lcm(int i, int j) {
		int max = Math.max(i, j);
		
		while(true) {
			if(max % i == 0 && max % j == 0) {
				break;
			}
			max++;
		}
		return max;	
	}
	
	private boolean prime(int n) {
		
		if(n <= 1) return false;
		if(n == 2 || n==3) return true;
		if(n % 2 ==0 || n%3 == 0) return false;
		for(int i=5; i*i <= n; i = i+6) {
			if(i % n == 0) return false;
		}
		
		return true;
	}
	
	public static void main(String args[]) {
		CountDigit d = new CountDigit();
		System.out.println("count Digit "+d.countDigit(1234));
		
		System.out.println("Palindrom "+d.checkPalindrome(1232));
		
		System.out.println("Factorial "+d.factorial(13));
		
		System.out.println("Zeros are "+d.traillingZeros(15));
		
		System.out.println("GCD or HCM "+d.gcd(15, 10));
		
		System.out.println("LCM "+d.lcm(4, 6));
		
		System.out.println("Prime "+d.prime(18));
		
	}

	
}
