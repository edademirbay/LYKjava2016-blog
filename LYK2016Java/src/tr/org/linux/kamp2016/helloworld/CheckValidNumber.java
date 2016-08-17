package tr.org.linux.kamp2016.helloworld;

public class CheckValidNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 String[] str=new String[]{"10.20","1234", "12.at"};
	 
	 for (int i = 0; i < str.length; i++) {
		if(str[i].indexOf(".")>0){//array nokta içeriyorsa
			try {
				Double.parseDouble(str[i]);//double sınıfından strnin içeriğini doğrulamayı dene
				System.out.println(str[i]+ "geçerli bir ondalıklı sayıdır");
			} catch (NumberFormatException name) {
				System.out.println("geçerli değil");
				
			}}
		
		
		else{
			try {
				Integer.parseInt(str[i]);
				System.out.println(str[i]+ "geçerli bir tamsayıdır");
			} catch (NumberFormatException nme) {
				System.out.println("geçerli bir sayı değil.");
			}
		}
			
	}

	}}


