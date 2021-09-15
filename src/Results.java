
public class Results {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int physics = 125;
		int chemistry = 110;
		int biology = 120;

		individual(physics, chemistry, biology);
		percentage(physics, chemistry, biology);

	}

	public static void individual(int physics, int chemistry, int biology) {
		System.out.println("Your score for the Physics exam = " + physics);
		System.out.println("Your score for the chemistry exam = " + chemistry);
		System.out.println("Your score for the biology exam = " + biology);
	}

	public static void percentage(double physics, double chemistry, double biology) {

		System.out.println((physics + chemistry + biology) / 450 * 100 + "%");
	}
}