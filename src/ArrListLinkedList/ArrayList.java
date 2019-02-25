package ArrListLinkedList;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    private Object[] val;
    private int size = 0;
    private int index;

    public ArrayList() {
        this.val = new Object[size];
    }

    @Override
    public T get(int i) throws Exception {
        indexChecker(i);
        return (T) this.val[i];
    }

    @Override
    public void add(T t) {
        System.out.println("index: " + this.index + ", size: "
                + this.size + ", data size: " + this.val.length);
        if (this.index == this.size - 1) {
            increaseArraySize();
        }
        val[this.index] = t;
        this.index++;
    }

    @Override
    public void remove(int i) throws Exception {
        indexChecker(i);
        System.out.println("Object removed: " + this.val[i]);
        for (int j = 0; j < this.val.length - 1; j++) {
            val[j] = val[j + 1];
        }
        this.index--;
    }

    @Override
    public int size() {
        return this.size;
    }

    private void increaseArraySize() {
//        size = this.size;
        Object updateVal[] = new Object[this.size];
        for (int i = 0; i < val.length; i++) {
            updateVal[i] = val[i];
        }
        this.val=updateVal;
        System.out.println("index: " + this.index + ", size: "
                + this.size + ", data size: " + this.val.length);
    }

    public void increaseSize(int newSize) {
        val = Arrays.copyOf(val, newSize);
    }

    public void indexChecker(int i) throws Exception {
        if (i > this.index - 1) {
            throw new Exception("ArrayIndexOutOfBound");
        }

        if (i < 0) {
            throw new Exception("wrong index or value");
        }
    }
}