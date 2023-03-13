
public class LAB3_ex3 {

	public static void main(String[] args) {
		
		int nr = 1;
		
		for(nr = 2; nr <= 100; nr++) 
			
	  {
			
		   if(nr == 2 || nr == 3 )
		 {
			   
			  System.out.println("Numar prim :" + nr);
			  
		 }
		
		   if(nr % 2 == 0 || nr % 3 == 0)
		 {
			   
			  continue;
			  
		 }
		   else
			   
			  System.out.println("Numar prim :"+ nr);
	  }
	}
}
