//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
		for(int i=0;i<5000;i++) {

robot.miniaturize();
robot.setSpeed(50);
		String lol = JOptionPane.showInputDialog("from a scale between 1-10 how dizzy do you want to make your robot");

int hi = Integer.parseInt(lol);


 // 1. Use the dance method to make the robot spin.
if(hi>4) {
	dance (hi);
}
if(hi<5) {
	dance (hi);
	
}
	}
	}
	

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}

