
public class OddEvenReturnBool {

	public static void main(String[] args) {
	
		int[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		for (int num : numArray) {
					
				if (oddeven(num)) {
					System.out.println(num * num * num);
				
				} else {
					System.out.println(num * num);
				}
		}
		
	}

	public static boolean oddeven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
//Create an array of strings and iterate through it, printing each value to console, using an enhanced for loop.
//
//Create an array of integers 1-20 and iterate through it, using an enhanced for loop, square, and then print each value.
//
//Create a method that returns a boolean and accepts an integer as a parameter, if the integer is even, return true, if not then return false.
//
//Using the array of integers from exercise 2 and the method created in exercise 3; iterate through the array using an enhanced for loop, calling the method from exercise 3 in the body.
//
//If the value is even, cube it, then print it to console.
//If the value is odd, square it, then print it to console.