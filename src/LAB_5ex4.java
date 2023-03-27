package src;
import java.util.Random;
import java.util.Scanner;

public class LAB_5ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Random r = new Random();
        
        Scanner nr = new Scanner(System.in);
        
        System.out.println("Introduceti dimensiunea matricei(dimensiunea trebuie sa fie patratica): ");
        
        int n;
        n = nr.nextInt();
        
        int[][] matrice = new int[n][n];
        
//        System.out.println("TEST");

        int i, j;
        
        for(i=0; i<n; i++)
        {
        	for(j=0; j<n; j++)
        	{
        		
        		matrice[i][j]=r.nextInt(20);
//        		System.out.print(matrice[i][j]+ " ");
        		
        	}
//        	System.out.print("\n");
        }
//        System.out.println("TEST");

        int suma = 0;
        int b = 0;
        j = 0;
        
        while(j < n && i < n)
        {
        	j = j +1;
        	i = i + 1;
        	suma += matrice[i][j];
        	b += j;
        	System.out.println(b);
        }
        
        System.out.println(b);
        
	

	   
    }
  }