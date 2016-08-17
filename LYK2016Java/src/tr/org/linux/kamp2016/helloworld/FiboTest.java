package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class FiboTest {

	
	public static void main(String[] args) {
		 
		fibo f=new fibo();
		Scanner input=new Scanner(System.in);
		System.out.println("herhangi bir sayı giriniz:");
	    int inputValue=input.nextInt();
		 System.out.println(f.fibonacci(inputValue));
	}

}
