package Hospital;
import javax.swing.JOptionPane;

import Package1.Date;
import Package1.Time;
public class OutdoorPatient extends Patient
{
	 int fee;
	 Doctor d=new Doctor();
	 Date   D=new Date();
	 Time   t=new Time();
	 public void inputData(Doctor obj[])
	  {
		 input();
		 String name=JOptionPane.showInputDialog("Enter name of doctor:");
		 String s=obj[0].getName();
		 String s2=obj[1].getName();
		  if(!name.equals(s)&&!name.equals(s2))
			 {
			  JOptionPane.showMessageDialog(null,"Dr."+name+"  not availble in hospital.","Doctor Name.",JOptionPane.WARNING_MESSAGE);
			  String n=JOptionPane.showInputDialog("Again enter name of doctor:");
	         }
		  else
			  d.setName(name);
		  D.input();
		  t.input();
		  String f=JOptionPane.showInputDialog("Enter fee:"); 
		  fee=Integer.parseInt(f);
	}
	  public void display()
	  {
		  super.display();
		  JOptionPane.showMessageDialog(null,"Date of appointment:" + D.display() + "  Time of appointment:" + t.display() + "  Doctor name:"  + d.getName() +  "  Fee:" + fee,"Outdoor Patient Detail",JOptionPane.WARNING_MESSAGE);
	  }
	  public boolean certainDay(int z)
	  {
		 if(z==D.getDay())
			    return true;
		  else
				  return false;
	  }
	  public void certainDoctor(String string, Doctor obj[])
	  {
		  String s=obj[0].getName();
			 String s2=obj[1].getName();
			  if(!string.equals(s)||!string.equals(s2))
				 {
					 super.display();
			         JOptionPane.showMessageDialog(null,"Date of appointment:" + D.display() + "  Time of appointment:" + t.display() + "  Doctor name: Dr."  + d.getName() +  "  Fee:" + fee,"Outdoor Patient Detail",JOptionPane.WARNING_MESSAGE);
	             }
	  }
	    public void certainPatient(String string)
	  {
		  if(string.equals(super.getName()))
		  {
			  Date  obj=new Date(26,10,1998);
			  Time   obj2=new Time(8,45,"pm");
			  super.display();
			  JOptionPane.showMessageDialog(null,"Date of appointment:" + obj.display() + "  Time of appointment:" + obj2.display() + "  Doctor name: Dr."  + d.getName() +  "  Fee:" + fee,"Outdoor Patient Detail",JOptionPane.WARNING_MESSAGE);
		  } 
	  }
}    	 
	  
 
 