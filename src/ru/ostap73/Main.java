package ru.ostap73;
import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.*;
import java.util.Formatter;

public class Main {

    public static void main(String[] args) {
        //Person mister = new Person(180, "mkister", new Date());
        //System.out.println(mister.hashCode());

        new Computer() {
          void supercomp() {
              this.i7.start();
              this.trnsfer.start();
              System.out.println("memory=");
          }
        }.forEach( o->{ o.supercomp(); o.supercomp(); } );

        Collections.singleton( new Computer(){ void supercomp(){} } )
                .forEach( o->{ o.supercomp(); o.supercomp(); } );
    }
}