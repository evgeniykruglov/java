package ru.ostap73;

public class Array_1 implements Array {
    int a[] = new int [3];
    int size = 0;

    @Override
    public int get(int i) {
        if ( i < a.length) {
            return a[a.length-i-1];
        } else
            return a[0];
    }
    @Override
    public boolean add(int val) {
        if (size != a.length) {
            a[size] = val;
            size++;
            return true;
        } else
            return false;
    }
}
