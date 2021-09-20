package qa.com.inheritance;

public class Banker extends Person {

	private boolean accredited;
	private String bankName;
	private int yearsService;

	public Banker(String firstName, String lastName, int age, double heightmeters, long phonenumber, boolean accredited,
			String bankName, int yearsService) {
		super(firstName, lastName, age, heightmeters, phonenumber);
		this.accredited = accredited;
		this.bankName = bankName;
		this.yearsService = yearsService;
	}

	public boolean isAccredited() {
		return accredited;
	}

	public void setAccredited(boolean accredited) {
		this.accredited = accredited;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getYearsService() {
		return yearsService;
	}

	public void setYearsService(int yearsService) {
		this.yearsService = yearsService;
	}

	@Override
	public void soz() {
		System.out.println("Please accept my most humble apology");
	}

	@Override
	public String toString() {
		return "Banker [accredited=" + accredited + ", bankName=" + bankName + ", yearsService=" + yearsService
				+ ", toString()=" + super.toString() + "]";
	}

}
