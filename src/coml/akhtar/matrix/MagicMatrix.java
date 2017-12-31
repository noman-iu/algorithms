package coml.akhtar.matrix;

import java.util.Scanner;

import com.akhtar.utils.Utils;

/**
 * @author akhtar
 */

public class MagicMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter an odd number");
		int n = sc.nextInt();
		System.out.println("Magic sum is - " + n * (Math.pow(n, 2)+ 1) / 2);
		MagicMatrix.magicMatrix(n);
	}

	public static void magicMatrix(int n) {
		int row = n / 2;
		int col = n - 1;
		int matrix[][] = new int[n][n];
		for (int k = 1; k <= n * n; ) {

			if (row == -1 && col == n) {//3rd condition
				row = 0;
				col = n - 2;
			}
			if (row < 0) {
				row = n - 1;
			}
			if (col == n) {
				col = 0;
			}
			if (matrix[row][col] != 0) {//2nd condition
				col = col - 2;
				row = row + 1;
				continue;
			}
			matrix[row][col] = k;
			System.out.println("("+row + ","+col+" , "+k+")");
			row = row - 1;
			col = col + 1;
			k++;
			
		}
		Utils.print2DArray(matrix,n,n);

	}
}
