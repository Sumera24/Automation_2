package accessModifier1;

public class SecondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.out.println("This is Second Class");
		SecondClass obj=new SecondClass();
		obj.addition();
		obj.subtraction();
	}
	
	public void addition() {
		
		int a=10;
		int b=20;
		int sum= a+b;
		System.out.println(sum);
	}
	
	private void subtraction() {
		int m=50;
		int n= 40;
		int dif= m-n;
		System.out.println(dif);
		
	}

}
