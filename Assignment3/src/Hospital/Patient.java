package Hospital;

import javax.swing.JOptionPane;

public class Patient 
{
	   private String name,address;
	   private char gender;
	   private int CNIC,phone_no,age;
	   public Patient()
	   {
		   name=address="";
		   gender='\u0000';
		   CNIC=phone_no=age=0;
	   }
	   public Patient(String name,String address,char gender,int CNIC, int phone_no,int age )
	   {
		   this.name=name;
		   this.address=address;
		   this.gender=gender;
		   this.CNIC=CNIC;
		   this.phone_no=phone_no;
		   this.age=age;
	   }
	   public String getName()
	   {
		   return name;
	   }
	   public String getAddress()
	   {
		   return address;
	   }
	   public char getGender()
	   {
		   return gender;
	   }
	   public  int getCNIC()
	   {
		   return CNIC;
	   }
	   public int getPhone_no()
	   {
		   return phone_no;
	   }
	   public  int getAge()
	   {
		   return age;
	   }
	   public void input()
	   {
	 	  String n=JOptionPane.showInputDialog("Enter name:");
	 	  String a=JOptionPane.showInputDialog("Enter address:"); 
	 	  String g=JOptionPane.showInputDialog("Enter gender(M/F):");
		  String cnic=JOptionPane.showInputDialog("Enter CNIC:"); 
		  String no=JOptionPane.showInputDialog("Enter phone number:");
		  String AGE=JOptionPane.showInputDialog("Enter age:");
		  name=n;
		  address=a;
		  gender=g.charAt(0);
	 	  CNIC=Integer.parseInt(cnic);
	 	  phone_no=Integer.parseInt(no);
	 	  age=Integer.parseInt(AGE);
	 }
	   public void display()
	   {
	 	  JOptionPane.showMessageDialog(null,"Name:"+name+"  Address:"+address+"  Gender:"+gender+"  CNIC:"+CNIC+"  Phone Number:"+phone_no+"  Age:"+age,"Patient Detail",JOptionPane.WARNING_MESSAGE);
	   }
}
