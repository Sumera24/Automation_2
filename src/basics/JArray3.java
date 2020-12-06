package basics;

public class JArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	//Find Smallest Number from single dimensional array
		
		int [] arr= {12,34,2,67,38};
		int smallestNum=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			
			if (smallestNum>=arr[i])
			{
				smallestNum=arr[i];
			}
			
		}
		
		System.out.println("Smallest number is : " + smallestNum); */
		
		//Find the smallest number from 3*3 Matrix
		
		
			/* int [][] matrix= {{50,68,39},{250,60,59},{83,45,40}}; // Initialize Matrix
			int smallestNum= matrix[0][0];
			
			for(int i=0;i<matrix.length;i++)
			{
			 for (int j=0;j<matrix.length;j++)	
			 {
				if (smallestNum>matrix[i][j])
				 {
					 smallestNum=matrix[i][j];
				 }
				 
				 System.out.print(matrix[i][j] +"\t");
			 }
			  System.out.println("\n");
			}
					
		
      System.out.println("Smallest Number is :" + smallestNum); */
		
		//Find Maximum Number From the Array
		
		int [][] matrix= {{20,25,60},{65,10,80},{55,80,30}};
		int maxNum=matrix[0][0];
		
		for(int i=0;i<matrix.length;i++) 
		{
			for(int j=0;j<matrix.length;j++) 
			{
				if (maxNum<matrix[i][j]) 
				{
					maxNum=matrix[i][j];
				}
				System.out.print(matrix[i][j] +"\t");
			}
			System.out.println("\n");
		}
				
		System.out.println("The Maximum Number is : " + maxNum);
		
		
	}

}
