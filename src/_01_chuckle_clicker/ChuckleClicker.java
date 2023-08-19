package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton jokeButton = new JButton();
	JButton punchButton = new JButton();

public static void main(String[]args) {
	ChuckleClicker clicker = new ChuckleClicker();
	clicker.makeButtons();
}

void makeButtons() {
JFrame frame = new JFrame();
frame.setVisible(true);
JPanel panel = new JPanel();
jokeButton.setText("Joke");
punchButton.setText("Punchline");
panel.add(jokeButton);
panel.add(punchButton);
frame.add(panel);
frame.setTitle("ChuckleClicker");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();

jokeButton.addActionListener(this);
punchButton.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == jokeButton) {
		JOptionPane.showMessageDialog(null, "Why did the bike fall over?");
	}
	else if (e.getSource() == punchButton) {
		JOptionPane.showMessageDialog(null, "It was two tired.");
	}
	}
}
