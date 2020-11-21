package Hospital;

import javax.swing.JOptionPane;

public class Doctor 
{
   private String name,department,specialization;
   private char gender;
   private int CNIC,phone_no;
   public Doctor()
   {
	   name=department=specialization="";
	   gender='\u0000';
	   CNIC=phone_no=0;
   }
   public Doctor(String name,String department,String specialization,char gender,int CNIC, int phone_no )
   {
	   this.name=name;
	   this.department=department;
	   this.specialization=specialization;
	   this.gender=gender;
	   this.CNIC=CNIC;
	   this.phone_no=phone_no;
   }
   public String getName()
   {
	   return name;
   }
   public String getDepartment()
   {
	   return department;
   }
   public  String getSpecialization()
   {
	   return specialization; 
   }
   public char getGender()
   {
	   return gender;
   }
   public int getCNIC()
   {
	   return CNIC;
   }
   public int getPhone_no()
   {
	   return phone_no;
   }
   public void setName(String name)
   {
	   this.name=name;
   }
   public void input()
   {
 	  String n=JOptionPane.showInputDialog("Enter name:");
 	  String d=JOptionPane.showInputDialog("Enter department:"); 
 	  String s=JOptionPane.showInputDialog("Enter specialization:"); 
 	  String g=JOptionPane.showInputDialog("Enter gender(M/F):");
	  String cnic=JOptionPane.showInputDialog("Enter CNIC:"); 
	  String no=JOptionPane.showInputDialog("Enter phone number:");
	  name=n;
	  department=d;
	  specialization=s;
	  gender=g.charAt(0);
 	  CNIC=Integer.parseInt(cnic);
 	  phone_no=Integer.parseInt(no);
 }
   public void display()
   {
 	  JOptionPane.showMessageDialog(null,"Name:"+name+"  Department:"+department+"  Specialization:"+specialization+"  Gender:"+gender+"  CNIC:"+CNIC+"  Phone Number:"+phone_no,"Doctor Detail",JOptionPane.WARNING_MESSAGE);
   }
}
