package com.qa.constructors;

public class runner {

	public static void main(String[] args) {

		Addormultiply set1 = new Addormultiply (4, 5, false);
		Addormultiply set2 = new Addormultiply (6, 5, true);
		Addormultiply set3 = new Addormultiply (2, 4, false);
		Addormultiply set4 = new Addormultiply (3, 2, true);
				
		Addormultiply.questions();
		
		set1.process();
		set2.process();
		set3.process();
		set4.process();
				
	}
}