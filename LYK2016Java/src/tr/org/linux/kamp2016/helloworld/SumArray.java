package tr.org.linux.kamp2016.helloworld;

public class SumArray {

	public static void main(String[] args) {
		
		int[] array= new int[5];
		array[0]=6;
		array[1]=7;
		array[2]=8;
		array[3]=2;
		array[4]=3;
		
		int sum =0;
		
		
   for (int i = 0; i < array.length; i++) {
	  
	   sum=sum +array[i];
	   }
   
	   System.out.println("dizinin toplamı:" +sum +"eder" );

}
	}
