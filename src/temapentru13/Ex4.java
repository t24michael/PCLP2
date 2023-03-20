package temapentru13;
import java.util.Scanner;
import java.lang.Math;

public class Ex4 {
     public static void main(String[] args) {
		
		Scanner nr = new Scanner(System.in);
		
		System.out.println("Va rog introduceti primul numar");
		int n1 = nr.nextInt();
		
		System.out.println("Va rog introduceti al doilea numar");
		int n2 = nr.nextInt();
		
		int sum, dif, prod, med, dis;
		
		sum = n1 + n2;
		dif = n1 - n2;
		prod = n1 * n2;
		med = sum/2;
		dis = (int)Math.sqrt(dif*dif);
		
		System.out.println("Suma este: " + sum);
		System.out.println("Diferenta este: " + dif);
		System.out.println("Produsul este: " + prod);
		System.out.println("Media este: " + med);
		System.out.println("Distanta este : " + dis);
		System.out.println("Maximul este: " + Math.max(n1, n2));
		System.out.println("Minimul este: " + Math.min(n1, n2));
		
		
		
		
		
     }
     
     

}
