package methods;

public class WithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Profit of Customer	
	//	profitOfCustomer(5000,3000,"April");
		
		WithParameter obj= new WithParameter();
		obj.profitOfCustomer(7000,3000,"August");
		

	}
	// Static And NonStatic Methods with parameters
	/*public static void profitOfCustomer(int income, int expense, String month) {
		 int profit= income-expense;
		 System.out.println("The profit of customer is " +profit +" for the month " +month);
	}
*/
	public void profitOfCustomer(int income, int expense, String month) {
		 int profit= income-expense;
		 System.out.println("The profit of customer is " +profit +" for the month " +month);
		
	}
	
	
	
}
