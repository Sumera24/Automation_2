package thisKeywordPractice;

public class Practice1 {
	
	int a=20;
	String str= "This Keyword";
	
	public void display() {
		int a= 50;
		String str= "Method";
				System.out.println(this.a+" " +this.str); //This Refers to current class instance variable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Practice1 obj= new Practice1();
		obj.display();
	
	}

}
