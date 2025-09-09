package org.example;

public class Main {
    public static void main(String[] args) {
        Vetores v = new Vetores(2);

            v.adiciona("Elemento");
            v.adiciona("Elemento2");
            System.out.println(v.busca("Elemento"));
    }
}