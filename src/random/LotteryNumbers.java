package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		Random randy = new Random();
		String winner = "";
		for (int i = 0; i < 5; i++) {
			int number = randy.nextInt(60) + 1;
			winner += number;
			winner += " ";
		}
		JOptionPane.showMessageDialog(null, "Your number is " + winner);
	}
}
