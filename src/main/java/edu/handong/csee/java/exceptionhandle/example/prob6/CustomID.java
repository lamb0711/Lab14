package edu.handong.csee.java.exceptionhandle.example.prob6;//package name

public class CustomID extends Exception{//CustomID class it inherit Exception class
	private String[] races = new String[] {"Vulcans","Romulan","Klingons"};//declare string type array races, and save data
	private String name = "";//declare string variable it save name string
	private int age = 0;//declare integer variable
	private String race = "";//declare string variable it save race string
	private int state = 0;//declare integer variable

	public void setName(String str) throws Exception{//setName method save input data to name. it inherit Exception class
		if(str.length() < 5) {//if input string data less than 5
			state = 0;//state save 0
			throw new Exception("Your name is short! Try again!");//instantiation Exception class and throw error message to catch
		}else {//if input string more than 5
			this.name = str;//save string to name string
			System.out.println("Name is valid");//print message
			System.out.println("Name: " + this.name);//print name
			state++;//add state variable
		}
	}

	public void setAge(int num) throws Exception{//setAge method is save input data to age. it inherit Exception class
		if(num < 18) {//if num is less than 18
			state = 1;//state save 1
			throw new Exception("You are too young! Try again!");//instantiation Exception class and throw error message to catch
		}else {//if num is more than 18
			this.age = num;//save input data to age
			System.out.println("Age is valid");//print message
			System.out.println("Age: " + this.age);//print age
			state++;//add state variable
		}
	}

	public void setRace(String race) throws Exception{//setRace method is save input data to race. it inherit Exception class
		for(int i=0; i < races.length; i++) {//i is less than races's length, loop it
			if(races[i].equals(race)) {//if array races variable equal with race
				this.race = races[i];//save array variable to race
				System.out.println("Race is valid");//print message
				System.out.println("Race: "+ races[i]);//print races array variable
				state = 0;//state save 0
				return ;//end method
			}
		}

		state = 2;//state save 2
		throw new Exception("Human! Try again.");//instantiation Exception class and throw error message to catch
	}

	public int getState() {//return state method
		return state;//return state
	}
}
