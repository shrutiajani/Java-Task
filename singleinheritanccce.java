package p1;

class person1
{
	
     String name;
     int age;
     person1(String name1,int age1)
     {
    	 
    	 name = name1;
    	 age=age1;
    	 
     }
    	 void display()
    	 {
    		 System.out.println(name+"\t"+age);
    	 }
    	 
    	 
     }
     
class Employee extends person1
{
	
     int salary;
     Employee(String name,int age,int salary1)
     {
    	 
    	 super(name,age);
    	 salary=salary1;
    	 
     }
	void display()
	{
		super.display();
		System.out.println(salary);
		
		
	}
	 }






public class singleinheritanccce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee("xyz",21,30000);
		
		e.display();
		
		
		person1 p = new person1("abc",21);
		p.display();
	}

}
