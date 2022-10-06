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
public class Ex13 {
    
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        double num[] = new double[5];
        double soma;
        double n = 0;

        for (int i = 0; i < num.length; i++) {

            System.out.println("Digite o " + (i + 1) + "º numero");
            num[i] = e.nextDouble();
            soma = num[0] + num[1] + num[2];
            n = (soma / num[3]) * num[4]; 
        }
        
        System.out.println("O Resultado foi: " + n);
    
    }
}
   