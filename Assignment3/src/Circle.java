public class Circle extends Shape
{
   double radius;
Circle()
{
	super();
	radius=1.0;
}
Circle(double radius)
{
	this.radius=radius;
}
Circle(double radius, String color,boolean filled)
{
	this.radius=radius;
	this.color=color;
	this.filled=filled;
}
double getRadius()
{
	return radius;
}
void setRadius(double radius)
{
	this.radius=radius;
}
double getArea()
{
	return (3.14*radius*radius);
}
double getPerimeter()
{
	return (2*3.14*radius);
}
public String toString()
{
	 return ("A Circle with radius="+radius+", which is subclass of "+super.toString());
}
}
