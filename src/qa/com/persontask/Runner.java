package qa.com.persontask;

public class Runner {

	public static void main(String[] args) {
	
		Persontask matthew = new Persontask (178, "Matthew", 9, "Ops Diecttor", 47);
		Persontask mark = new Persontask (172, "Mark",7, "DevOps", 27);
		Persontask luke = new Persontask (162, "Luke", 8, "Development Manager", 36);
		Persontask john = new Persontask (158, "John", 6, "HR Manager", 42);
		
		matthew.shoesize();
		john.shoesize();
		mark.namejob();
		luke.namejob();

	}

}
