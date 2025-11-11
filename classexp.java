package p1;

import java.util.Scanner;

class person 
{
	    String name;
        int age;	

        
        void set(String n,int a)
        {
        
        	name=n;
        	age=a;
        	
        
        }
        void display()
        {
        	System.out.println(name+"\t"+age);
        }
}
public class classexp {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);	
	
	    System.out.println("Enter name ");
	    String nm = scan.next();
	
	    System.out.println("Enter age ");
	   int  age = scan.nextInt();
	
	   System.out.println("Enter name ");
	    String nm1 = scan.next();
	
	    System.out.println("Enter age ");
	   int  age1 = scan.nextInt();
	
		
		person p = new person();
		p.set(nm,age);
		p.display();
		
		person p1 = new person();
		p1.set(nm1,age1);
		p1.display();
		
		
	}

}
