public class Shape 
{
    String color="red";
    boolean filled=true;
    Shape()
    {
    	color="green";
    	filled=true;
    }
    Shape(String color, boolean filled )
    {
         this.color=color;
         this.filled=filled;
    }
    String getColor()
    {
    	return color;
    }
    void setColor(String color)
    {
    	this.color=color;
    }
    boolean isfilled()
    {
    	return filled;
    }
    void setFilled(boolean filled)
    {
    	this.filled=filled;
    }
   public String toString()
    {
    	if(filled==true)
    	    return ("A shape with color of "+color+" and filled.");
    	else
    		return ("A shape with color of "+color+" and not filled.");
    }
}
