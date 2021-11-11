import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.util.*;

public class medical {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String address, date, system , confirm , yes, phone , name , illness , card , nRC , Address , Date , Phone , Name , Illness , Card , NRC ;
		address = ("Enter your address");
		date = ("Enter your address");
		phone = ("Enter phone number ");
		name = ("please enter your name");
		illness = ("please enter name of \nillness dignosed with:");
		card = ("Enter clinic card number:");
		nRC = ("Enter NRC number:");
		Address = ("Enter your address");
		Date = ("Enter your address");
		Phone = ("Enter phone number ");
		Name = ("please enter your name");
		Illness = ("please enter name of \nillness dignosed with:");
		Card = ("Enter clinic card number:");
		NRC = ("Enter NRC number:");
		confirm = ("yes");
		yes = ("verify ");
		system= ("null");
		int user_1;
		int user_2;
		user_1 = 1;
		user_2 = 1;
		//
		Scanner input = new Scanner(System.in);
		Scanner myObj = new Scanner(System.in);
		// starting point
		System.out.println("------------------->Smartcare Registration system<--------------------");
		JOptionPane.showMessageDialog(null, "*************** Hello!!.***************");
		JOptionPane.showMessageDialog(null, "****************Welcome to the Smart-Care registration system.*************************");
				name = JOptionPane.showInputDialog(null, "Enter Full Name:\n");
				//
				JOptionPane.showMessageDialog(null, "nice to meet you\n"+name);
				//
                System.out.println(name);
		//

		//
		JOptionPane.showMessageDialog(null,name +", is a cute name");
		//
		address = JOptionPane.showInputDialog(null,name + " Enter your adress [loction/city/country]:\n");
        //
		// 
		System.out.println(address);
		//
		JOptionPane.showMessageDialog(null, "wow! you must enjoy leaving there");
		//
		date = JOptionPane.showInputDialog(null, "Enter your date of birth [dd/m/y]:\n");
		//
		System.out.println(date);
		
		//
		phone = JOptionPane.showInputDialog(null, "Enter your phone number:\n");
		//
		System.out.println(phone);
		illness = JOptionPane.showInputDialog(null, "please enter name of diagnosed illness:\n:");
		//
		System.out.println(illness);
		//
		card = JOptionPane.showInputDialog(null, "Enter clinic card number:\n");
		//
		System.out.println(card);
		//
		nRC = JOptionPane.showInputDialog(null, "Enter NRC number:\n");
		//
		System.out.println(nRC);
		JOptionPane.showMessageDialog(null, name +" Confirm your details");
		JOptionPane.showMessageDialog(null, "your names are:\n"+ name);
		JOptionPane.showMessageDialog(null, "your address is:\n"+ address);
		JOptionPane.showMessageDialog(null, "your phone number is:\n"+ phone);
		JOptionPane.showMessageDialog(null, "diagnosed illness:\n"+ illness);
		JOptionPane.showMessageDialog(null, "your card number is:\n"+ card);
		JOptionPane.showMessageDialog(null, "your NRC number is:\n"+ nRC);
		confirm =  JOptionPane.showInputDialog(null, "are your details correct yes or no");
		yes = ("you have successfully registered") ;
		if ( confirm ==yes){ 
			 JOptionPane.showMessageDialog(null, yes);
		}
		else{
			JOptionPane.showMessageDialog(null, "thank you for using smart care registration system " );
		}
		// # section A end
		//******************************************************** */
		// ** this is a simple demo of what java can do */
		JOptionPane.showMessageDialog(null, "Good bye get well soon");
		//****** user 1, break/
		//*************** */ next user********************//*****************^***//
		JOptionPane.showMessageDialog(null, "next! patient please");
		//****************//*****************************//**********************//
		JOptionPane.showMessageDialog(null, "**************Hello!!***************");
		JOptionPane.showMessageDialog(null, "****************Welcome to the Smart-Care registration system.*************************");
		Name = JOptionPane.showInputDialog(null, "Enter your Full Name:\n");
		 JOptionPane.showMessageDialog(null, "pleasure meeting you:\n"+Name);
				//
         System.out.println(Name);
		//
		 Address = JOptionPane.showInputDialog(null, Name +"Enter your address [lcoction/city/country]:\n");
        //
		  System.out.println(Address);
		//
		   JOptionPane.showMessageDialog(null, "sounds like a nice place");
		//
		      Date = JOptionPane.showInputDialog(null, "Enter your date of birth [dd/m/y]:\n");
		       System.out.println(Date);
		//
		        Phone = JOptionPane.showInputDialog(null, "Enter your phone number:\n");
		//
		           System.out.println(Phone);
		              Illness = JOptionPane.showInputDialog(null, "please enter name of illness dignosed with:\n");
		//
		                 System.out.println(Illness);
		//
		                  Card = JOptionPane.showInputDialog(null, "Enter clinic card number:\n");
		//
		                    System.out.println(Card);
		//
		                      NRC = JOptionPane.showInputDialog(null, "Enter NRC number:\n");
		                      System.out.println(NRC);
		                       JOptionPane.showMessageDialog(null, Name +" Confirm your details:\n");
		                  JOptionPane.showMessageDialog(null, "your names are:\n"+ Name);
		             JOptionPane.showMessageDialog(null, "your address is:\n"+ Address);
		               JOptionPane.showMessageDialog(null, "your phone number is:\n"+ Phone);
		         JOptionPane.showMessageDialog(null, "diagnosed illness:\n"+ Illness);
		     JOptionPane.showMessageDialog(null, "your card is:\n"+ Card);
		JOptionPane.showMessageDialog(null, "your NRC number is:\n"+ NRC);
		confirm =  JOptionPane.showInputDialog(null, "are your details correct yes or no");
		yes =("succefull registered");
		if (  confirm == yes ){ 
			JOptionPane.showMessageDialog(null, yes);
	   }
	   else{
		   JOptionPane.showMessageDialog(null, "thank you for using smart care registration system " );
	   }
         //*************************************************************************** */
		JOptionPane.showMessageDialog(null, "good bye wish you a quick recovery");
		// End of the program
		// coder (the magician MR kanema)
		JOptionPane.showMessageDialog(null, "the total number of sickis \n 2");
		
 }
}
