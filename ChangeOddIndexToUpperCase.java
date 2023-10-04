package week3.day1.homeAssignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeme";
		
		char[] converttochararray = test.toCharArray(); //converting the string to character array
		System.out.println("convert the string to character array: " + converttochararray);
		
		int length = test.length();
		System.out.println("length: " + length);

		for(int i=0; i <= length; i++ ) {
			
			if(i % 2 != 0) {
				converttochararray[i] = Character.toUpperCase(converttochararray[i]);
			}
		}
		
		String finaloutput = new String(converttochararray);
		System.out.println(finaloutput);
	}

}