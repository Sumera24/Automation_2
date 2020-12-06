package basics;

public class EInstanceVariable {
 int a=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EInstanceVariable obj1=new EInstanceVariable();
		EInstanceVariable obj2=new EInstanceVariable();
		EInstanceVariable obj3=new EInstanceVariable();
		
	
		System.out.println(obj1.a);
	System.out.println(obj2.a);
	System.out.println(obj3.a);
	
	obj2.a=200;
	System.out.println(obj1.a);
	System.out.println(obj2.a);
	System.out.println(obj3.a);
	
	
		
	}

}
