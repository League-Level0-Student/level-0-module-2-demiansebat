//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.awt.print.Printable;
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	Random randy=new Random();
int whamee=randy.nextInt(4);


	// 3. Print out this variable
System.out.println(whamee);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Ask the Magic 8 Ball a Question!!!");
	// 5. If the random number is 0
 if (whamee==0){
	JOptionPane.showMessageDialog(null, "YESSS!!!!!!!!!");
} 
	// -- tell the user "Yes"
 else if (whamee==1) {
JOptionPane.showMessageDialog(null, "NOOO!!!!!!!!!");}
	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2
else if (whamee==2) {
JOptionPane.showMessageDialog(null, "Maybe you should ask google...");}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
else if (whamee==3) {
JOptionPane.showMessageDialog(null, "YAYEEEET!!"
		+ "");}
	// -- write your own answer

}}
