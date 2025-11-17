package p1;

import java.util.Scanner;

public class dynamicarr {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter matrix row value:");
		int row = scan.nextInt();

		System.out.println("Enter matrix column value :");
		int col = scan.nextInt();

		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				System.out.print("Element [" + i + "][" + j + "]: ");
				arr[i][j] = scan.nextInt();

			}
		}
			
			System.out.println("\nMatrix is:");
			for ( int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();

			}

		

	}
}
