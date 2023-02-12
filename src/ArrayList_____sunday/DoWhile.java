package ArrayList_____sunday;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
      Scanner abc =new Scanner (System.in);
		String y_NString="";
		do {
			System.err.println("you are enter any number & check even or odd");
			int x=abc.nextInt();
			if (x%2==0) {
				System.err.println("Even No.");
			
		}else {
			System.err.println("Odd No.");	
			}
			
			System.err.println("Do you want to any other any other numeric check?(yes/no)");
			y_NString=abc.next();
			
		}while(y_NString.equalsIgnoreCase("yes"));
		System.err.println("Thank you");
		
		
		
	}

}
