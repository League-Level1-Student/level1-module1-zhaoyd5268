package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavorChoice = JOptionPane.showInputDialog("What flavor would you like your popcorn to be?");
	String timeChoice = JOptionPane.showInputDialog("How long should it be cooked? Answer with only number");
	int timeAsInt = Integer.parseInt(timeChoice);
	Microwave wave = new Microwave();
	Popcorn pop = new Popcorn(flavorChoice);
	wave.setTime(timeAsInt);
	wave.putInMicrowave(pop);
	wave.startMicrowave();
}
}
