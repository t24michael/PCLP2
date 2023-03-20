package temapentru13;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex3 {
	
	public static void main(String[] args) {
		
		Scanner nr = new Scanner(System.in);
		
		System.out.println("Va rog introduceti un nuamr:");
		
		float numar = nr.nextFloat();
		
		DecimalFormat zecimale = new DecimalFormat("0.00");
		
		System.out.println("Valoarea la patrat a numarului este:" + zecimale.format(numar*numar));
		System.out.println("Valoarea la cub a numarului este:" + zecimale.format(numar*numar*numar));
		System.out.println("Valoarea la puterea a 4-a a numarului este:" + zecimale.format(numar*numar*numar*numar));
		
		
		
	}
}
