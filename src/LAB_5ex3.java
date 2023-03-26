package src;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;

public class LAB_5ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner nr = new Scanner(System.in);
		
		System.out.println("Va rog introduceti numarul de elemente pe care sa il aiba lista");
		
		
		n = nr.nextInt();
		
		int [] lista = new int[n];
		
//		System.out.println(lista.length);
		
		
		System.out.println("Introduceti cele " + n + " elemente\n");
		
		int i;
		
		for(i = 0; i < n; i++)
			
		{
			
		  lista[i] = nr.nextInt();
		  
		}
		
//		System.out.println(lista[2]);
		
		ArrayList<Integer> lista_noua = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		
		int j;
		
		for(j=0; j<n; j++)
		{
			if(!set.contains(lista[j]))
				{
				set.add(lista[j]);
				lista_noua.add(lista[j]);
				}
		}
			
		for(j=0; i<lista_noua.size(); i++)
		{
			System.out.print(lista_noua.get(i) + " ");
		}
	
		
		
		
	}

}
