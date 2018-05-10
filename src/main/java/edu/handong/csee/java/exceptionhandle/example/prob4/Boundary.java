package edu.handong.csee.java.exceptionhandle.example.prob4;//package name

public class Boundary {//Boundary class. it save input data to array on 5times
	private static int [] arr = new int[5];//declare array arr[5]
	private static int cnt = 0;//this variable help to loop
	public void receiveNumber(int num) throws ArrayIndexOutOfBoundsException{//receiceNumber method receive input data and if it cause error(like over array size) throw catch
		int i = cnt;//save cnt number to i. i is array index
		arr[i] = num;//save input data num to arr[i]
		cnt++;//add loop number
		System.out.printf("arr[%d] <- %d\n",i,num);//print input array data and array index
	}

}
