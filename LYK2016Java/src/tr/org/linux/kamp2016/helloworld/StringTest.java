package tr.org.linux.kamp2016.helloworld;

public class StringTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s1="eda demirbay";
		char[] charArray = new char[5];
		
		s1.getChars(0, 5, charArray, 0);
		System.out.println(charArray);*/
		String s1= new String ("eda demirbay");
		if(s1.equals("eda demirbay"))
		System.out.println("eşit");
		else
			
			System.out.println("eşit değil");
		
		if(s1.contains("eda"))
			System.out.println("içeriyor");
			else
				System.out.println("içermiyor");
		
		String s2= new String("A");
		String s3= new String("a");
		String s4= new String("b");
		String s5= new String("A");
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s2));
		System.out.println(s2.compareTo(s4));
		System.out.println(s2.compareTo(s5));
		
	}

}
