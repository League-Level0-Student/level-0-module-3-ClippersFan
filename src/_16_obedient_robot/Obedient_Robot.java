package _16_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
	static Robot jeff = new Robot();
	public static void main(String[] args) {
		String ans = JOptionPane.showInputDialog("Which shape do you want?");
		String txt = JOptionPane.showInputDialog("Do you want your shape to be Red, Blue, or Green?");
		if(txt.equalsIgnoreCase("Blue")) {
			jeff.setPenColor(0,0,255);
		}
		if(txt.equalsIgnoreCase("Red")) {
			jeff.setPenColor(255,0,0);
		}
		if(txt.equalsIgnoreCase("Green")) {
			jeff.setPenColor(0,255,0);
		}
		if(ans.equalsIgnoreCase("Circle")) {
			drawCircle();
			
		}
		if(ans.equalsIgnoreCase("Square")) {
			drawSquare();
		}
		if(ans.equalsIgnoreCase("Triangle")) {
			drawTriangle();
		}
		
		
		
		
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
			jeff.turn(60);
			jeff.setSpeed(20);
			jeff.penDown();
			jeff.move(100);
			jeff.penUp();
			jeff.turn(60);
		}
	
		
	
	}
	static void drawCircle() {
		jeff.setSpeed(20);
		jeff.penDown();
		for(int i = 0; i < 360; i++) {
			jeff.turn(1);
			jeff.move(2);
		}
	}
	
}

///fix drawTriangle method