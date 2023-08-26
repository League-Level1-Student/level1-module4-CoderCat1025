package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	
	private int number1;
	private int number2;
	private int solution;
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField textfield1 = new JTextField(20);
	JTextField textfield2 = new JTextField(20);
	JButton addButton = new JButton();
	JButton subtractButton = new JButton();
	JButton multiplyButton = new JButton();
	JButton divideButton = new JButton();
	
	void setup() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(textfield1);
		panel.add(textfield2);
		panel.add(label);
		panel.add(addButton);
		panel.add(subtractButton);
		panel.add(multiplyButton);
		panel.add(divideButton);
		
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
	solution = number1 + number2;
	System.out.println(solution);
}

void subtract() {
	solution = number1 - number2;
	System.out.println(solution);
}

void multiply() {
	solution = number1 * number2;
	System.out.println(solution);
}

void divide() {
	solution = number1 / number2;
	System.out.println(solution);
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == addButton) {
		add();
		label.setText(solution);
	}
	else if (e.getSource() == subtractButton) {
		subtract();
		label.setText(solution);
	}
	else if(e.getSource() == multiplyButton) {
		multiply();
		label.setText(solution);
	}
	else {
		divide();
		label.setText(solution);
	}
}
}
