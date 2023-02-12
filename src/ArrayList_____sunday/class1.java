package ArrayList_____sunday;

public class class1 {

	public static void main(String[] args) {
		int count;
		System.out.println("First 100 prime Number are");
		for (int number = 2; number <= 100; number++) {
			count = 0;
			for (int j = 2; j <= number / 2; j++) {
				if (number % j == 0) {
					count++;
					break;

				}
			}
			if (count == 0 && number != 1) {
				System.out.println(number + " ");
				//// prime no.
			}
		}

	}
}
