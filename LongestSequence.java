package longestsequence;

public class LongestSequence {
	private int[][] input = new int[25][25];
	private int[] templongest = new int[25];
	private int inputindex = 0, inputlength = 0, longest = 0, inputbefore, totaluserinputs = 0;
	private String output = "Longest non decreasing sequence(s):\n";

	public boolean maxinputs() {

		if (totaluserinputs == 25)
			return true;
		else
			return false;

	}

	public LongestSequence() {
		int lownum = -9999999;
		for (int counter1 = 0; counter1 <= 24; counter1++) {
			for (int counter2 = 0; counter2 <= 24; counter2++) {
				input[counter2][counter1] = lownum;
			}
			lownum = lownum - 1;
		}
	}

	public void setInput(int a) {
		if ((inputindex == 0) && (inputlength == 0)) {
			// first user input v
			input[inputindex][inputlength] = a;
			inputbefore = a;
			inputlength = inputlength + 1;
		} else {
			// everything after first user input v
			if (a >= inputbefore) {
				input[inputindex][inputlength] = a;
				inputbefore = a;
				inputlength = inputlength + 1;
			} else {
				inputlength = 0;
				inputindex = inputindex + 1;
				input[inputindex][inputlength] = a;
				inputbefore = a;
				inputlength = inputlength + 1;
			}
		}
		totaluserinputs = totaluserinputs + 1;
	}

	public void DetermineLongest() {

		for (int asdf = 0; asdf <= 24; asdf++) {
			templongest[asdf] = 0;
		}

		for (int sequencenumber = 0; sequencenumber < totaluserinputs; sequencenumber++) {
			int numberbefore = input[sequencenumber][0];
			for (int sequencelength = 0; sequencelength < totaluserinputs; sequencelength++) {
				if (input[sequencenumber][sequencelength] >= numberbefore) {
					templongest[sequencenumber] = templongest[sequencenumber] + 1;
				}
				numberbefore = input[sequencenumber][sequencelength];
			}
			if (templongest[sequencenumber] > longest)
				longest = templongest[sequencenumber];
		}
	}

	public void buildOutput() {
		output = "Longest non decreasing sequence(s):\n";
		if (longest > 1) {
			for (int counter = 0; counter <= 24; counter++) {
				if (templongest[counter] == longest) {
					for (int counter2 = 0; counter2 <= (longest - 1); counter2++) {
						output = output + input[counter][counter2] + " ";
					}
					output = output + "\n";
				}
			}
		} else {
			output = output + "There were no non decreasing sequences";
		}

	}

	public String getOutput() {
		return (output);
	}

	public void reset() {
		inputindex = inputlength = longest = totaluserinputs = 0;
		output = "Longest non decreasing sequence(s):\n";
		int lownum = -9999999;
		for (int counter1 = 0; counter1 <= 24; counter1++) {
			for (int counter2 = 0; counter2 <= 24; counter2++) {
				input[counter2][counter1] = lownum;
			}
			lownum = lownum - 1;
		}
	}
}
