package _10_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel label1;
	JLabel label2;
	JLabel label3;
	String randomFruit;
	String label1Fruit;
	String label2Fruit;
	String label3Fruit;
	
	void setup() {
		try {
			label1 = createLabelImage("slotOrange.png");
			label2 = createLabelImage("slotLemon.png");
			label3 = createLabelImage("slotApple.jpeg");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(button);

		button.setText("SPIN!");
		button.addActionListener(this);

		frame.pack();
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException{
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null){
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
spin();
		if (label1Fruit == label2Fruit && label2Fruit == label3Fruit) {
			if (new Random().nextBoolean()) {
				spin();
				JOptionPane.showMessageDialog(null, "The slot machine seems to land on a jackpot, but then spins again. Weird.");
			}
			else {
			JOptionPane.showMessageDialog(null, "YOU WON!");
			}
		}			
	}

	
	void spin() {
		frame.remove(panel);
		panel.remove(label1);
		panel.remove(label2);
		panel.remove(label3);
		panel.remove(button);
		try {
			setRandomFruit();
			label1 = createLabelImage("slot" + randomFruit);
			label1Fruit = randomFruit;
			
			setRandomFruit();
			label2 = createLabelImage("slot" + randomFruit);
			label2Fruit = randomFruit;
	
			setRandomFruit();
			label3 = createLabelImage("slot" + randomFruit);
			label3Fruit = randomFruit;
		} catch (MalformedURLException o) {
			o.printStackTrace();
		
	}
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(button);
		frame.add(panel);
		frame.pack();
	}
	
	void setRandomFruit() {
		int r = new Random().nextInt(3);
		if (r == 0) {
			randomFruit = "Orange.png";
		}
		else if (r == 1) {
			randomFruit = "Lemon.png";
		}
		else {
			randomFruit = "Apple.jpeg";
		}
	}
}
