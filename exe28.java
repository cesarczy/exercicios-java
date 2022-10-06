/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author GHUSALL
 */
public class Ex29 {

        public static void main(String[] args) {

        int n1, n2;

        Scanner e1 = new Scanner(System.in);

        System.out.println("Digite o 1º numero");
        n1 = e1.nextInt();

        Scanner e2 = new Scanner(System.in);

        System.out.println("Digite o 2º numero");
        n2 = e2.nextInt();

        if (n1%n2==0) {
            System.out.println("O numero: " + n1 + " é multiplo de " + n2);
        } else {
            System.out.println("O numero: " + n1 + " não é multiplo de " + n2);
        }
    }

}
