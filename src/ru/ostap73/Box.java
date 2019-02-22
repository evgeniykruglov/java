package ru.ostap73;

public class Box {
    int width;
    int height;
    public static String word = "this is static";

    public void showInfo() {
        System.out.println(width + " " + height);
    }
    public static void staticShowInfo() {
        System.out.println (word);
    }
}
