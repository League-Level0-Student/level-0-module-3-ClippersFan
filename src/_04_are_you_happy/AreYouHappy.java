package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String hi = JOptionPane.showInputDialog("Are you happy?");
		if(hi.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
			
		}else {
		String lol = JOptionPane.showInputDialog("Do you want to be happy?");
		if(lol.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Change Something.");
	
		}else {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		}
		}
		
	
		
		
	}
}
