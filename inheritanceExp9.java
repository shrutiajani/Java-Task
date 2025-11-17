package p1;


class Emp
{
	String name;
	int id;

	
	    Emp(String name,int id)
	{
		
		this.name=name;
		this.id=id;
		
		
	}
        void work()
        {
        	System.out.println("id:"+id);
          System.out.println(name+"is working");
        	
        }
}
class Doctor extends Emp
{
          
	 Doctor(String name, int id) {
		super(name, id);
		
	}

	 void work() 
	 {
		 
		 System.out.println(name+" is help to patitent for tritment ");
		 
		
		 
	 }
	 
	 

}
class Nurse extends Emp
{

	Nurse(String name, int id) {
		super(name, id);
		
		
		
	}
	void work()
	{
		
		 System.out.println(name+" is help to Doctor ");
		 
	}
	
	


}
class Receptionist extends Emp
{

	Receptionist(String name, int id) {
		super(name, id);
		
	}
	void work()
	{
		
		
		 System.out.println(name+" is working ");
		 
	}
	


}
public class inheritanceExp9 {

	public static void main(String[] args) {
		
	   
		Emp e = new Emp("shruti",101);
	    e.work();
	    Doctor d = new Doctor("neha",1001);
	    d.work();
	    Nurse n = new Nurse("mona",1004);
	    n.work();
	    Receptionist r = new Receptionist("neelam",1003);
	    r.work();
	    
		
	}

}
