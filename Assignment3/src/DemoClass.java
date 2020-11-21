public class DemoClass 
{
	public static void main(String args[]) 
	{  
  Circle obj=new Circle(4.2,"black",true);
  Rectangle r=new Rectangle();
  Square s=new Square(2.0,"pink",false);
  System.out.println("Area of circle="+obj.getArea());
  System.out.println("Perimeter of circle="+obj.getPerimeter()); 
  System.out.println(obj);
  System.out.println("Area of rectangle="+r.getArea());
  System.out.println("Perimeter of rectangle="+r.getPerimeter());
  System.out.println(r);
  System.out.println("Area of square="+s.getArea());
  System.out.println("Perimeter of square="+s.getPerimeter());
  System.out.println(s);
	}
  }
