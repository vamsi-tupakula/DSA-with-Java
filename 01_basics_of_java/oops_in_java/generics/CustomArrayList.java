package oops_in_java.generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index,int value) {
        data[index] = value;
    }

    private void resize() {
        int[] temp = new int[data.length*2];
        for(int i=0;i<data.length;i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    

    @Override
    public String toString() {
        return "CustomArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for(int i=1;i<11;i++) {
            list.add(i);
        }
        System.out.println(list);
        list.add(11);
        System.out.println(list);
    }
}
