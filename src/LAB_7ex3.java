package src;

public class LAB_7ex3 {

	public static void main(String[] args) {
		
		Numar a = new Numar(1);
		Numar b = new Numar(1);
		Numar c = new Numar(1);
		Numar d = new Numar(1);
		int sum = a.suma(a, b, c, d);
		System.out.println(sum);
		

	}

}

class Numar {
	
    private int nr;

    public Numar(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
    
    public int suma(int a) {
    	
    	return a;
    }
    
    public int suma(int a, int b) {
    	
    	return a+b;
    }
    
    public int suma(int a, int b, int c) {
    	
    	return a+b+c;
    }
    
    public int suma(int a, int b, int c, int d) {
    	
    	return a+b+c+d;
    }
  
}