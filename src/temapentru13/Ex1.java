package temapentru13;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Ex1 {
	
	public static void main(String[] args) {
		
		Scanner gr = new Scanner(System.in);
		
		System.out.println("Va rog introduceti gradele in Fahreneheit");
		
		float fahrenheit = gr.nextFloat();
		float celsius;
		
		celsius = ((fahrenheit - 32)*5/9);
		
		DecimalFormat zecimale = new DecimalFormat("0.00");
				
		System.out.print("Gradele in Celsius sunt: " + zecimale.format(celsius));
	
	}
}
