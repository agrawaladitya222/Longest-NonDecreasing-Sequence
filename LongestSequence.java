package longestsequence;

public class LongestSequence {
	private int[] input = new int[25];
	private int inputindex=0;
	
	public void setInput(int a) {
		input[inputindex] = a;
		inputindex = inputindex + 1;
	}
	
	public void resetInputs() {
		for(int counter=0;counter<=24; counter++) {
			input[counter]=0;
		}
		inputindex=0;
	}
	
	public String outputSequence() {
		String output = "The longest sequnce of non-decreasing numbers is ";
		int numberbefore=input[0];
		int longsequencelength;
		
		for(int counter=0; counter<=24; counter++) {
			
			
			
			
		}
		
		
		
		
		return output;
	}
	
	
	
	
	
	
	
	
	

}
