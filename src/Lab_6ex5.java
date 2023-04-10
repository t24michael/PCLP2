package src;
import java.util.Scanner;

public class Lab_6ex5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduceti o propozitie:");
		String propozitie = sc.nextLine();
		
		System.out.print("Introduceti cuvantul pe care doriti sa il inlocuiti:");
		String cuvant = sc.nextLine();
//		String cuvant_conv = cuvant.toLowerCase();
		
		System.out.print("Introduceti cuvantul cu care doriti sa il inlocuiti:");
		String cuvant_nou = sc.nextLine();
		
		String prop_noua = propozitie.replace(cuvant, cuvant_nou);
		
		System.out.print("Propozitia cu cuvantul inlocuit este:" + prop_noua);
	
	}

}
