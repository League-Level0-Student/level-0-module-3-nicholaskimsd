
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 23rd";
		String dadsBirthday = "September 14th";
		String sisterBirthday = "January 31st";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String kai = JOptionPane.showInputDialog("which birthday do you want to know about?  Any family member");
		// 3. Print out what the user typed
		if (kai.equals("mom")) {
			JOptionPane.showConfirmDialog(null, "are you sure you want moms birthday?");
		}
				
		if (kai.equals("dad")) {
			JOptionPane.showConfirmDialog(null, "are you sure you want dads birthday?");
		}
		
		if (kai.equals("sister")) {
			JOptionPane.showConfirmDialog(null, "are you sure you want sisters birthday?");
		}
	
		// 4. if user asked for "mom"
			//print mom's birthday
		if(kai.equals("mom")) {
			JOptionPane.showMessageDialog(null, "her Birthday is "+momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		if(kai.equals("dad")) {
			JOptionPane.showMessageDialog(null, "his Birthday is "+dadsBirthday);
		}
		
		// 6. if user asked for your name
			// print myBirthday
		if(kai.equals("sister")) {
			JOptionPane.showMessageDialog(null, "her Birthday is "+sisterBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
if(kai.equals("brother")) {
	JOptionPane.showMessageDialog(null, "sorry I dont know that person's birthday");

}
if(kai.equals("")) {
	JOptionPane.showMessageDialog(null, "please insert a family member");
}
	} 
}
