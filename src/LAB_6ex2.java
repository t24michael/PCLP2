package src;
import java.util.Scanner;

public class LAB_6ex2 {

	public static void main(String[] args) {
		
		Scanner sent = new Scanner(System.in);
		
		System.out.println("Introdu o propozitie:");
		
		String propozitie = sent.nextLine();
		
		String[]cuvinte = propozitie.split(" ");
		
		String largest = cuvinte[0];
		String smallest = cuvinte[0];
		String copy = cuvinte[0];
		
		int i;
		
		for(i=0; i<cuvinte.length; i++) {
			
			if(cuvinte[i].length() < smallest.length()) {
				
				smallest = cuvinte[i];
				
			}
			
//			if(cuvinte[i].length() == cuvinte[j].length()) {
//				j++;
//				copy = cuvinte[i];
//			}
			
			if(cuvinte[i].length() > largest.length()) {
				
				largest = cuvinte[i];
				
			}
		}
		
		System.out.println("Cel mai mic cuvant este :" + smallest + "\n" + "Cel mai mare cuvant este :" + largest + "\n" + "Cuvantul egal in dimensiune este:" + copy);
		
		
	}
}
