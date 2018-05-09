package edu.handong.csee.java.exceptionhandle.example.prob2;//package name

import java.util.InputMismatchException;//use InputMismatchException class
import java.util.Scanner;//use scanner class

public class In_exception {//class name
	private int x=0, y=0;//declare and initialize x,y variable

	public In_exception() {//constructor
	}

	public void distinguishError() {//distinguishError method

		try {
			Scanner keyboard = new Scanner(System.in);//use scanner class with keyboard

			System.out.print("x: ");//print message for input x data
			x = keyboard.nextInt();//save input data to x
			System.out.print("y: ");//print message for input y data
			y = keyboard.nextInt();//save input data to y

			System.out.println(this.x/this.y);//print divided result
		}
		catch(ArithmeticException e) {//if y is 0, implement this 
			System.out.println("java.lang.ArithmeticExcetion: "+e.getMessage());//print out error message with Exception String
		}
		catch(InputMismatchException e) {//if x or y is not integer, implement this 
			System.out.println("java.util.InputMismatchException");//print out error message
		}
		catch(Exception e) {//etc error
			System.out.println("Some other exception has occurred: "+e.getMessage());//print out error message with Exception String
		}

	}

}
