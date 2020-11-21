package Package1;
import javax.swing.JOptionPane;
public class Date
{
  private int day,month,year;
  public Date()
  {
	  day=month=year=0;
  }
  public Date(int day, int month, int year)
  {
	  this.day=day;
	  this.month=month;
	  this.year=year;
  }
  public int getDay()
  {
	  return day;
  }
  public int getMonth()
  {
	  return month;
  }
  public int getYear()
  {
	  return year;
  }
  public void input()
  {
	  String d=JOptionPane.showInputDialog("Enter day:");
	  String m=JOptionPane.showInputDialog("Enter month:"); 
	  String y=JOptionPane.showInputDialog("Enter year:"); 
	  day=Integer.parseInt(d);
	  month=Integer.parseInt(m);
	  year=Integer.parseInt(y);
  }
  public String display()
  {
	  return(day+"/"+month+"/"+year);
  }
}
