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
public class Ex31 {

    public static void main(String[] args) {
        
        int n1, n2, n3, maior, menor;        

        Scanner e1 = new Scanner(System.in);

        System.out.println("Digite o 1º numero");
        n1 = e1.nextInt();

        Scanner e2 = new Scanner(System.in);

        System.out.println("Digite o 2º numero");
        n2 = e2.nextInt();

        Scanner e3 = new Scanner(System.in);

        System.out.println("Digite o 3º numero");
        n3 = e3.nextInt();
        
        maior = n1;
        menor = n1;
        
        if (n2 > maior) {
            maior = n2;
        }
        if (n2 < menor) {
            menor = n2;
        }

        if (n3 > maior) {
            maior = n3;
        }
        if (n3 < menor) {
            menor = n3;
        }
        System.out.println(maior + " é o numero maior \n" + menor + " é o numero menor ");

    }

}
