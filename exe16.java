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
public class Ex16 {
    
            public static void main(String[] args) {

        double r = 0, v = 0;
        double pi = 3.14;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do radio da esfera");
        r = scan.nextDouble(); 
        
        double raioN = Math.pow(r, 3);
              
        v = 4/3*(pi*raioN);

        System.out.println("O volume de uma esfera é: " + v);
    
}
}