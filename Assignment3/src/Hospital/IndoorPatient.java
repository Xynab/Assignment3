package Hospital;

import javax.swing.JOptionPane;

import Package1.Date;
public class IndoorPatient extends Patient
{
  int wardNo,roomNo,bedNo,fee;
  Doctor d=new Doctor();
  Date   D=new Date();
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
	  String w=JOptionPane.showInputDialog("Enter ward number:");
	  String r=JOptionPane.showInputDialog("Enter room number:"); 
	  String b=JOptionPane.showInputDialog("Enter bed number:");
	  String f=JOptionPane.showInputDialog("Enter fee:"); 
	  wardNo=Integer.parseInt(w);
	  roomNo=Integer.parseInt(r);
	  bedNo=Integer.parseInt(b);
	  fee=Integer.parseInt(f);
}
   public void display()
  {
	  super.display();
	  JOptionPane.showMessageDialog(null,"Ward Number:" + wardNo + "  Room Number:" + roomNo + "  Bed number:" + bedNo + "  Doctor name: Dr." + d.getName() + "  Date of admission:" + D.display() + "  Fee:" + fee,"Indoor Patient Detail",JOptionPane.WARNING_MESSAGE);
  }
}
