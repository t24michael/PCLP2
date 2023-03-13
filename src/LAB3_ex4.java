import java.util.Scanner;
public class LAB3_ex4 {

	public static void main(String[] args) {
		
		Scanner nr = new Scanner(System.in);
		
		System.out.println("Va rog introduceti un numar fie intreg, fie cu doua cifre dupa virgula :");
		
		float numar = nr.nextFloat();
		int cif = 0;
		int suma_p = 0;
		int suma_i = 0;
		
		numar = numar * 100;
		
		while(numar != 0)
		{
			cif = (int)numar % 10;
			numar = numar / 10;
			if(cif % 2 == 0)
			{
				suma_p = cif + suma_p;
			}
			else
				suma_i = cif + suma_i;
		}
		
		System.out.println("Suma cifrelor pare este :"+ suma_p);
		System.out.println("Suma cifrelor impare este :"+ suma_i);
	
		
		
		
		
		
	}
	
}
