package _09_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton specialButton;
	
	void setup() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setTitle("Whack-A-Mole");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
void drawButtons(int r) {
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
	    }
else {
	
}
