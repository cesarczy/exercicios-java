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
public class Ex25 {

    public static void main(String[] args) {

        int n1, n2, soma1, soma2, sub;

        Scanner e1 = new Scanner(System.in);

        System.out.println("Digite o 1º numero");
        n1 = e1.nextInt();

        Scanner e2 = new Scanner(System.in);

        System.out.println("Digite o 2º numero");
        n2 = e2.nextInt();

        soma1 = n1 + n2;
        soma2 = soma1 + 5;
        sub = soma1 - 7;

        if (n1 + n2 >= 10) {
            System.out.println("O valor somado é maior que 10: " + soma2);
        } else {
            System.out.println("O valor somado é menor que 10: " + sub);
        }
    }

}
