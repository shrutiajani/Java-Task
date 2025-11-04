package p1;

import java.util.Scanner;

public class pattern4 extends oddeven {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value ");
		int num = scan.nextInt();
		
		
		for(int i=0;i<=num;i++)
		{
		
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
		for( int i= num-1;i>=1;i--)
		{
		
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		
		}
		
    }
	
}


