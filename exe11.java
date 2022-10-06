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
public class Ex11 {

    public static void main(String[] args) {

        float num1;
        float num2;
        float soma;
        float media;
        

        Scanner e1 = new Scanner(System.in);

        System.out.println("Digite o 1º numero");
        num1 = e1.nextFloat();

        Scanner e2 = new Scanner(System.in);

        System.out.println("Digite o 2º numero");
        num2 = e2.nextFloat();
        
        soma = (num1 + num2);
        media = (soma / 2);

        System.out.println("Primeiro numero " + num1);
        System.out.println("Segundo numero " + num2);
        
        System.out.println("A soma desses numeros são " + (soma));
        System.out.println("A média é " + (media));

    }

}
