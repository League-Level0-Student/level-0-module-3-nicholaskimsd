//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String kwu = JOptionPane.showInputDialog("do you like bannanas?");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if(kwu.equals("no")) {
			JOptionPane.showMessageDialog(null, "you are crazy man!!!!!!!");
		}
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
if(kwu.equals("yes")) {
	String jas = JOptionPane.showInputDialog("what is your favorite thing to do");
	JOptionPane.showMessageDialog(null, jas + " is much better than bannanas!");
}

		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
if(kwu.equals("")) {JOptionPane.showMessageDialog(null, "YOU ARE BANNANAS!!!!!!");}
	
	}

}
