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
public class Ex21 {

    public static void main(String[] args) {        

        Scanner e = new Scanner(System.in);
        
        int n1;

        System.out.println("Qual a sua idade ?");
        n1 = e.nextInt();

        if (n1 >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

    }

}
