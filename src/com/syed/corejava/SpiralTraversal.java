package com.syed.corejava;

/*Given a 2d matrix, print out a clockwise spiral traversal of the matrix.  For example,

[[1, 2, 3],  
 [4, 5, 6],  
 [7, 8, 9]]
should print 1 2 3 6 9 8 7 4 5
*/
public class SpiralTraversal {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		printSpiral(matrix);
	}

	public static void printSpiral(int[][] matrix) {
		if (matrix == null || matrix.length == 0)
			return;

		int rows = matrix.length;
		int cols = matrix[0].length;

		int top = 0, bottom = rows - 1;
		int left = 0, right = cols - 1;

		while (top <= bottom && left <= right) {
			// Print top row (left to right)
			for (int i = left; i <= right; i++) {
				System.out.print(matrix[top][i] + " ");
			}
			top++;

			// Print right column (top to bottom)
			for (int i = top; i <= bottom; i++) {
				System.out.print(matrix[i][right] + " ");
			}
			right--;

			// Print bottom row (right to left) - if top <= bottom
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					System.out.print(matrix[bottom][i] + " ");
				}
				bottom--;
			}

			// Print left column (bottom to top) - if left <= right
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(matrix[i][left] + " ");
				}
				left++;
			}
		}
		System.out.println();
	}

}
