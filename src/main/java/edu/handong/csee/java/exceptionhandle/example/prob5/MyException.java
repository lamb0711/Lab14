package edu.handong.csee.java.exceptionhandle.example.prob5;//package name

public class MyException extends Exception {//MyException class it inherit Exception class. And this class use overriding
	private String message = null;//save string variable.

	public MyException() {//if it do not have any parameter, implement this constructor 
		super();//call super method in Exception.
	}

	public MyException(String message) {//if it have string parameter, implement this constructor 
		super(message);//call super method with message string
		this.message = message;//save input data to message
	}

	public MyException(Throwable cause) {//if any error cause, implement this constructor 
		super(cause);//throw error message
	}

	public String toString() {//toStrign class return string
		return message;//return message
	}

}
