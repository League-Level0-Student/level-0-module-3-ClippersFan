
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "August 15th";
		String dadsBirthday = "December 2nd";
		String myBirthday = "October 4th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String answer = JOptionPane.showInputDialog("Which birthday do you want to know?");
		// 3. Print out what the user typed
		System.out.println(answer);
		// 4. if user asked for "mom"
		if(answer.equalsIgnoreCase("mom")){
			System.out.println(momsBirthday);
		}else
			//print mom's birthday
		// 5. if user asked for "dad"
		if(answer.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
		}else
			// print dad's birthday
		// 6. if user asked for your name
		if(answer.equalsIgnoreCase("ritvik")) {
			System.out.println(myBirthday);
		}else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		
		
		
	}
}
