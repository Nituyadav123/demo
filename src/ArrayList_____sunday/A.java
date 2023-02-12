package ArrayList_____sunday;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();

		String sig =sc.next();
		
		switch (sig) {
		case "+":{
			
			int num2 = sc.nextInt();
			System.out.println(num1+num2);
			break;
		}
		case "-":{
			int num2 = sc.nextInt();
			System.out.println(num1-num2);
			break;}
		case "*":{
			int num2 = sc.nextInt();
			System.out.println(num1*num2);
			break;}
		case "/":{
			int num2 = sc.nextInt();
			System.out.println(num1/num2);
			break;}
		default:{
			System.out.println("not match");
			break;}
			
		}
	}
}
