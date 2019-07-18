package _16_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
	static Robot jeff = new Robot();
	public static void main(String[] args) {
		drawSquare();
		jeff.penUp();
		jeff.move(100);
		jeff.penDown();
		drawTriangle();
		}
	
	

	static void drawSquare() {
		for(int i = 0; i < 4; i++) {
			jeff.setSpeed(20);
			jeff.penDown();
			jeff.move(100);
			jeff.penUp();
			jeff.turn(90);
		}
	}
	static void drawTriangle() {
		for(int i = 0; i < 3; i++) {
			jeff.setSpeed(20);
			jeff.penDown();
			jeff.move(100);
			jeff.penUp();
			jeff.turn(60);
		}
	}
}

///fix drawTriangle method