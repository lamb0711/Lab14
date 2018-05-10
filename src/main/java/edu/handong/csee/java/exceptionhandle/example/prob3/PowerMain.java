package edu.handong.csee.java.exceptionhandle.example.prob3;//package name

import java.util.Scanner;//use scanner class

public class PowerMain {//main class
	public static final PowerCalculate myCalculator = new PowerCalculate();//declare to final variable. instantiation PowerCalculate to myClaculator
	public static final Scanner in = new Scanner(System.in);//use Scanner class

	public static void main(String[] args) {//main method
		while(in.hasNextInt()) {//until scanner close, save input data to n and p
			int n = in.nextInt();//save input integer to n
			int p = in.nextInt();//save input integer to p

			try {//if it cause Exception, go to catch 
				System.out.println(myCalculator.calculateNumber(n,p));//print result that called calcuateNumber method
			}
			catch(Exception e) {//if cause Exception, implement it
				System.out.println(e);//print Exception variable
			}
		}


	}

}
