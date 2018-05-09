package edu.handong.csee.java.exceptionhandle.example.prob1;//package name

import java.util.Random;//use random class
import java.util.Scanner;//use scanner class

public class Main {//Main class

	public static void main(String[] args) {//main method
		Scanner keyboard = new Scanner(System.in);//use scanner class with keyboard
		Random rand = new Random();//instantiation random class
		int limit = 0, speed = 0;//declare limit and speed variable

		System.out.print("Set the speed limit, officer: ");//print message for input limit
		limit = keyboard.nextInt();//save input data to limit
		speed = rand.nextInt(101);//save random number to speed

		SpeedLimitter lim = new SpeedLimitter(limit, speed);//instantiation and initialization SpeedLimitter class to lim

		lim.warnSpeedLimit();//call warnSpeedLimit method

		keyboard.close();//close keyboard scanner for safe

	}

}
