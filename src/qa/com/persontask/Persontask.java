//General    PERSON TASK:
//1)Create a Person class with a few variables (height, name, shoe size, job title, age).
//2) Generate a constructor with all of them.
//3) Create another constructor that only has name and height.
//4) Create 2 methods that use these variable (e.g. greet - similar to the one I showed you). 
//They SHOULD NOT be static.
//5) Create 4 instances of the Person class in your runner and call the methods.
//6) Upload your code to GitHub.

package qa.com.persontask;

public class Persontask {

	private double height;
	private String name;
	private int shoesize;
	private String jobtitle;
	private int age;

	public Persontask(double height, String name, int shoesize, String jobtitle, int age) {
		this.height = height;
		this.name = name;
		this.shoesize = shoesize;
		this.jobtitle = jobtitle;
		this.age = age;
	}

	public Persontask(double height, String name) {
		super();
		this.height = height;
		this.name = name;
	}

	public void shoesize() {
		System.out.println(name + " has size " + shoesize + " feet!");
	}

	public void namejob() {
		System.out.println(name + " has the job title " + jobtitle);
		
	}

}
