package dsa.datastructure.problems.geekforgeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayProgram {

	int maxIndexDiff(int[] arr) {

		int maxdiff = -1;
		int n = arr.length;

		int pmin[] = new int[n];
		int smax[] = new int[n];

		pmin[0] = arr[0];
		for (int i = 1; i < n; i++) {
			
			pmin[i] = Math.min(pmin[i-1], arr[i]);
		}

		smax[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			smax[i] = Math.max(smax[i+1], arr[i]);
		}

		int i = 0;
		int j = 0;
		while (i < n && j < n) {
			if (pmin[i] <= smax[j]) {
				maxdiff = Math.max(maxdiff, j - i);
				j++;
			} else {
				i++;
			}
		}

		return maxdiff;

	}

	public static void main(String args[]) {
		ArrayProgram p = new ArrayProgram();
		int[] i ={1, 10};
		System.out.print(p.maxIndexDiff(i));
		
	}

}
