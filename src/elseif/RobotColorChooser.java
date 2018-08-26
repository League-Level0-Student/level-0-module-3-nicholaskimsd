//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

@SuppressWarnings("unused")
public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		for(int i=0;i<5000;i++) {
		Robot hi = new Robot();
		hi.miniaturize();
		hi.setSpeed(100);
		//3. Ask the user what color they would like the robot to draw
		@SuppressWarnings("unused")
		String cool = JOptionPane.showInputDialog("what color would you like to choose red green blue or a random color");
		//5. Use an if/else statement to set the pen color that the user requested
		 if (cool.equals("red")) {
			hi.setPenColor(255,0,0); 
		}
		 
		 if (cool.equals("green")) {
			hi.setPenColor(0,255,0); 
			}
	
		 if (cool.equals("blue")) {
			 hi.setPenColor(0,0,255);
			}
		 if (cool.equals("random")) {
			 hi.setRandomPenColor();
			}
	
        //6. If the user doesn’t enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		hi.setPenWidth(10);
		hi.penDown();
	    //2. Make the robot draw a shape (this will take more than one line of code)
	hi.turn(90);
	hi.move(200);
	hi.turn(90);
	hi.move(200);
	hi.turn(90);
	hi.move(200);
	hi.turn(90);
	hi.move(200);
	}
	}
}
