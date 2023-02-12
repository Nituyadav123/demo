package javaproject1;
import java.util.Scanner;
public class Prime_Number {
public static void main(String[] args) {
	String str = "";
	do {
	System.out.println("Enter Digits: ");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int count = 0; 
	for(int i = 1 ; i <= num; i++) {
		if(num%i==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.println("This "+num+" Number is Prime ");
	}
	else {
		System.out.println("This "+num+" is Not Prime ");

	}
	System.out.println("Do you want to check another press(Y/N)..");
	str =sc.next();
	}while(str.equalsIgnoreCase("Y"));
	System.out.println("Thank You !!");
}
}
