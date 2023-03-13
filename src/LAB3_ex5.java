import java.util.Scanner;
public class LAB3_ex5 {

	public static void main(String[] args) {
	
		System.out.println("----ELIGIBILITATEA VOTANTULUI----");
		
		Scanner nr = new Scanner(System.in);
		System.out.println("Va rog sa va introduceti varsta :");
		
		int varsta = nr.nextInt();
		
		int astp;
		
		switch(varsta)
		{
		
		case 18:
			
			System.out.println("Aveti varsta necesara pentru a vota!");
			break;
			
		default: 
			
			if (varsta < 18) 
			{
			astp = 18 - varsta;
			System.out.println("Mai aveti de asteptat "+ astp + " ani pana puteti vota");
			}
			else if (varsta > 100)
			System.out.println("Wow! Un vampir!");
		}
	}
}
