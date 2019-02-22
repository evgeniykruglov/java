package ru.ostap73;

public class Student extends Person {
    int course = 1;
    void tell () {
        System.out.println(this.course);
    }
    public Student (int h, String n, int c) {
        //super (h, n);
        this.course = c;
    }

    public Student () {

    }
}
