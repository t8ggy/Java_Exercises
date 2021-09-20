//1) Create a new class call Encapsulation with 5 variables 
//(one String, one integer, one double, one float and one long). 
//2) Encapsulate your variables (make them private and generate getters and setters). 
//3) Generate two constructors - one should be empty. 
//4) Use setters to set values in your Runner.java. 
//5) Use getters and System.out.println(); to print out the values in your Runner.java. 
//6) Generate toString in your Encapsulation.java and invoke it from Runner.java.
//

package qa.com.encapsulationTask;

public class Encapsulation {
	
	private String name;
	private int iq;
	private double hourlyrate;
	private float heightmeters;
	private long phonenumber;
	
	
	public Encapsulation(String name, int iq, double hourlyrate, float heightmeters, long phonenumber) {
		super();
		this.name = name;
		this.iq = iq;
		this.hourlyrate = hourlyrate;
		this.heightmeters = heightmeters;
		this.phonenumber = phonenumber;
	}
	
		public Encapsulation() {
		super();
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIq() {
		return iq;
	}
	public void setIq(int iq) {
		this.iq = iq;
	}
	public double getHourlyrate() {
		return hourlyrate;
	}
	public void setHourlyrate(double hourlyrate) {
		this.hourlyrate = hourlyrate;
	}
	public float getHeightmeters() {
		return heightmeters;
	}
	public void setHeightmeters(float heightmeters) {
		this.heightmeters = heightmeters;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "Encapsulation [name=" + name + ", iq=" + iq + ", hourlyrate=" + hourlyrate + ", heightmeters="
				+ heightmeters + ", phonenumber=" + phonenumber + "]";
	}

	
	
}
