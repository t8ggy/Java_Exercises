
public class StringManipulation {

	public static void main(String[] args) {

//		Exercise 1 
//		Create two Strings where one string has a value of “yesterday it was raining” and the other string with a value of “today it is sunny”
//
//		Concatenate both values, capitalise both strings and print out the result.
//		The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING

//		Now use the substring method to print out: `TODAY IT IS RAINING`

//		Answer 
//		String phr1 = "yesterday it was raining";
//		String phr2 = "today it is sunny";
//		
//		System.out.println(phr2.toUpperCase()+", "+phr1.toUpperCase());
//		
//		 String Sub1 = phr2.substring(0, 11);
//		 String Sub2 = phr1.substring(16, 24);
//		 System.out.println(Sub1.toUpperCase() + Sub2.toUpperCase());
//		 
//		Exercise 2
//		For this task you are to implement 4 methods that manipulate String objects. 
//		For all parts of this section you are only allowed to use the 
//		length(), substring(), and equals() methods. 
//		Avoid using arrays or any methods you have yet to be taught as this defeats the 
//		purpose of the exercise:
//
//		Method 1 - When given a String, count and return how many words there are in that String.
//		
//		Answer
//		String phr3 = "Once upon a time in a galaxy far far away";
//		 
//		 int wordcount=1;
//		 int letters = 0;
//		 
//		 for (int i = 0; i < phr3.length(); i++) {
//			 
//			 char letter = phr3.charAt(i);
//			 
//			 if (letter == ' ') {
//				 wordcount = wordcount + 1;
//			} else {
//					letters++;
//				}
//		 }
//		 System.out.println(wordcount);
//		 System.out.println(letters);
//
//		Method 2 - When given a String, print out this String in a vertical fashion, 
//		each word on a different line. 

//		Answer

//		String phr4 = "We eat pancakes on Shrove Tuesday";
//		
//		 for (int i = 0; i < phr4.length(); i++) {
//	 		 char letter = phr4.charAt(i);
//	 		 System.out.println(letter);
//	 		 
//		 }

//		Method 3 - When given a String, print out this String in a vertical fashion in 
//		reverse order, each word on a different line.

//		Answer
//
//		String phr5 = "Parsnips do not butter my parsnips";
//		int start;
//		int finish = phr5.length();
//
//		for (int i = phr5.length() - 1; i >= 0; i--) {
//
//			char letter = phr5.charAt(i);
//
//			if (letter == ' ') {
//
//				start = i + 1;
//				String word = phr5.substring(start, finish);
//				System.out.println(word);
//				finish = i;
//
//			}
//
//		}
//		String word = phr5.substring(0, finish);
//		System.out.println(word);

//		Method 4 - A find method, which takes 2 Strings; the first is message and the 
//		second is the String you want to find in the message. A boolean value should be 
//		returned to indicate whether or not the second String has been found in the 
//		message.
//		
//		Answer

		String message = "Make Java concepts stick to your brain fast!";
		String portion = "java";

		System.out.println(extract(message, portion));
	}

	public static boolean extract(String message, String portion) {

		int sublength = portion.length();
		char firstletter = portion.charAt(0);
		boolean present = false;

		for (int i = 0; i < message.length() - sublength; i++) {

			char letter = message.charAt(i);

			if (letter == firstletter) {

				String extract = message.substring(i, i + sublength);

				if (extract.equals(portion))
				{
					present = true;
				}
			}
		}
		return present;
	}

}
