package tr.org.linux.kamp2016.helloworld;

import java.util.Random;

public class Dice {
  
	private int faceValue;
	
	
	public int getFaceValue() {
		return faceValue;
	}

	

	public Dice(){
		 int faceValue=1;
		 
	}
	
	public int Roll(){
		int faceValue= 1+(int)((Math.random()*6));
		return faceValue;
		
	}
	
	
	
}

