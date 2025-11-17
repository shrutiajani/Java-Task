package p1;

class vehicle
{
	
	String brand;

      vehicle(String b)
      {
    	  
    	  brand=b;
    	  
    	  
    	  
      }



}

class car extends vehicle
{
	  String model;
	  
         car(String b,String m)
        {
        	 super(b);
    	      model=m;
    	  
  
        }



     void display()
     {
    	 System.out.println("Car brand name:-"+brand);
    	 System.out.println("Car model name:-"+model);
    	 
     }
       

}
 
public class inheritanceexp6 {

	public static void main(String[] args) {
		
		
		car c = new car("Tata","Nexon");
		c.display();
	}

}
