package ArrayList_____sunday;

import java.lang.invoke.StringConcatFactory;

import zmq.Msg;

public class MethodSignature {//// Duplicate method M1(int) in type MethodSignature
	public static void main(String[] args) {

		MethodSignature ms = new MethodSignature();
		ms.M1(10);
		ms.M1(20, 10);
	}

//	public static int  M1(int a) {
//		return 2;
//
//	}
//
//	public static String M1(int a) {
//
//		return "hello";
	public static int M1(int a, int k) {
		System.err.println("hii Nitu");
		return 2;

	}

	public static String M1(int a) {
		System.err.println("hello nitu");
		return "jaunpur";

	}

}