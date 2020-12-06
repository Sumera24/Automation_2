package thisKeywordPractice;

public class Practice2 {
    int a=50;
    
    public void add()
    {
    	int a=10;
		int b= this.a+a; // To invoke Current Class Method
		System.out.println(b);
    }
    
	public void display()
	{
		this.add();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice2 obj=new Practice2();
		obj.display();
		
		
	}

}
