package tr.org.linux.kamp2016.helloworld;

public class fibo {

	public static int fibonacci(int x){
		if(x==0)
			return 0;
		else if(x==1)
			return 1;
		
		else  {
			
			int sonuc= fibonacci(x-2)+fibonacci(x-1);
			return sonuc;
			

	}

	}}
