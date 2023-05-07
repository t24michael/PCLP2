package ex2;

import java.util.Collections;
import java.util.Vector;

public class Array {
    private Vector vector;

    public Array() {
        vector = new Vector();
    }

    public void addElement(Integer x) {
        vector.add(x);
    }

    public void addElement(Integer x, int poz) {
        if(poz >= 0 && poz <= vector.size()) {
            vector.add(poz, x);
        }
    }

    public int get(int poz) {
        int result;
        if(poz >= 0 && poz < vector.size()) {
            result = (int) vector.get(poz);
            return result;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public int getSize() {
        return vector.size();
    }

    public boolean remove(Integer x) {
        return vector.remove(x);
    }

    public Integer remove(int pos) {
        return (Integer) vector.remove(pos);
    }

    public String toString() {
        String result = "{";
        for(int i = 0; i < vector.size(); i++) {
            result += get(i) + ", ";
        }
        result += "}";
        return result;
    }

    public void sort() {
        Collections.sort(vector);
    }
}
