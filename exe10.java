/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author GHUSALL
 */
public class Ex10 {

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner e1 = new Scanner(System.in);

        System.out.println("Digite o 1º numero");
        num1 = e1.nextInt();

        Scanner e2 = new Scanner(System.in);

        System.out.println("Digite o 2º numero");
        num2 = e2.nextInt();

        int num1Q = (int) Math.pow(num1, 2);
        int num2Q = (int) Math.pow(num2, 2);

        System.out.println("Primeiro numero ao quadrado " + num1Q);
        System.out.println("Segundo numero ao quadrado " + num2Q);

        System.out.println("A soma dos quadrados é " + (num1Q + num2Q));

    }
}
