import java.util.Scanner;
public class LAB3_ex2 {
	
	public static void main(String[] args) {
		
		System.out.println("----CALENDAR----");
		
		Scanner data = new Scanner(System.in);
		
		System.out.print("Te rog introdu o zi calendaristica(1-31) : ");
		int zi = data.nextInt();
		while(zi > 31 || zi < 1)
		{
			
			System.out.println("EROARE!");
			System.out.print("Te rog introdu o zi calendaristica(1-31): ");
			zi = data.nextInt();
		}
		
		System.out.print("Te rog introdu o luna calendaristica(1-12) : ");
		int luna = data.nextInt();
		while(luna > 12 || zi < 1)
		{
			
			System.out.println("EROARE!");
			System.out.print("Te rog introdu o luna calendaristica(1-12) : ");
			luna = data.nextInt();
		}
		
		System.out.print("Te rog introdu un an calendaristic : ");
		int an = data.nextInt();
		while(an < 1)
		{
			System.out.print("EROARE! : ");
			System.out.print("Te rog introdu un an calendaristic : ");
			an = data.nextInt();
		}
			
		
		System.out.println("Data introdusa este : " + zi+"."+luna+"."+an);
		
		if(luna == 1)
		{
			luna = 13;
		}
		
		if(luna == 1)
		{
			luna = 13;
		}
		
		int h;
		h = ((zi + ((13*(luna+1))/5) + an % 100 + (an % 100)/4 + (an/100)/4 - 2*(an/100)) % 7);
		
		String[] zile = {"Sambata", "Duminica", "Luni", "Marti", "Miercuri", "Joi", "Vineri"};
		
		System.out.println(zile[h]);
		
		
		
		
		
		
		
		
	}

}
