package _99_extra._01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton trick = new JButton();
JButton treat = new JButton();

void makeSurprise() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(trick);
	panel.add(treat);
	
	trick.setText("Trick");
	treat.setText("Treat");
	
	trick.addActionListener(this);
	treat.addActionListener(this);
	
	frame.pack();
}

private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent e) {
if (e.getSource() == trick) {
	showPictureFromTheInternet("https://hips.hearstapps.com/hmg-prod/images/dog-puppy-on-garden-royalty-free-image-1586966191.jpg?crop=0.752xw:1.00xh;0.175xw,0&resize=1200:*");
}
else if (e.getSource() == treat) {
	JOptionPane.showMessageDialog(null, "I couldn't find a scary image without being scared myself, so sorry about that.");
}
}
}
