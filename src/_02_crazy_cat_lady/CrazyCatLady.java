//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _02_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String ans = JOptionPane.showInputDialog("How many cats do you have?");
		// 2. Convert their answer into an int
		int hi = Integer.parseInt(ans);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if(hi >= 3) {
			JOptionPane.showMessageDialog(null, "You are a crazy cat lady!");
		}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		if(hi < 2 & hi > 0) {
			playVideo("https://www.youtube.com/watch?v=5dsGWM5XGdg");
		}
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		if(hi == 0) {
			playVideo("https://www.youtube.com/watch?v=oj_yLBltPE8");
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

