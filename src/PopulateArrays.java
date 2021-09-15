
public class PopulateArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] xArray = new int[10];

		int pop = 50;

		for (int i = 0; i < 10; i++) {

			xArray[i] = pop;
			pop++;

			System.out.println(xArray[i]);
		}

		for (int i = 0; i < 10; i++) {

			xArray[i] = xArray[i] * 10;
			System.out.println(xArray[i]);
	}
	}
}
