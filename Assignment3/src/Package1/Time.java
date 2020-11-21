package Package1;

import javax.swing.JOptionPane;

public class Time 
{
   private int hours,mins;
   private String str;
   public Time()
   {
	   hours=mins=0;
	   str="";
   }
   public Time(int hours,int mins, String str)
   {
	   this.hours=hours;
	   this.mins=mins;
	   this.str=str;
   }
   public int getHours()
   {
	   return hours;
   }
   public int getMins()
   {
	   return mins;
   }
   public String getStr()
   {
	   return str;
   }
   public void input()
   {
 	  String hr=JOptionPane.showInputDialog("Enter hours:");
 	  String min=JOptionPane.showInputDialog("Enter mins:"); 
 	  String s=JOptionPane.showInputDialog("Enter AM/PM:"); 
 	  hours=Integer.parseInt(hr);
 	  mins=Integer.parseInt(min);
 	  str=s;
   }
   public String display()
   {
	   return("Time:"+hours+":"+mins+" "+str);
   }
}
