package constructor;

public class PracConstructor {

	public PracConstructor() {
		System.out.println("I am a Constructor"); // Default Constructor
	}
	
	public PracConstructor(int a, int b) {
		int c= a+b;
		System.out.println(c);
		
	}
	
	public void method() {
		System.out.println("I am a regular method");// Regular method
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	PracConstructor obj1= new PracConstructor();	
		PracConstructor ob2= new PracConstructor(5,6);
		//obj1.method();
		

	}

}
 