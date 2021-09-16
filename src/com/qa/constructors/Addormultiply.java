package com.qa.constructors;

public class Addormultiply {
	private int firstnum;
	private int secondnum;
	private boolean state;

	public Addormultiply(int firstnum, int secondnum, boolean state) {
		this.firstnum = firstnum;
		this.secondnum = secondnum;
		this.state = state;
	}

	public void process() {

		if (state) {
			System.out.println(firstnum + secondnum);
		} else {
			System.out.println(firstnum * secondnum);
		}
	}

	public static void questions() {
		System.out.println("? ? ? ? ?");
	}
}
