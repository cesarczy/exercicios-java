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
public class Ex17 {

    public static void main(String[] args) {

        float alt;
        float base;
        float area = 0;

        Scanner a = new Scanner(System.in);

        System.out.println("Digite a altura do triângulo");

        alt = a.nextInt();

        Scanner b = new Scanner(System.in);

        System.out.println("Digite a base do triângulo");

        base = b.nextInt();        
        
        area = (base*alt)/2;

        System.out.println("A area do triangulo é: " + area);

    }
}
