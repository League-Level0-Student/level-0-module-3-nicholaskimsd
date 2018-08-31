import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Cool_Beans {

	static Robot hi = new Robot();

	public static void main(String[] args) {

		hi.miniaturize();
		hi.hide();
		hi.setSpeed(1000);
		hi.penDown();
		String lol = JOptionPane.showInputDialog("what color do you want?  red green or blue");
		if (lol.equals("red")) {
			hi.setPenColor(255, 0, 0);
		}
		if (lol.equals("green")) {
			hi.setPenColor(0, 225, 0);
		}
		if (lol.equals("blue")) {
			hi.setPenColor(0, 0, 225);
		}
		String kop = JOptionPane
				.showInputDialog("which shape do you want the robot to draw.  square triangle or circle");
		if (kop.equals("square")) {
			drawsquare();

		}
		if (kop.equals("triangle")) {
			drawtriangle();

		}
		if (kop.equals("circle")) {
			drawcircle();

		}

	}

	private static void drawcircle() {
		for (int i = 0; i < 360; i++) {
			hi.move(1);
			hi.turn(1);

		}

	}

	private static void drawtriangle() {
		for (int i = 0; i < 3; i++) {
			hi.move(100);
			hi.turn(120);
		}
	}

	private static void drawsquare() {
		for(int i=0;i<4;i++) {
		hi.move(200);
		hi.turn(90);
		
	}

}
}
