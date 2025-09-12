package org.example;

public class Main {
    public static void main(String[] args) {
        Vetores v = new Vetores(10);
        v.adiciona("B");
        v.adiciona("C");
        v.adiciona("E");
        v.adiciona("F");
        v.adiciona("G");
        System.out.println(v.toString());
        v.adiciona(0,"A");
        System.out.println(v.toString());
        v.adiciona(3,"D");
        System.out.println(v.toString());
    }
}