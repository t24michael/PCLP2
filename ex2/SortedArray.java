package ex2;

public class SortedArray extends Array {
    @Override
    public void addElement(Integer x) {
        int i = 0;
        while (i < getSize() && get(i) < x) {
            i++;
        }
        super.addElement(x, i);
    }
}
