package temapentru13;
import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		Scanner nr = new Scanner(System.in);
		
		System.out.println("Va rog introduceti un numar intreg care sa se afle intre 0 si 1000");
		
		int numar = nr.nextInt();
		int cif, numar_nou = 0;
		int n = 0;

		
		if (0  <= numar && numar <= 1000) {
			
			do {
				
				cif = numar % 10;
				numar_nou = numar_nou + cif;
				numar = numar / 10;
		
			//System.out.println(numar_nou);
			
		    }while (numar != 0);
			
			System.out.println(numar_nou);
		}
			
	}

}

/*for (int i = 0; i<n; i++)
{
	
cif = numar % 10;
numar_nou = numar_nou+cif;
numar = numar / 10;

System.out.println(numar_nou);
}*/