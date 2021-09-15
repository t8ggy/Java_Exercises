
public class flowchart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputa(501);

	}

	private static void inputa(int value) {
		// TODO Auto-generated method stub
		if (value > 2000) {
			System.out.println("A");
		} else {
			System.out.println("1");
		}
		if (value > 2000 && value <= 6000) {
			System.out.println("B");

		}
		if (value > 2000 && value > 6000) {
			System.out.println("C");

		}
		if (value > 2000 && value <= 6000 && value > 4000) {
			System.out.println("D");

		}
		if (value > 2000 && value <= 6000 && value <= 4000) {
			System.out.println("E");

		}
		if (value <= 2000 && value <= 100) {
			System.out.println("2");

		}
		if (value <= 2000 && value > 100) {
			System.out.println("3");

		}
		if (value <= 2000 && value > 100 && value <= 600) {
			System.out.println("4");

		}
		if (value <= 2000 && value > 100 && value > 600) {
			System.out.println("5");

		}
		if (value <= 2000 && value > 100 && value <= 600 && value > 500) {
			System.out.println("6");

		}
		if (value <= 2000 && value > 100 && value <= 600 && value <= 500) {
			System.out.println("7");

		}
	}
}
