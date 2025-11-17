package p1;
class Shape
{
}
class Circle extends Shape
{
	int radius;
	Circle(int radius1)
	{
		radius=radius1;
	}
	float calculateArea() {
		
		float area=2*3.14f*radius;
		return area;
	}
}
class Rectangle extends Shape
{
	
      int l,b;
      Rectangle(int l1,int b1)
      {
    	  
    	  l=l1;
    	  b=b1;
    	  
      }
      float calculateArea()
      {
      float area=l*b;
      return area;
      }
}
class Triangle extends Shape
{
	
     int bi,h;
     Triangle(int b2,int h1)
     {
    	 bi=b2;
    	 h=h1;
    	 
     }
     float calculateArea()
     {
    	 
    	 float area = 0.5f * bi * h;
         return area;
    	 
     }
}
class square extends Shape
{
	int side,side1;
	square(int side2,int sidee)
	{
		side=side2;
		side= sidee;
	}
	
	
	float calculateArea()
	{
		
		
		 float area = 2 * side;
		 return area;

		
	}


}






public class inheritanceexp5 {

	public static void main(String[] args) {
	
		
		Circle c=new Circle(16);
		float ans=c.calculateArea();
		System.out.println("Area of Circle "+ans);
		Rectangle r =new  Rectangle(20,20);
		float a = r.calculateArea();
		System.out.println("Area of Rectangle "+a);
		Triangle t = new Triangle(12,12);
		float a1=t.calculateArea();
		System.out.println("Area of Triangle"+a1);
		square s = new square(12,12);       
        float ann = s.calculateArea(); 
		System.out.println("Area of square"+ann);
		
	}

}
