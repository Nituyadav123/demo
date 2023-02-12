package ArrayList_____sunday;

import graphql.PublicApi;

public class DoubleDimension {

	public static void main(String[] args) {
		DoubleDimension doubleDimension = new DoubleDimension();

//matrix();
//		String arr[][]= {{"Aman","sunil","rohan"},{"sarita","sumit","soni"}};
//		System.err.println(arr[0][1]);
////		System.err.println(arr[2][2]);
//int [][]two= {{10 ,20 , 30},{40 ,50  ,60 },{70 ,80 ,90 }};	
//for (int i = 0; i < two.length; i++) {
//	for (int j = 0; j < two[0].length; j++) {
////		System.err.print(two[i][j]+"   ");
//		System.err.print(two[i][j]+"");
//	}
//	System.err.println();
//	}}
//	String arr[][] = { { "aman ", "nitu", "ritu" }, { "kajal", "karishma", "anshika" }, { "ram", "tanu", "aanu" } };
//		for (String[] strn : arr) {
//			System.err.println(strn);
//System.err.println(arr.length);
//for (int i = 0; i < arr.length; i++) {
//		for (int j = 0; j < arr[i].length; j++) {
//			System.err.println(arr[i][j]);
//		}

//		String akk [][]= {{"nitu","ritu","sonu"},{"poonam","soni","solam"},{"anshika","rina","khushi"}};
//		for (String[] strn: akk) {
//			for(String str:strn) {
//				System.err.println(str);
//			}
//		}
//		String ak[][][]= {{{"nitu","ritu","sonu"},{"poonam","soni","solam"},{"anshika","mohan","sona"},{"umesha","vikash","akash"}},
//		{{"nitu","ritu","sonu"},{"poonam","soni","solam"},{"anshika","mohan","sona"},{"umesha","vikash","akash"}},
//		{{"nitu","ritu","sonu"},{"poonam","soni","solam"},{"anshika","mohan","sona"},{"umesha","vikash","akash"}}};
//		for (String[][]st: ak) {
//			for(String []str:st) {
//				for(String strn: str )
//				System.err.println(strn);
//			}
//	}
//	public static void matrix() {
//		int ab[][] = new int[3][3];
//		ab[0][0] = 1;
//		ab[0][1] = 2;
//		ab[0][2] = 3;
//		ab[1][0] = 4;
//		ab[1][1] = 5;
//		ab[1][2] = 6;
//		ab[2][0] = 7;
//		ab[2][1] = 8;
//		ab[2][2] = 9;
//		for (int i = 0; i < ab.length; i++) {
//			for (int j = 0; j < ab[i].length; j++) {
//				System.err.print(ab[i][j]+" ");
//			}
//			System.err.println();

		// int [][]a=new int[2][4];
		int[][] a = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 4, 5, 6, 7 }, { 4, 5, 6, 7 } };
		for (int j = 0; j < a.length; j++) {/// row

			for (int i = 0; i < a[0].length; i++) { /// colum
				System.out.print(a[j][i] + " ");
			}
			System.out.println();

		}

	}
}
