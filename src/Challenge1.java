import java.util.Arrays;

public class Challenge1 {
	public static int[] odds(int numOdds) {
//        /**
//         * Return an array of the first numOdds odd numbers
//         * Arguments
//         * numOdds - a positive integer representing the number of odd numbers to store in the array
//         * Examples
//         * odds(3) returns [1, 3, 5]
//        */
//
//        // ====================================
//        // Do not change the code before this
//
//        // CODE1: Write code that will create an array with the first numOdds
//        //        odd numbers and return the array

		
		int[] Odds = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int[] selectedOdds = Arrays.copyOfRange(Odds, 0, numOdds);
		return selectedOdds;
		
		// ====================================
		// Do not change the code after this
	}

	public static void main(String[] args) {
		int[] theOdds = odds(3);
		// Expected output is
		// 1, 3, 5
		System.out.println(theOdds[0] + ", " + theOdds[1] + ", " + theOdds[2]);
	}

}

