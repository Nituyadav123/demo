package ArrayList_____sunday;

import reverce.forloop;

public class Even_odd {

	public static void main(String[] args) {
//		int n = 100;
//
//		if (n % 3 == 0) {
//			System.out.println("Even");
//		} else {
//			System.out.println("odd");
//		}

//	String S = "MOM";
//	String rev = " ";
//		for (int i = S.length() - 1; i >= 0; i--) {
//			rev = rev + S.charAt(i);
//			if (S.equals(S)) {
//				System.out.println("This is pelindrom String ");
//
//			} else {
//				System.out.println("This is pelindrome String");
//			}}}}
//			String d ="lal";
//			char a=0;
//			for (int  k = d.length()-1; k>=0; k--) {
//				a=d.charAt(k);
//						System.err.println(a);
////				String n = "utin";
//				char a = 0;
//				for (int i = n.length() - 1; i >= 0; i--) {
//					a = n.charAt(i);
//					System.err.print(a);
	String wordString = "Hey i am  Nitu";
	String[] aStrings = wordString.split(" ");
	for (int i = 0; i < aStrings.length; i++) {
		char[] arr = aStrings[i].toCharArray();
		for (int j = arr.length - 1; j >= 0; j--) {
			
		
		System.out.print(arr[j]);
	
		System.out.print(" ");
		}
	}}}
