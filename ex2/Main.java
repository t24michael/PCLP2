package ex2;

public class Main {
    public static void main(String[] args) {
        
        SortedArray sortedArray = new SortedArray();
        sortedArray.addElement(3);
        sortedArray.addElement(1);
        sortedArray.addElement(2);
        System.out.println(sortedArray); 

        
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());        
        System.out.println(stack.pop());        
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
    }
