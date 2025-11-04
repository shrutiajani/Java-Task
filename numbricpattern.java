package p1;
import java.util.Scanner;

public class numbricpattern {
	
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter number value ");
	        int rows = sc.nextInt();  // user input
	        
	        for (int i = 1; i <= rows; i++) {             
	            for (int j = 1; j <= rows - i + 1; j++) { 
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	        
	        sc.close();
	    }
	}
	


