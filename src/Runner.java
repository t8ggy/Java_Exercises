
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		boolean iainsBool = false;
		float iainsAge = 18.0f;
		String iainsName = "Iain";

		System.out.println(iainsName);
		System.out.println(iainsAge);
		System.out.println(iainsBool);

		
//		Two ways to call and print the return value - this way creates a local version of the result string
		String localString = DataTypeExercise.iainsReturn(); 
		System.out.println(localString);
		
//		The second way nests the method call inside a println call
		System.out.println(DataTypeExercise.iainsReturn());

	}

}
