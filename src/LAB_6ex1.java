package src;

import java.util.Arrays;
import java.util.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LAB_6ex1 {
	
	boolean containsWhitespace(String str) {
		
		return str.matches(".*\\s.*");
	}
	
	public static void main(String[]args) {
		
		Scanner pw = new Scanner(System.in);
		System.out.print("Introduceti o parola de minim 8 caractere:\n");
		String parola = pw.nextLine();
		
		System.out.print("Parola este: " + parola);
		
		boolean semnal = true;
		
		Pattern specialChar = Pattern.compile("[%$*@#!()/?");
		Matcher hasSpecialChar = specialChar.matcher(parola);
		
		boolean isspecialchar = hasSpecialChar.find();
		
		if (parola.length()<8) {
			
		   do                //VERIFICARE 
		   {
			System.out.print("\nParola este prea scurta. Introduceti alta parola:\n");
			parola = pw.nextLine();
		   }while (parola.length()<8);
		   
		}
		
		else {
			
			if (Character.isLowerCase(parola.charAt(0))) {
//				semnal = false;
				System.out.print("ok");
			}
			
			for (int i = 0; i < parola.length(); i++)
			{
				if(isspecialchar)
					System.out.println("Parola contine caractere speciale!");
			}
			
		}
		
		System.out.print("Parola este: " + parola);
		
		
		
		
 		
     }
}
