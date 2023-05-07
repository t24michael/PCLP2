package src;

public class LAB_7ex2 {

	public static void main(String[] args) {
		
		Fractie fr1 = new Fractie(1, 2);
		Fractie fr2 = new Fractie(1, 2);
		float calc = fr1.calcul(fr2);
		System.out.println(calc);
//		System.out.print(fr1);
		System.out.print(fr1.equals(fr2));

	}

}

class Fractie {
	
	private int numitor;
	private int numarator;
	
	public Fractie(int a, int b) {
		
		this.numarator = a;
		this.numitor = b;
	}
	
	public int geta() {
		return numarator;
	}
	
	public void seta(int a) {
		this.numarator = a;
	}
	
	public int getb() {
		return numitor;
	}
	
	public void setb(int b) {
		this.numitor = b;
	}
	
	public float calcul(Fractie Fractie2) {
		
		float rezultat = numarator/numitor + Fractie2.numarator/Fractie2.numitor;
		return rezultat;
		
	}
	
	public String toString() {
		return numarator + "/" + numitor;
	}
	
	public boolean equals(Fractie Fractie2) {
		
		int a = numarator/numitor;
		int b = Fractie2.numarator/Fractie2.numarator;
		String num = "" + a;
		String nrm = "" + b;
		
		if(num.equals(nrm)) {
			return true;
		}
		else {
			return false;
		}
		
	}
		
}

