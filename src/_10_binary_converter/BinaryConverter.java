package _10_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame("Convert 8 bits of binary to ACCII");
	JPanel panel = new JPanel();
	JButton button = new JButton("convert");
	 JTextField text = new JTextField(20);
	 JLabel label = new JLabel();
	 
	public static void main(String[] args) {
	
	new BinaryConverter().setup();
	
	
	
}
public void setup()  {
	

	frame.setVisible(true);
	
	panel.add(button);
	panel.add(text);
	panel.add(label);
	frame.add(panel);
	button.addActionListener(this);
	frame.pack();
}
String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==button) {
		System.out.println("converted from binary to ASCII.");
	String convertedvalue =	convert(text.getText());
		label.setText(convertedvalue);
		frame.pack();
	}
	
}
}
