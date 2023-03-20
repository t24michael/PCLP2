package temapentru13;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner nr = new Scanner(System.in);
		
		System.out.println("Va rog introduceti un intreg :");
		
		int numar = nr.nextInt();
		int cif;
		
		do {
			
			cif = numar % 10;
			numar = numar / 10;
			System.out.println(cif);
			
			
			
		}while (numar != 0);
	}
}
