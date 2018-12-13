import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog(null, "How old are you?", "Voting Booth",
				JOptionPane.QUESTION_MESSAGE);
		int vote = Integer.parseInt(number);
		if (vote > 18) {
			JOptionPane.showMessageDialog(null, "Who would you like to be president?", "Voting Booth",
					JOptionPane.QUESTION_MESSAGE);
		}
	}
}
