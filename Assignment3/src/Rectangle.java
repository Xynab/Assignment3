public class Rectangle extends Shape
{
	double width,length;
	Rectangle()
	{
		super();
		width=length=1.0;
	}
	Rectangle(double width,double length)
	{
		this.width=width;
		this.length=length;
	}
	Rectangle(double width,double length, String color,boolean filled)
	{
		this.width=width;
		this.length=length;
		this.color=color;
		this.filled=filled;
	}
	double getWidth()
	{
		return width;
	}
	void setWidth(double width)
	{
		this.width=width;
	}
	double getLength()
	{
		return length;
	}
	void setLength(double length)
	{
		this.length=length;
	}
	double getArea()
	{
		return (length*width);
	}
	double getPerimeter()
	{
		return (2*(length+width));
	}
	public String toString()
	{
		 return ("A Rectangle with width="+width+" and length="+length+", which is subclass of "+super.toString());
	}
}
