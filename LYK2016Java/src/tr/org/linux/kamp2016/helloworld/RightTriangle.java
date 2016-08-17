package tr.org.linux.kamp2016.helloworld;

public class RightTriangle {
         
	private int A=1;
	private  int B=1;
	

	
	public int getA() {
		return A;
	}



	public void setA(int a) {
		A = a;
	}



	public int getB() {
		return B;
	}



	public void setB(int b) {
		B = b;
	}



	public RightTriangle(int A,int B){
		if(0<A)
		this.A=A;
		  if(0<B);
		this.B=B;
	}
	
	public int Hypotenus(){
	int  hipo= (int)Math.pow(A,2)+(int)Math.pow(B,2);
	 return (int)Math.sqrt(hipo);
	
	}

	public int perimeter(){
		return A+B+Hypotenus();
		
	}
		
	public int area(){
		return (A*B)/2;
	}
	
	
	

}