package qa.com.inheritance;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private double heightmeters;
	private long phonenumber;

	
	public Person(String firstName, String lastName, int age, double heightmeters, long phonenumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.heightmeters = heightmeters;
		this.phonenumber = phonenumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeightmeters() {
		return heightmeters;
	}

	public void setHeightmeters(double heightmeters) {
		this.heightmeters = heightmeters;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public void soz() {
		System.out.println("Sorry mate");
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", heightmeters="
				+ heightmeters + ", phonenumber=" + phonenumber + "]";
	}

}
