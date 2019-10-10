package longestsequence;

public class LongestSequence {
	private int[] input = new int[25];
	private int inputindex=0;
	private String output = "The longest nondecreasing sequence(s) out of the numbers you input:\n";
	
	public void setInput(int a) {
		input[inputindex] = a;
		inputindex = inputindex + 1;
	}
	
	public void tester() {
		for(int counter=0; counter<=24; counter++) {
			System.out.println(input[counter]);
		}
	}
	
	public void resetInputs() {
		for(int counter=0;counter<=24; counter++) {
			input[counter]=0;
		}
		inputindex=0;
	}
	
	public void findSequence() {
		int numberbefore=input[0];
		int longsequencelength=0,testsequencelength=0;
		int firstnumberindex=9999;
		
		//determine longsequence length
		for(int counter=0; counter<=24; counter++) {
			if(input[counter] >= numberbefore) {
				testsequencelength = testsequencelength+1;
			}
			else {
				if(testsequencelength>=longsequencelength) {
					longsequencelength = testsequencelength;
					firstnumberindex = counter - longsequencelength;
					//buildOutput(firstnumberindex, longsequencelength);
				}
				testsequencelength = 1;
			}
			numberbefore = input[counter];
		}
		
		System.out.println(longsequencelength);
		System.out.println(firstnumberindex);
		
		
	}
	
	public void buildOutput(int firstnumber,int length) {
		for(int counter=firstnumber; counter<(length + firstnumber); counter++) {
			output = output + input[counter] + " ";
		}
		output = output + "\n";
	}
	
	
	public String getOutput() {
		
		return output;
	}
	
	
	
	
	

}
