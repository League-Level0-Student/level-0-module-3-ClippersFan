//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot jeff = new Robot();
		jeff.setSpeed(100);
		//3. Ask the user what color they would like the robot to draw

		for(int i = 0; i < 6; i++ ) {		
			String ans = JOptionPane.showInputDialog("What color do you want the robot to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
			if(ans.equalsIgnoreCase("Blue")) {
				jeff.penDown();
				jeff.setPenColor(0, 0, 255);
		}
        //6. If the user doesn’t enter anything, choose a random color
			if(ans.isEmpty()){
				jeff.setRandomPenColor();
			
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
			jeff.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
			jeff.penDown();
			for(int y = 0; y < 7; y++) {
				jeff.move(100);
				jeff.turn(50);
			}
}
	}
}
