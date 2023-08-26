package _05_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	// 1. Make a main method that includes all the steps below….
void run() {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int random = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(random);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("You found the secret location. Ask me a yes or no question.");
	// 5. If the random number is 0
if (random == 0) {
	// -- tell the user "Yes"
System.out.println("Yes.");
}
	// 6. If the random number is 1
if (random == 1) {
	// -- tell the user "No"
System.out.println("No.");
}
	// 7. If the random number is 2
if (random == 2) {
	// -- tell the user "Maybe you should ask Google?"
System.out.println("I don't know. Maybe ask Google?");
}
	// 8. If the random number is 3
if (random == 3) {
	// -- write your own answer
System.out.println("Maybe. Only time will tell...");
}
}
}
