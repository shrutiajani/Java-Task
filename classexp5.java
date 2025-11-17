package p1;
import java.util.Scanner;
class student
{
	
	  String snm;
	  int rno;
	  int [] marks;
	  int subject;
	  
      void setdetsils()
      {
    	  Scanner Scan =  new Scanner(System.in);
    	  
    	  System.out.println("Enter the name of Student");
    	  snm = Scan.next();
    	  
    	  
    	  System.out.println("Enter the rollno");
    	  rno = Scan.nextInt();
    	  
    	   marks = new int[subject];
    	   
    	   System.out.println("Enter marks of "+subject+"subject");
    	   for(int i=0;i<subject;i++)
    	  
      }
      void displaydetails()
      {
    	  
    	  
    	  
      }

}

public class classexp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
