package edu.handong.csee.java.exceptionhandle.example.prob6;//package name

import java.util.Scanner;//use scanner class

public class CustomMain {//Main class

	public static void main(String[] args) {//main method
		String name, race;//declare name and race
		int age = 0;//declare age integer variable
		Scanner keyboard = new Scanner(System.in);//instantiation scanner class to use keyboard
		CustomID obj = new CustomID();//instantiation CustomID class to obj
		boolean repeat = true;//save boolean variable. it help loop

		while(repeat) {//loop infinite
			try {//if it cause Exception, go to catch
				if(obj.getState() == 0) {//call getState method to distinguish state number. if state is 0 
					System.out.print("Enter your name: ");//print message to input data
					name = keyboard.nextLine();//save input data to name
					obj.setName(name);//call setName method
				}else if(obj.getState() == 1) {//call getState method to distinguish state number. if state is 1
					System.out.print("Enter your age: ");//print message to input data
					age = keyboard.nextInt();//save input data to age
					keyboard.nextLine();//for empty space
					obj.setAge(age);//call setAge method
				}else if(obj.getState() == 2) {//call getState method to distinguish state number. if state is 2
					System.out.print("Enter your race: ");//print message to input data
					race = keyboard.nextLine();//save input data to race
					obj.setRace(race);//call setRace method
				}
			}catch(Exception e) {//if it cause Exception. implement this
				System.out.println(e.getMessage());//print error message in e
				continue;// repeat loop
			}
		}

	}

}
