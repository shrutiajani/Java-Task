package p1;

import java.util.Scanner;

public class divisby5and7array {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		 System.out.println("Enter the value:");
		 
		 int num= scan.nextInt();
		 
		 int [] number = new int[num];
		 
		 for (int i = 1; i<num;i++) {
			 number[i]=i+1;
			 
			 if(number[i] % 5 == 0 && number[i] % 7 == 0)
			 {
				 
				 System.out.print(number[i] + " ");
				 
			 }
			 
			 
			 
		 }
	          
		
		
	}
		
		
		
		
	}
	

