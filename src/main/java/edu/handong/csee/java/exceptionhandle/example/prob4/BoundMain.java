package edu.handong.csee.java.exceptionhandle.example.prob4;//pakcage name

import java.util.Scanner;//use scanner class

public class BoundMain {//Main class

	public static void main(String[] args) {//main method
		Scanner keyboard = new Scanner(System.in);//use scanner class to use keyboard
		int num = 0;//save input data variable
		Boundary arr = new Boundary();//instantiation Boundary class to arr
		boolean repeat = true;//help loop variable
		while(repeat) {//if repeat is true, implement.
			try {//if it cause Exception, go to catch
				System.out.print("Enter an integer: ");//print message for input data
				num = keyboard.nextInt();//save input data to num
				arr.receiveNumber(num);//call recieveNumber method and distinguish Exception of existence
			}
			catch( ArrayIndexOutOfBoundsException e) {//if cause Exception that over array index, implement it
				System.out.println("Invalid array index access!");//print error message
				repeat = false;//save false to repeat, so it stop the loop
			}
		}

	}

}
