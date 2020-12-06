package basics;

public class JArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Multidimensional Array
		
		int [][] nums= {{2,2,2},{3,3,3},{4,4,4}};

		// Print in Matrix form
		for(int i=0;i<3;i++)  //Rows
		{
			for(int j=0; j<3;j++) // Columns
			{
				System.out.print(nums[i][j] +" \t" );
			}	
			
			System.out.println("\n");
		}
	}

}
