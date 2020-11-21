public class Square  extends Rectangle
{
	//side=length=width
	Square()
	{
		super();
	}
	Square(double side)
	{
		this.width=side;
		this.length=side;
	}
	Square(double side,String color,boolean filled)
	{
		this.width=side;
		this.length=side;
		this.color=color;
		this.filled=filled;
	}
	void setWidth(double side)
	{
		this.width=side;
	}
	void setLength(double side)
	{
		this.length=side;
	}
	void setSide(double side)
	{
		this.length=side;
		this.width=side;
	}
	double getSide()
	{
		return length;  //return width;  because side, length & width of square is same
	}
	public String toString()
	{
		 return ("A Square with side="+width+", which is subclass of "+super.toString());
	}
}
