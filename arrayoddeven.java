package p1;

import java.util.Scanner;

public class arrayoddeven {
	
	
	 public static void main(String[] args) {
		

		         Scanner scan = new Scanner(System.in);

		         System.out.print("Enter element: ");
		         int n = scan.nextInt();

		         int even = 0, odd = 0;

		         for (int i = 1; i <= n; i++) {
		             System.out.print("Enter number " + i + ": ");
		             int num = scan.nextInt();

		             if (num % 2 == 0)
		                 even++;
		             else
		                 odd++;
		         }

		         System.out.println("Odd = " + odd);
		         System.out.println("Even = " + even);
		     }
		 }


