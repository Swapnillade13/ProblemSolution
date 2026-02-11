package dsa.datastructure.problems.geekforgeek;

import java.util.ArrayList;

public class positorDivisor {

	static ArrayList<Integer> printDivisors(int n) {
		ArrayList<Integer> divisors = new ArrayList<>();
		for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

                // If divisors are equal, add only once
                if (n / i == i) {
                    divisors.add(i);
                }
                // Otherwise add both
                else {
                    divisors.add(i);
                    divisors.add(n / i);
                }
            }
		}
		
		divisors.sort(null);
		
		
		return divisors;
	}

	public static void main(String[] args) {
		ArrayList<Integer> divisors = printDivisors(10);
		for (int divs : divisors) {
			System.out.print(divs + " ");
		}
	}

}
