package methods;

public class ReturnMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(mul()); // Static method without parameters Return
		
		System.out.println(add(100, 50, "Addition")); // Static Method with Parameters Return
		
		
		ReturnMethods obj= new ReturnMethods(); 	//Non Static method without parameters Return
		
		System.out.println(obj.subtraction());  	//Non Static method without parameters Return
		
		System.out.println(obj.division(30,5));

	}
	
	// Static method without parameters Return
	public static int mul() {
		
		int a=10;
		int b= 20;
		int c=a*b;
		System.out.print("The Product is:");
		return c;
	}
	
// Static Method with Parameters Return
	public static int add(int x, int y, String add) {
	int z= x+y;
	System.out.print(add +" is: ");
	return z;
	}
	
	//Non Static method without parameters Return
	public int subtraction() {
		int a=100;
		int b=50;
		int c=a-b;
		System.out.print("The Subtraction is : ");
		return c;
	}
	
	//Non Static method with parameters Return
	public int division (int x, int y) {
		int z= x/y;
		System.out.print("The Division is : ");
		return z;
	}
	
}
