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
public class Ex12 {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        
        double num[] = new double[3];
        double soma = 0;
        double media = 0;

        for (int i = 0; i < num.length; i++) {

            System.out.println("Digite o " + (i + 1) + "º numero");
            num[i]=e.nextDouble();
            soma = soma + num[i];
            media = soma / 3;

        }

        System.out.println("A soma dos numeros foram: " + soma);
        System.out.println("A média dos numeros foi: " + media);

    }

}
