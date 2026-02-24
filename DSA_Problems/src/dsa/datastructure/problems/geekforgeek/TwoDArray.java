package dsa.datastructure.problems.geekforgeek;

public class TwoDArray {

	public static void main(String args[]) {
		int mat[][] = {
				  {1, 2, 3, 4},   // row 0
				  {4, 5, 6, 5},   // row 1
				  {7, 8, 9, 10}    // row 2
				};
		
		System.out.println("mat - row "+mat.length);
		System.out.println("mat - col "+mat[0].length);
		
		int row = mat.length;
		int col = mat[0].length;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.println("total : "+mat[i][j]);
			}
		}
		
	}
	
}
