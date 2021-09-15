
public class Flowchart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addormultiply(2, 3, true);
	}

	private static void addormultiply(int num1, int num2, boolean op) {
		// TODO Auto-generated method stub
		if (op) {
			System.out.println(num1 + num2);
		} else {
			System.out.println(num1 * num2);
		}
	}

}
