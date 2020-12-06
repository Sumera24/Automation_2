package basics;

public class FLocalVariable {
	public int i=200;
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Calling Method");
			      // Creating object
		FLocalVariable obj = new FLocalVariable();
			    	
			      /* We are calling the method, that changes the 
			       * value of myVar. We are displaying myVar again after 
			       * the method call, to demonstrate that the local 
			       * variable scope is limited to the method itself.
			       */
			      obj.myMethod();			     
			      System.out.println(obj.i);
	}
			   
			   public void myMethod(){
			    	// local variable
			    	int i = 500;
			    	System.out.println(i);
			   }
			   
			

	}

	
