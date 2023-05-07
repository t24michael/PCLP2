package src;

class Punct {
	
	private int x;
	private int y;
	
	public Punct(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public double distanta(Punct Punct2) {
		
		int dx = Punct2.x - x;
		int dy = Punct2.y - y;
		return Math.sqrt(dx*dx + dy*dy);
		
	}
	
	public String toString() {
		return x + "," + y;
		
	}
	
}

public class LAB_7ex1 {
	
	public static void main(String[]args){
		
		Punct point1 = new Punct(0, 0);
		Punct point2 = new Punct(3, 4);
		double distance = point1.distanta(point2);
		System.out.println(distance);
		
		System.out.print(point1);
	
   }
}

class Test {
	
	public static void main(String[]args){
		
		Punct punctA = new Punct(1, 2);
		Punct punctB = new Punct(-1, 3);
		double distance = punctA.distanta(punctB);
		System.out.println(distance);
		
	
   }
}