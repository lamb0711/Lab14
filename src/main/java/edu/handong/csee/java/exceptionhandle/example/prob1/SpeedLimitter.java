package edu.handong.csee.java.exceptionhandle.example.prob1;//package name

public class SpeedLimitter {//SpeedLimitter class
	private int speed = 0;//save speed variable
	private int limit = 0;//save limit variable

	public SpeedLimitter(int limit, int speed) {//SpeedLinitter class constructor
		this.limit = limit;//save input data to this class limit
		this.speed = speed;//save input data to this class speed
	}

	public void warnSpeedLimit() {//distinguish speed is more than limit method
		try {//try statement, if it cause error, go to catch statement
			if(this.speed > this.limit) {//if speed is bigger than limit
				throw new Exception("Speed Limit "+ this.limit + "km exceeded!");//go to catch statement with Exception string
			}
			System.out.println("You are a law abiding citizen");//if speed is smaller than limit print this message
		}catch(Exception e) {//if it cause error, implement catch statement
			System.out.println(e.getMessage());//print Exception string message
			System.out.println("You are being fined. ");//print message
		}
		System.out.println("Your current speed: " + this.speed);//print speed
	}

}
