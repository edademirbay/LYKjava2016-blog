package tr.org.linux.kamp2016.helloworld;

import java.util.Random;

public class RightTriangleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	 

	 for (int i = 0; i <10; i++) {
		 
		int A= randomIntegerRandom(1,50);
		int B= randomIntegerRandom(1,50);
		
		RightTriangle r= new RightTriangle(A,B);
		System.out.println((1+i)+ "-" +  "A:" + r.getA() + "+" + "B:" + r.getB()+ "hipotenüs:"+ r.Hypotenus()+ "perimeter:" + r.perimeter());}
	
		
	 
	
		}
	 
	public static int randomIntegerRandom(int min,int max){
		Random rgen=new Random();
		int range=Math.abs(max-min)+1;
		int random=min+rgen.nextInt(range);
		return random;
		
	}
		
	 
	
	}	
	
	 

	


