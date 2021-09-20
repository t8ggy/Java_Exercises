package qa.com.inheritance;

public class Farmer extends Person {

	private boolean married;
	private String farmType;
	private int acres;

	public Farmer(String firstName, String lastName, int age, double heightmeters, long phonenumber, boolean married,
			String farmType, int acres) {
		super(firstName, lastName, age, heightmeters, phonenumber);
		this.married = married;
		this.farmType = farmType;
		this.acres = acres;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public String getFarmType() {
		return farmType;
	}

	public void setFarmType(String farmType) {
		this.farmType = farmType;
	}

	public int getAcres() {
		return acres;
	}

	public void setAcres(int acres) {
		this.acres = acres;
	}


	@Override
	public void soz() {
		System.out.println("Get off my land");
	}

	@Override
	public String toString() {
		return "Farmer [married=" + married + ", farmType=" + farmType + ", acres=" + acres + ", toString()="
				+ super.toString() + "]";
	}

}
