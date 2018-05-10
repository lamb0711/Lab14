package edu.handong.csee.java.exceptionhandle.example.prob5;//package name

import java.util.Scanner;//use scanner class

public class MyMain {//Main class
	public static void main(String[] a) {//main method
		try {//if it cause error, go to catch
			Scanner keyboard = new Scanner(System.in);//instantiation scanner class to use keyboard
			String str = keyboard.nextLine();//declare string str and save input string
			MyMain.testString(str);//call testString method with str
		}catch(MyException mae) {//receive error string mae and implement catch
			System.out.println("Inside catch block: "+mae);//print out message with error message mae
		}
	}

	private static void testString(String str) throws MyException{//testString method test input string, it include to Myexception exception
		if(str.equals("null")) {//if string is same as null
			throw new MyException("String val is null");//instantiation MyException class and throw this message to catch
		}
		else System.out.println("String val is: "+str);//if string is different to null, print message with str

	}

}
