package p1;

import java.util.Scanner;

public class patterns123 extends oddeven {
	
	
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        int num = 1; // starting number

	        for (int i = 1; i <= rows; i++) { 
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num + " ");
	                num += 2; 
	            }
	            System.out.println();
	        }

	        sc.close();
	   
	    }


	    }
