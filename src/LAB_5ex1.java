package src;

import java.util.Arrays;
import java.util.Scanner;

public class LAB_5ex1 {
	
	public static void main(String[]args)
	{
	
	int n;
	Scanner nr = new Scanner(System.in);
	
	System.out.println("Va rog introduceti numarul de elemente pe care sa il aiba lista");
	
	
	n = nr.nextInt();
	
	int [] lista = new int[n];
	
//	System.out.println(lista.length);
	
	
	System.out.println("Introduceti cele " + n + " elemente");
	
	int i;
	
	for(i = 0; i < n; i++)
		
	{
		
	  lista[i] = nr.nextInt();
	  
	}
	
//	System.out.println(lista[2]);
	
	Arrays.toString(lista);
	
	int size = lista.length;
	
	int secondNr = lista [size-2];
	
	System.out.println("Al doilea cel mai mare numar este :" + secondNr);
	
   }
}