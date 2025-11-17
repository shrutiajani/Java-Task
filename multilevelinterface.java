package p1;

class Animal
{
	
    void eat()
    {
    	
    	System.out.println("Animal can eat");
    }
    
}
class mammal extends Animal
{
	
    void walk()
    {
    	
    	System.out.println("Mammal can walk");
    }
    
    

}
class Dog extends mammal
{
	
  void bark()
  {
	  
	  System.out.println("Dog can bark");
  }


}


public class multilevelinterface {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		d.walk();
		d.bark();

	}

}
