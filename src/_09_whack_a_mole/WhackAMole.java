package _09_whack_a_mole;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel;
	JButton specialButton;
	int MolesWhacked = 0;
	int MolesMissed = 0;
	Date TimeStarted;

	void setup() {
		frame.setVisible(true);
		frame.setTitle("Whack-A-Mole");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		TimeStarted = new Date();
	}

	void drawButtons(int r) {
		panel = new JPanel();
		frame.add(panel);
		for(int i=0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if (i == r) {
				button.setText("Mole!");
				specialButton = button;
			}
			frame.setSize(300, 350);}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() != specialButton) {
			MolesMissed++;
			if (MolesMissed == 1) {
				speak("Missed!");
			}
			if (MolesMissed == 2) {
				speak("Try again!");
			}
			if (MolesMissed == 3) {
				speak("Wrong mole!");
			}
			if (MolesMissed == 4) {
				speak("Ouch!");
			}
			frame.remove(panel);
			drawButtons(new Random().nextInt(24));
			frame.add(panel);
			frame.pack();
			frame.setSize(300, 350);
			if (MolesMissed == 5) {
				endGame(TimeStarted, MolesWhacked);
				speak("Please try harder next time!");
			}
		}
		else {
			MolesWhacked++;
			playSound("whack.wav");

			frame.remove(panel);
			drawButtons(new Random().nextInt(24));
			frame.add(panel);
			frame.pack();
			frame.setSize(300, 350);

			if (MolesWhacked == 10) {
				endGame(TimeStarted, MolesWhacked);
				speak("Great Job!");
			}
		}
	}

	static void speak(String words) {
		if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec( cmd ).waitFor();
			} catch( Exception e ) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec( "say " + words ).waitFor();
			} catch( Exception e ) {
				e.printStackTrace();
			}
		} 
	}

	private void endGame(Date timeAtStart, int molesWhacked) { 
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
				+ " moles per second.");
	}

	private void playSound(String fileName) { 
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}

