package src;
import java.util.Random;
import java.util.Scanner;

public class LAB_6ex4 {

	public static void main(String[] args) {
		
		String cuv0 = "example.com";
		String cuv1 = "example.com";
		String cuv2 = "Example.com";
//		char l[] = cuv0.toCharArray();
//		char p[] = cuv1.toCharArray();
//		char o[] = cuv2.toCharArray();
		
		boolean semnal = true;
		boolean semnal1 = true;
		
		int i;
		int k=0;
		
//        for(i=1; i<3; i++) {
//
//			if(cuv0.compareTo(cuv{i}>0) {
//				
//				semnal1 = true;
//				
//			}
//			else {
//				semnal1 = false;
//			}
//			
//			if(o[i] == l[i]) {
//				
//				semnal2 = true;
//			}
//			else {
//				semnal2 = false;
//			}
//			
//		}
		
		if(cuv0.compareTo(cuv1)==0) {
			semnal = true;
		}
		
		if(cuv0.compareTo(cuv2)>0) {
			semnal1 = false;
		}
		
        System.out.print("Comparing example.com and example.com: " + semnal);
        System.out.print("\nComparing Example.com and example.com: " + semnal1);
       
		
    }
  }