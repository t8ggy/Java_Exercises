
public class Challenge3 {

	public static double stringToDouble(String number) {



		Double newd = Double.parseDouble(number);

		return newd;

	}

	public static void main(String[] args) {
		double theDouble = stringToDouble("3.14159");
		double expected = 3.14159;
		// Expected output is
		// true
		System.out.println(theDouble == expected);
	}
}
