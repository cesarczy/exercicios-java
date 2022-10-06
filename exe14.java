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
public class Ex14 {

    public static void main(String[] args) {

        double celsius = 0, fahrenheit = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Forneça a temperatura em Fahrenheit");
        fahrenheit = scan.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("A conversão da temperatura em graus Fahrenheit para Celsius é: " + celsius + " graus Celsuis.");
    }
}
