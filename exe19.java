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
public class Ex19 {

    public static void main(String[] args) {

        int n1;
        
        Scanner e = new Scanner(System.in);

        System.out.println("Digite um numero");
        n1 = e.nextInt();  

        if (n1 % 2 == 0) {
            System.out.println("Este numero é Par: " + n1);
        } else {
            System.out.println("Este numero é Impar: " + n1);
        }

    }

}
