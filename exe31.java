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
public class Ex32 {

    public static void main(String[] args) {

        int n1, n2, n3, media;

        Scanner e1 = new Scanner(System.in);

        System.out.println("Digite o 1º numero");
        n1 = e1.nextInt();

        Scanner e2 = new Scanner(System.in);

        System.out.println("Digite o 2º numero");
        n2 = e2.nextInt();

        Scanner e3 = new Scanner(System.in);

        System.out.println("Digite o 3º numero");
        n3 = e3.nextInt();

        media = (n1 + n2 + n3) / 3;

        if (n1 < 0 || n2 < 0 || n3 < 0) {
            System.out.println("A média não pode ser calculada ");
        } else {
            System.out.println("Sua média é: " + media);
        }
    }
}
