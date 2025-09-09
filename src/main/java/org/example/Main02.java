package org.example;

import java.util.Scanner;

// Exibe o maior e menor valor de um vetor
public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor:");
        int tamanho = sc.nextInt();
        double[] vetor = new double[tamanho];
        double menor = 99999.9;
        double maior = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor na posição " + (i + 1));
            vetor[i] = sc.nextDouble();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println(menor);
        System.out.println(maior);
    }
}
