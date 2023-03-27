package src;

public class LAB_5ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {{4, 5, 9, 8}, {5, 7, 8, 9}, {3, 8, 9, 7}};
		
		int[][] b = {{5, 7, 8, 9}, {4, 5, 9, 8}, {3, 8, 9, 5}};
		
		int [][] c = new int[3][4];
		
		int i, j;
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			
			{
				c[i][j] = a[i][j] + b[i][j];
			}	
		}
		
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			
			{
				System.out.print(c[i][j] + " ");
			}	
			
			System.out.println(" ");
		}
		

		
		
		
		
	
		
						
		
		
		

	}

}
