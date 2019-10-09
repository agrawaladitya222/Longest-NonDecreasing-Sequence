package longestsequence;

import javax.swing.*;
import BreezySwing.*;

public class GUI extends GBFrame{
	LongestSequence sender = new LongestSequence();
	
	public static void main(String[] args) {
		JFrame frm = new GUI();
		frm.setTitle("Longest Non-Decreasing Sequence");
		frm.setSize(800, 800);
		frm.setVisible(true);
	}

	public GUI() {
		outputbutton.setEnabled(false);
	}
	
	JLabel inputlabel = addLabel("Input a number into the sequence.",1,1,1,1);
	IntegerField inputfield = addIntegerField(0,1,2,1,1);
	JTextArea outputarea = addTextArea("",3,1,1,1);
	JButton inputbutton = addButton("Input Number",2,1,1,1);
	JButton outputbutton = addButton("Output", 2,2,1,1);
	JButton resetbutton = addButton("Reset",2,3,1,1);
	
	public void buttonClicked(JButton button) {
		if (button == inputbutton) {
			if(inputfield.isValidNumber())
				sender.setInput(inputfield.getNumber());
			else
				messageBox("Invalid Input. Please try again.");
			inputbutton.requestFocus();
		}
		if(button == outputbutton) {
			
			
			
		}
		if(button == resetbutton) {
			
		}
		
		
		
		
		
		
	}
	
















}
