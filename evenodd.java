package p1;
import java.util.Scanner;

public class evenodd extends oddeven {

	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter any number: ");
	        int num = sc.nextInt();

	        int even = 0, odd = 0;
	        int temp = num; // store original number for reference

	        while (temp > 0) {
	            int digit = temp % 10;  // extract last digit
	            if (digit % 2 == 0) {
	                even++;
	            } else {
	                odd++;
	            }
	            temp = temp / 10;  // remove last digit
	        }

	        System.out.println("Number: " + num);
	        System.out.println("Even digits: " + even);
	        System.out.println("Odd digits: " + odd);

	        sc.close();
	    }
	}


	

