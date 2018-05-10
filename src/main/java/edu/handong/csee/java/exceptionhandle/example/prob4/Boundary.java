package edu.handong.csee.java.exceptionhandle.example.prob4;

public class Boundary {
	private static int [] arr = new int[5];
	private static int cnt = 0;
	public void receiveNumber(int num) throws ArrayIndexOutOfBoundsException{
		int i = cnt;
		arr[i] = num;
		cnt++;
		System.out.printf("arr[%d] <- %d\n",i,num);
	}

}
