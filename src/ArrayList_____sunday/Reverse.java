package ArrayList_____sunday;

public class Reverse {

	public static void main(String[] args) {
		b();
	

//		String c = "Nitu Yadav";
//		char[] w = c.toCharArray();
//		for (int j = 0; j < w.length - 1; j--) {
//
//			System.out.print(w[j]);
//		}
//		System.out.println();
//	
//		String ccString = "ram Yadav";
//		char[] a = ccString.toCharArray();
//		for (int i = a.length - 1; i >= 0; i--) {
//
//			System.out.print(a[i]);
//
//			System.out.println();
	String word = "nituyadav";
	char ch[]=word.toCharArray();
			for(int i = 0;i<word.length()-1; i--){
			
		
			}
//			System.out.print(ch[i]);
			System.out.println();
			}
//
//	}
	public static void b() {
		String[] arr = { "Sumit", "Vivek", "Vinay", "Aman", "Rahul" };
		String name = "sumit";
		for (int i = 0; i < arr.length; i++) {
			if (name.equalsIgnoreCase(arr[i])) {
				break;
			}
		}
		char hr[] = name.toCharArray();
		for (int i = hr.length - 1; i >= 0; i--) {
			if (hr[i] == hr[hr.length - 1]) {
				hr[i] = (char) (hr[i] - 32);
			}
			System.out.print(hr[i]);
		}
	}

	public static void b(int a) {
		String[] arr = { "Sumit", "Vivek", "Vivek", "Vinay", "Aman", "Rahul" };
		int temp = 1;
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			temp = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					temp++;
					s = arr[i];
				}
			}
		}
		if (temp == 2) {
		}
		char hr[] = s.toCharArray();
		for (int i = hr.length - 1; i >= 0; i--) {
			if (hr[i] == hr[hr.length - 1]) {
				hr[i] = (char) (hr[i] - 32);
			}
			System.out.print(hr[i]);
		}
	}
}
//			[7:13 pm, 19/12/2022] Nitu Yadav: https://youtu.be/Mq6DOreyvM4
