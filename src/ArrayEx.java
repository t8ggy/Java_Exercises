
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayEx {

	public static void main(String[] args) {

		List<String> sandwiches = new ArrayList<>();

		sandwiches.add("bread sandwich");
		sandwiches.add("pop tart");
		sandwiches.add("hot dog");

		System.out.println(sandwiches);
		System.out.println(sandwiches.get(0));

		sandwiches.set(0, "ice cream taco");
		System.out.println(sandwiches);

//  

		for (String i : sandwiches) {
			System.out.println(i);
		}

	}

}
