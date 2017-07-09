package com.teoleg.testapp;
/* CallingMethodsInSameClass.java
 *
 * illustrates how to call static methods a class
 * from a method in the same class
 */

public class testapp
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static String printOne() {
		System.out.println("Hello World");
		return "1";
	}

	public static String printTwo() {
		printOne();
		printOne();
		return "2";
	}
}
