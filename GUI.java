package longestsequence;

import javax.swing.*;
import BreezySwing.*;

public class GUI extends GBFrame {

	public static void main(String[] args) {
		JFrame frm = new GUI();
		frm.setTitle("Longest Non-Decreasing Sequence");
		frm.setSize(800, 800);
		frm.setVisible(true);
	}

	public GUI() {

	}

	JLabel inputlabel = addLabel("Input a number into the sequence.", 1, 1, 1, 1);
	IntegerField inputfield = addIntegerField(0, 1, 2, 1, 1);
	JTextArea outputarea = addTextArea("", 3, 1, 1, 1);
	JButton inputbutton = addButton("Input Number", 2, 1, 1, 1);
	JButton outputbutton = addButton("Output", 2, 2, 1, 1);
	JButton resetbutton = addButton("Reset", 2, 3, 1, 1);
	LongestSequence sender = new LongestSequence();
	JButton endbutton = addButton("Exit", 4, 2, 1, 1);

	public void buttonClicked(JButton button) {
		if (button == inputbutton) {
			if (inputfield.isValidNumber() && !sender.maxinputs()) {
				sender.setInput(inputfield.getNumber());
			} else {
				messageBox("Invalid input or max inputs reached. Please try again.");
			}
			inputfield.requestFocus();
		}
		if (button == outputbutton) {
			sender.DetermineLongest();
			sender.buildOutput();
			outputarea.setText(sender.getOutput());
			inputfield.requestFocus();
		}
		if (button == resetbutton) {
			sender.reset();
			outputarea.setText("");
			inputfield.setNumber(0);
			inputfield.requestFocus();
		}
		if (button == endbutton) {
			System.exit(0);
		}

	}

}
