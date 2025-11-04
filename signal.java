package prectice;

import java.util.Scanner;


public class signal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 System.out.println("Enter the color ");
		 String col = scan.next();
		 
		 
		 if(col.equals("red"))
			 {
			    
			     System.out.println("STOP");
			 
			 }
		 else if (col.equals("yellow"))
		 {
			 
			 System.out.println("slow");
		 }
		 
		 else if (col.equals("green"))
		 {
			 System.out.println("GO");
		 }
		 else
		 {
			 System.out.println("please enter vaild color");
		 }
	}

}
