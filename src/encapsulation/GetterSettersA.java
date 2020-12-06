package encapsulation;

public class GetterSettersA {
	private int a=700;
	private int b=500;

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub

		GetterSettersA obj= new GetterSettersA();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
	
	

}
