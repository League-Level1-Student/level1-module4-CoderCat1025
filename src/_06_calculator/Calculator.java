package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField textfield1 = new JTextField(25);
	JTextField textfield2 = new JTextField(25);
	JButton addButton = new JButton();
	JButton subtractButton = new JButton();
	JButton multiplyButton = new JButton();
	JButton divideButton = new JButton();
	
	private int number1;
	private int number2;
	private int solution;
	
	void setup() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(textfield1);
		panel.add(textfield2);
		panel.add(addButton);
		panel.add(subtractButton);
		panel.add(multiplyButton);
		panel.add(divideButton);
		panel.add(label);
		
		frame.setSize(100, 250);
		
		textfield1.setText("1");
		textfield2.setText("2");
		
		addButton.setText("add");
		subtractButton.setText("sub");
		multiplyButton.setText("mul");
		divideButton.setText("div");
		
		addButton.addActionListener(this);
		subtractButton.addActionListener(this);
		multiplyButton.addActionListener(this);
		divideButton.addActionListener(this);
		
		frame.pack();
	}
	
void add() {
number1 = Integer.parseInt(textfield1.getText());
number2 = Integer.parseInt(textfield2.getText());
	solution = number1 + number2;
	System.out.println(solution);
	frame.pack();

}

void subtract() {
	number1 = Integer.parseInt(textfield1.getText());
	number2 = Integer.parseInt(textfield2.getText());
	solution = number1 - number2;
	System.out.println(solution);
	frame.pack();

}

void multiply() {
	number1 = Integer.parseInt(textfield1.getText());
	number2 = Integer.parseInt(textfield2.getText());
	solution = number1 * number2;
	System.out.println(solution);
	frame.pack();

}

void divide() {
	number1 = Integer.parseInt(textfield1.getText());
	number2 = Integer.parseInt(textfield2.getText());
	solution = number1 / number2;
	System.out.println(solution);
	frame.pack();

}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == addButton) {
		add();
		label.setText(String.valueOf(solution));
	}
	else if (e.getSource() == subtractButton) {
		subtract();
		label.setText(String.valueOf(solution));
	}
	else if(e.getSource() == multiplyButton) {
		multiply();
		label.setText(String.valueOf(solution));
	}
	else {
		divide();
		label.setText(String.valueOf(solution));
	}
}
}
