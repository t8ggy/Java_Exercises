package qa.com.encapsulationTask;

public class Runner {

	public static void main(String[] args) {

		Encapsulation example = new Encapsulation();

		example.setHeightmeters(1.75f);
		example.setHourlyrate(12.50);
		example.setPhonenumber(1234567890L);
		example.setName("Bojo the Clown");
		example.setIq(82);

		System.out.println(example.getHeightmeters());
		System.out.println(example.getHourlyrate());
		System.out.println(example.getPhonenumber());
		System.out.println(example.getName());
		System.out.println(example.getIq());

		System.out.println(example.toString());
	}

}
