package ArrayList_____sunday;

public class Methodsingture {

	public void m1(String h, Object t) {

		System.err.println(" I am M1");

	}

	public void m1(Object l, String d) {

		System.err.println("I am M2");
	}

	public static void main(String[] args) {
		Methodsingture obj = new Methodsingture();
//		obj.m1("sum", null);
		obj.m1(obj, null);
		obj.m1(null, obj);
	}

}
