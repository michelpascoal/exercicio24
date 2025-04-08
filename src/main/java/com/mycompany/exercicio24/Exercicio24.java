package com.mycompany.exercicio24;

/*
 * Escreva um algoritmo que mostre todos os números pares entre 13 e 23
 * usando do..while.
 */

public class Exercicio24 {

    public static void main(String[] args) {
        int i = 14; // Primeiro número par depois de 13
        do {
            System.out.println(i);
            i = i + 2;
        } while (i <= 22); // Último número par antes de 23
    }
}
