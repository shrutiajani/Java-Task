package p1;

import java.util.Scanner;

public class additionmatrix {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter matrix row value:");
		int row = scan.nextInt();

		System.out.println("Enter matrix column value :");
		int col = scan.nextInt();

		int[][] metrix = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				System.out.print("Element [" + i + "][" + j + "]: ");
				metrix[i][j] = scan.nextInt();

			}
		}
			
		int[][] metrix1 = new int[row][col];
	
			
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {

					System.out.print("Element [" + i + "][" + j + "]: ");
					metrix1[i][j] = scan.nextInt();

				}
			}
			
			  System.out.println("\n First Matrix is:");
			for ( int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(metrix[i][j] + " ");
				}
				System.out.println();

			}
				System.out.println("\n Second Matrix is:");
				for ( int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						System.out.print(metrix1[i][j] + " ");
					}
					System.out.println();

				}
                  System.out.println("addition of matrix's:-");
				int add_metrix[][]=new int[row][col];
				
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						add_metrix[i][j]=metrix[i][j]+metrix1[i][j];
						
					}
				}
				
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						System.out.print("\t"+add_metrix[i][j]);
					}
					System.out.println();
				}
				
				  
				
		

	}
}
