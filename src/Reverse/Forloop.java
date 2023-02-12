package Reverse;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {

//		for(int i=0; i<=5;i++) {
//		System.out.println(i);
//		System.out.println(i);

//		for(int j=0 ;    j<=5; j--) {
//			for(int k=5; k>=j; k--) {
//				{	System.out.print("*");
//		System.out.println();

		int m = 0;
//		for (int i=1;  i<=3;i++) {
//		for(int p=1; p<=i; p++) {
//						System.out.print("*");
//						}System.out.println();
//				for(int o=1; o<=5; o++) {		
//				for(int d=5; d>=o; d--) {
//					System.out.print("*");	
//				}System.out.println();	
		for (System.out.println("hello"); m <= 3; m++) {
			System.out.print(" nitu  ");
			m++;
		}
		System.out.println();

		int h = 0;
		for (System.out.println("Hii jaunpur"); h <= 3; h++) {
			System.out.print("Kajal Yadav   ");
		}
		System.out.println();
		Scanner sc=new Scanner (System.in);
		int num ;
		System.out.println("Enter a number:");
		
		num=sc.nextInt();
		if (num%2==0) {
		System.out.println(num+"is an EVEN no.");
		
		}
		else {
			System.out.println(num+"is an ODD no. ");
		}
		
		

	}

}
