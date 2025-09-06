package org.example;

public class Main {
    public static void main(String[] args) {
        Vetores v = new Vetores(2);

            v.adiciona("Elemento");
            v.adiciona("Elemento2");
            v.adiciona("Elemento3");

        System.out.println(v.tamanho());
        System.out.println(v);

        System.out.println(v.busca(0));
    }
}