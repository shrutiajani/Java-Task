package p1;

import java.util.Scanner;

public class matrixdynamic {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int [][] matrix;
		
		System.out.println("Enter the row ");
		int row= scan.nextInt();
		
		matrix= new int[row][];
		
		for(int i=0;i<row;i++)
		{
			System.out.println("Enter the of column "+i+" th row");
			int col=scan.nextInt();
			matrix[i]=new int[col];
		
			  for(int j=0;j<col;j++)
			  {
				  
				  System.out.println("Enter element");
				  matrix[i][j]=scan.nextInt();
				  
			  }
		}
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			System.out.print("\t"+matrix[i][j]);
		}
		System.out.println();
	}

}
