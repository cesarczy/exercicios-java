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
public class Ex37 {

    public static void main(String[] args) {
        int n;

        Scanner e1 = new Scanner(System.in);
        System.out.println("Escolha um numero de 1 a 3");
        n = e1.nextInt();

        if (n >= 1 && n <= 3) {
            System.out.println("Você escolheu o numero " + n);
        } else {
            System.out.println("Numero Inválido");
        }

    }

}
