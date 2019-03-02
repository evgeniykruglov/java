package ru.ostap73;
import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.*;
import java.util.Formatter;

public class Main {

    public static void main(String[] args) {
        Array a = new MyArray();
        System.out.println(a.add(3));
        System.out.println(a.add(3));
        System.out.println(a.add(3));

        Array b = new Array_1();
        System.out.println("--");
        System.out.println(b.add(100));
        System.out.println(b.add(200));
        System.out.println(b.add(300));
        System.out.println(b.get(2));
    }
}