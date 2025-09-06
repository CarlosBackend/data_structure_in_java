package org.example;

import java.util.Scanner;
public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int tamanho = sc.nextInt();
        int[] array = new int[tamanho];
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite um numero: ");
            array[i] = sc.nextInt();
            if (array[i] < 0) {
                return;
            }
            if (array[i] >= 5) {
                soma += array[i];
            }
        }
        System.out.println(soma);
    }
}
