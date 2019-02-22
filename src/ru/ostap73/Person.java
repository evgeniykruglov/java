package ru.ostap73;
import java.util.*;

public class Person {
    private int personHeight = 180;
    private String personName;
    //private static Date birthDate = new Date();
    private Date birthDate;


    @Override
    public int hashCode() {
        long result = 0;
        int date = 0;
        if (this.birthDate != null) {
            final Calendar calendar = Calendar.getInstance();
            calendar.setTime(this.getBirthDate());
            result += calendar.get(Calendar.DATE) * 1000000;
            result += calendar.get(Calendar.MONTH) * 10000;
            result += calendar.get(Calendar.YEAR);
            System.out.println(calendar.get(Calendar.MONTH));
            System.out.println(date);
        }
        return Long.valueOf(result).intValue();
    }

    public void say (String name) {
        System.out.println("Hello " + name);
    }
    public Person () {}

    public Person (int height, String name, Date birthDate) {
        this.personHeight = height;
        this.personName = name;
        this.birthDate = birthDate;
    }
    public String setName (String name) {
        personName = name;
        return name;
    }
    public String getName () {
        return this.personName;
    }

    public Date getBirthDate () {
        return this.birthDate;
    }

}
