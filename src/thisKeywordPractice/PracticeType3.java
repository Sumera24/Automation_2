package thisKeywordPractice;

public class PracticeType3 {
	
public PracticeType3() {
		System.out.println("Hello PracticeType3");
	}

	public PracticeType3 ( int a, int b) {
		this();                          // To invoke Current Class Constructor
		int m= a*b;
		System.out.println(m);
}
	
	

	public static void main(String[] args) {
		 		// TODO Auto-generated method stub
		PracticeType3 obj= new PracticeType3(20,40);
		
				
 
	}
 
		
	}


