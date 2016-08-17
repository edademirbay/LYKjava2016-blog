package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class FactTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Fact factObj=new Fact();
		 Scanner input=new Scanner(System.in);
		 System.out.println("Faktöriyeli alınacak sayıyı giriniz:");
		 int inputValue=input.nextInt();
		 System.out.println(factObj.factoriyel(inputValue));
	}

}
