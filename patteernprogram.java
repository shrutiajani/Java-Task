package p1;
import java.util.Scanner;

public class patteernprogram extends oddeven {

	
	
	 public static void main(String[] args) {
		 
		 Scanner scan= new Scanner(System.in);
		 
		 System.out.println("Enter the value");
		 int num= scan.nextInt();
		 
		 for(int i=0;i<=num;i++)
		 {
			 
			 for (int j=0;j<=i;j++)
			 {
				 System.out.print(" *");
				 
			 }
			 System.out.println("");
		 }
		 
		
}
}
