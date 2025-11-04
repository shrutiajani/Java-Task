package bitwiseop;

import java.util.Scanner;

public class nestedternary {

	public static void main(String[] args) {
		
		
Scanner scan= new Scanner (System.in);
		
	
		
		
		System.out.println("Enter first number:");
		
		
		int a = scan.nextInt();
		
		
		System.out.println("Enter second number:");
		
		
		int b = scan.nextInt();
		
		
	System.out.println("Enter third number:");
		
		
		int c = scan.nextInt();
		
		
		int greatestes = (a>b)?(a>c)?a:c:((b>c)?b:c);
		
	    System.out.println("The greatest  number:"+ greatestes);
		
		scan.close();
		
		
		
		
		
	}

}
