package p1;

import java.util.Scanner;


class book
{
	
	String authorname,book_title;
	int price,Quntity,tp;
	
	
   void set_Details()
   {
	   
	   Scanner scan = new Scanner(System.in);	
	   
	   System.out.println("Enter Book Title ");
	    book_title= scan.next();
	
	    System.out.println("Enter Author name ");
         authorname= scan.next();
	
	   System.out.println("Enter book price ");
	    price = scan.nextInt();
	
	    System.out.println("Enter book contity ");
	    Quntity= scan.nextInt();
	
	
	   
	   
   }
   void total_price()
   {
	 tp=  price * Quntity;
	  
   }
   void display_Details()
   {
	   System.out.println("-------BOOK information------------");
	   System.out.println("BOOk TITLE:-"+book_title);
	   System.out.println("BOOk AUTHORNAME:-"+authorname);
	   System.out.println("BOOk PRICE:-"+price);
	   System.out.println("BOOk CONTITY:-"+Quntity);
	   System.out.println("TOTAL PRICE:-"+book_title);
	   System.out.println("TOTAL PRICE:-"+tp);
	   
	   
   }
}
public class bookclasssexp {

	public static void main(String[] args) {
		

		book b1 = new book();
		b1.set_Details();
		b1.total_price();
		b1.display_Details();
		
		  

	}

}
