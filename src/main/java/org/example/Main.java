package org.example;

public class Main {
    public static void main(String[] args) {
       Vetores v = new Vetores(3);
       v.adiciona("B");
       v.adiciona("G");
       v.adiciona("D");
       v.adiciona("E");
       v.adiciona("F");
        System.out.println(v);
        v.remove(2);
        System.out.println(v);
        int pos = v.busca("B");
        if(pos > -1) {
            v.remove(pos);
        }else{
            System.out.println("Elemento nao encontrado");
        }
        System.out.println(v);
    }
}