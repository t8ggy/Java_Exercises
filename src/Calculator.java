
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2, 1));
		System.out.println(multiply(2, 1));
		System.out.println(subtract(2, 1));
		System.out.println(divide(1, 2));
	}

	private static int add(int num1, int num2) {
		return num1 + num2;

	}

	private static int multiply(int num1, int num2) {
		return num1 * num2;

	}

	private static int subtract(int num1, int num2) {
		return num1 - num2;

	}

	private static double divide(double num1, double num2) {
		if (num1 >= num2) {

			return num1 / num2;

		} else {
			System.out.println("The division cannot be performed");
			return 0;
		}
	}
}