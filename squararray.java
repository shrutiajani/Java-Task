package p1;

import java.util.Scanner;

public class squararray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		
		 System.out.println("Enter Element:");
		 
		 int  num= scan.nextInt();
		 
		 double [] number = new double[num];
		 
		 for(int i=0;i<num;i++)
		 {	
			 System.out.println("element "+(i+1)+":");
			 number[i] = scan.nextDouble();
		 }
		 for (int i=0;i<num;i++)
		 {
			 double sqrt = Math.sqrt(number[i]);
			 System.out.println(number[i] + " : " + sqrt);
	        }
		 }
		

	}

	
	

