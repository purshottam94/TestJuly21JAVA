package purshottam;

import java.util.Scanner;

public class Program1 {

	int getCharCount(String input, char ch) {
		int count=0;
		
		for(int index=0; index < input.length();index++) {
			//if(input.charAt(index) == ch) {
			if(input.charAt(index) >1) {	
			count++;
			}
		}
		System.out.println(ch+":"+count);
		return count;
	}
	void printFreqOfEachChar(String input) {
				 
		for(int index=0; index <input.length();index++) {
			int count =0;
			char ch = input.charAt(index);
				
			//if(index == input.indexOf(input.charAt(index)))
					/*for(int j=0; j <input.length();j++) {
						if(input.charAt(j) == ch  )	{
							count++;
						}
					
					}if(count ==1)*/
						//	System.out.println(ch);
			// j = str.indexOf(input.charAt(index));
			//j = str.indexOf('t');		
				getCharCount(input, input.charAt(index));
		}
		//System.out.println(j);
		
		
	}
	
	public static void main(String[] args) {
		Program1 program1 = new Program1();
		program1.printFreqOfEachChar("purushottam");
		//program1.getCharCount(input, 'c');
		Scanner scanner = new Scanner(System.in);
		System.out.println("how many numbers you want to enter : ");
		String totalElements = scanner.next();
		
	}
}
