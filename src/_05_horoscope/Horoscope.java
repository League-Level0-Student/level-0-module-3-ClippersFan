package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String ans = JOptionPane.showInputDialog("What is your star sign?");
		if(ans.equals("Aries")){
			JOptionPane.showMessageDialog(null, "You are a Ram!");
		}
		if(ans.equals("Taurus")) {
			JOptionPane.showMessageDialog(null, "You are a Bull!");
		}
		if(ans.equals("Gemini")) {
			JOptionPane.showMessageDialog(null, "You are a Twin!");
		}
		if(ans.equals("Cancer")) {
			JOptionPane.showMessageDialog(null, "You are a Crab!");
		}
		if(ans.equals("Leo")) {
			JOptionPane.showMessageDialog(null, "You are a Lion!");
		}
		if(ans.equals("Virgo")) {
			JOptionPane.showMessageDialog(null, "You are a Maiden!");
		}
		if(ans.equals("Libra")) {
			JOptionPane.showMessageDialog(null, "You are a Scale!");
		}
		if(ans.equals("Scorpio")) {
			JOptionPane.showMessageDialog(null, "You are a Scorpion!");
		}
		if(ans.equals("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "You are a Centaur!");
		}
		if(ans.equals("Capricorn")) {
			JOptionPane.showMessageDialog(null, "You are a Mountain Goat!");
		}
		if(ans.equals("Aquaries")) {
			JOptionPane.showMessageDialog(null, "You are a man who carries water!.");
		}
		if(ans.equals("Pisces")) {
			JOptionPane.showMessageDialog(null, "You are a Fish!");
		}
	}
}
