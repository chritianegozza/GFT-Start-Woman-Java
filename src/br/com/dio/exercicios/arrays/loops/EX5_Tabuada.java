package br.com.dio.exercicios.arrays.loops;

import java.util.Scanner;

/*
*   Tabuada se 5:
* 5 x 1 = 5
* 5 x 2 = 10
* ...
* 5 x 10 = 50
* */
public class EX5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
