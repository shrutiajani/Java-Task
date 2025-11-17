package p1;

import java.util.Scanner;

public class aplhapattern extends oddeven {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value ");
		int num = scan.nextInt();
		
		
		for(int i=1;i<=num;i++)
		{
		
			for(char j='A';j<='A'+i;j++)
			{
				System.out.print(j+"");
			}
		System.out.println();
		}
		for( int i= num-1;i>=1;i--)
		{
		
			for(char j='A';j<='A'+i;j++)
			{
				System.out.print(j+"");
			}
		System.out.println();
		
		}
		
    }
}
