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
public class Ex09 {
    
        public static void main(String[] args) {

        int num1;
        int num2;

        Scanner e1 = new Scanner(System.in);

        System.out.println("Digite o 1º numero");
        num1 = e1.nextInt();

        Scanner e2 = new Scanner(System.in);

        System.out.println("Digite o 2º numero");
        num2 = e2.nextInt();

        System.out.println("Primeiro numero ao quadrado " + Math.pow(num1, 2));
        System.out.println("Segundo numero ao quadrado " + Math.pow(num2, 2));


    }
    
}
