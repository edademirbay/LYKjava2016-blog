package tr.org.linux.kamp2016.helloworld;

import java.util.Random;

public class DiceTest {

	
	public static void main(String[] args) {
		
		
		
		Dice d1 =new Dice();
		Dice d2 =new Dice();
		
		
			System.out.println("player1 has:" + d1.getFaceValue());  
			System.out.println("player2 has:" + d2.getFaceValue()); 	
			
			
			if(d1.getFaceValue() > d2.getFaceValue())
			System.out.println("player1 has win");
			else if(d1.getFaceValue() < d2.getFaceValue())
				System.out.println("player2 has win");
			else if (d1.getFaceValue() == d2.getFaceValue());
			System.out.println("equals");
			
	
		
		//System.out.println("player1 has:" +d.Roll() 
				//+ "player2 has:" + d.Roll());
		
	
	}
		
		
			
		
	public static int randomIntegerRandom(int min,int max){
		Random rgen=new Random();
		int range=Math.abs(max-min)+1;
		int random=min+rgen.nextInt(range);
		return random;

}}
