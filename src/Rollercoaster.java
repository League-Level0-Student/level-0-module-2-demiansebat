import javax.swing.JOptionPane;

public class Rollercoaster {public static void main(String[] args) {
	String height=JOptionPane.showInputDialog("How tall are you?");
	int number=Integer.parseInt(height);
	if (number>48) {
		JOptionPane.showMessageDialog(null, "YAY! You are tall enough to go on the rollercoaster!", "Rollercoaster", JOptionPane.QUESTION_MESSAGE);
	
	}
	else {
		JOptionPane.showMessageDialog(null, "Sorry! You need to grow more before going on this coaster","Rollercoaster", JOptionPane.QUESTION_MESSAGE);
	}
}
}


