
public class SquaringInts {

	public static void main(String[] args) {

		int[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		for (int num : numArray) {
			System.out.println(num);
		}

		for (int i = 0; i < 20; i++) {

			numArray[i] = numArray[i] * numArray[i];
			System.out.println(numArray[i]);

		}
	}
}
