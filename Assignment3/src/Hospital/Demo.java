package Hospital;
import javax.swing.JOptionPane;

public class Demo 
{
  static public  void main(String args[])
  {
	  int x;
	  String str;
	  Doctor obj[]=new Doctor[2]; 
	  obj[0]=new Doctor("Zain","Brain","neurology",'M',345678766,556945);
	  obj[1]=new Doctor("Zainab","Heart","cardiology",'F',34765566,457548);
	  Patient obj2[]=new Patient[2];
	  String a;
	  for(int i=0;i<2;i++)
	  {
		  JOptionPane.showMessageDialog(null,"On which index do you want to create IndoorPatient instance or OutdoorPatient instance. Enter i for indoor and o for outdoor. " ,"InstanceOf",JOptionPane.WARNING_MESSAGE); 
		  a=JOptionPane.showInputDialog("Enter option i OR o:");
		  if(a.equals("i"))
	       {
		      obj2[i]=new IndoorPatient();
	       }
		  else
		   {
			   obj2[i]=new OutdoorPatient();
		   }
	  }
	  do 
	  {
		  JOptionPane.showMessageDialog(null,"********MENU*******\r\n"  +
	      "1- Add an indoor patient.\r\n"  +
	      "2- Add an outdoor patient.\r\n"  +
	      "3- See the list of all Doctors.\r\n"   +
	      "4- Search a doctor by name or department.\r\n" +
          "5- See the list of all indoor patients.\r\n" +
	      "6- See the list of all appointments on a certain day.\r\n"+
          "7- See the list of appointments of a certain doctor.\r\n" +
          "8- Change the date or time of appointment of a certain patient.\r\n","MENU",JOptionPane.WARNING_MESSAGE); 
	  str=JOptionPane.showInputDialog("Enter option:");
	  x=Integer.parseInt(str);
	  switch(x)
	  {
	  case 1:
	  {
		  for(int i=0;i<2;i++)
		  {
			  if(obj2[i] instanceof IndoorPatient )
			  {
			        ((IndoorPatient)obj2[i]).inputData(obj);
			  }
		  }
		 break;
	  }
	  case 2:
	  {
		  for(int i=0;i<2;i++)
		  {
			  if(obj2[i] instanceof OutdoorPatient )
			  {
			     ((OutdoorPatient)obj2[i]).inputData(obj);
			  }
		  }
	      break;
	  }
	  case 3:
	  {
		  for(int i=0;i<2;i++)
		  {
			  obj[i].display();
		  }
		  break;
	  }
	  case 4:
	  {
		  String string=JOptionPane.showInputDialog("Enter name for searching:");
		  for(int i=0;i<2;i++) 
			  {
			    if(string.equals(obj[i].getName()))
				      obj[i].display();
			  }
		  break;
	  }
	  case 5:
	  {
		  for(int i=0;i<2;i++)
		  {
			  if(obj2[i] instanceof IndoorPatient )
			  {
			     obj2[i].display();
			  }
		  }
		  break;
	  }
	  case 6:
	  {
		  String string=JOptionPane.showInputDialog("Enter day for check appointments:");
		  int z=Integer.parseInt(string);
		  for(int i=0;i<2;i++)
		  {
			  if(obj2[i] instanceof OutdoorPatient )
			  {
			  if(((OutdoorPatient) obj2[i]).certainDay(z))
			         obj2[i].display();
			  }
		  }
		 break;
	  }
	  case 7:
	  {
		  String string=JOptionPane.showInputDialog("Enter doctor name for check appointments:");
		  for(int i=0;i<2;i++)
		  {
			  if(obj2[i] instanceof OutdoorPatient )
			  {
			    ((OutdoorPatient) obj2[i]).certainDoctor(string,obj);
			  }
	 	  }
		 break;
	  }
	  case 8:
	  {
		  String string=JOptionPane.showInputDialog("Enter patient name for change appointment date and time:");
		  for(int i=0;i<2;i++)
		  {
			  if(obj2[i] instanceof OutdoorPatient )
			  {
			     ((OutdoorPatient) obj2[i]).certainPatient(string);
			  }
		  }		  
		 break;
	  }
	  default:  JOptionPane.showMessageDialog(null,"Invalid.","Invalid Input",JOptionPane.WARNING_MESSAGE);
	  }
	  }while(x<=8);
  }
}
