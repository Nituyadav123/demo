package ThisSuper;

import graphql.PublicApi;

public class MethodOverloading {

	public static void main(String[] args) {

		M1(123);
		M1("d");
		M1(0, 0, 0);
	}

	public static void M1(int a) {
		System.out.println(12);

	}

	public static void M1(String a) {
		System.out.println("Anshika");
	}

	public static void M1(int a, int b, int c) {
		System.out.println(9999);
	}

}
