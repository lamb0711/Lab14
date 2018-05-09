package edu.handong.csee.java.exceptionhandle.example.prob2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class In_exception {
	private int x=0, y=0;
	
	public In_exception() {
	}
	public void distinguishError() {
		
		try {
			Scanner keyboard = new Scanner(System.in);
			
			System.out.print("x: ");
			x = keyboard.nextInt();
			System.out.print("y: ");
			y = keyboard.nextInt();
			
			System.out.println(this.x/this.y);
		}
		catch(ArithmeticException e) {
			System.out.println("java.lang.ArithmeticExcetion: "+e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}
		catch(Exception e) {
			System.out.println("Some other exception has occurred: "+e.getMessage());
		}
		
	}

}
