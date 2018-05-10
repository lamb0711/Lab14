package edu.handong.csee.java.exceptionhandle.example.prob3;//package name

public class PowerCalculate {//PowerCalculae class. it calculate n and p to n^p

	public long calculateNumber(int n, int p) throws Exception{//calculate method return long type. it include Exception class
		long result = 0;//declare long type variable

		result = (long)Math.pow(n, p);//save calculate result to result into long type
		if(n<0 || p < 0) {//if n and p are smaller than 0
			throw new Exception("n or p should not be negative. ");//throw this message to catch
		}
		if(n == 0 && p==0) {//if n and p are same as 0
			throw new Exception("n and p should not be zero. ");//throw this message to catch
		}
		return result;//return long type variable result
	}

}
