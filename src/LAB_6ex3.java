package src;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class LAB_6ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti primul cuvant:");
		String cuv1 = sc.nextLine();
		System.out.println("Introduceti al doilea cuvant:");
		String cuv2 = sc.nextLine();
		
		char ordonare1[] = cuv1.toCharArray();
		char ordonare2[] = cuv2.toCharArray();
		Arrays.sort(ordonare1);
		Arrays.sort(ordonare2);
		
		new String(ordonare1);
		new String(ordonare2);
		
		
//		System.out.print(ordonare1);
		
		int i;
		int k=0;
		
		for(i=0; i<ordonare1.length; i++) {
			
			if(ordonare1[i] == ordonare2[i]) {
				continue;
			}
			else {
				k=k+1;
			}
			
		}
		
		if(k>1) {
			System.out.println("Cuvintele nu sunt o anagrama");
		}
		else {
			System.out.println("Cuvintele sunt o anagrama");
		}
		
	}

}
