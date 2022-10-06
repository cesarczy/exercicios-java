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
public class Ex46 {

    public static void main(String[] args) {
        int n;

        Scanner e1 = new Scanner(System.in);
        System.out.println("Qual a idade do atleta ?");
        n = e1.nextInt();

        if (n >= 5 && n <= 7) {
            System.out.println("Idade: " + n + " anos - Infantil A");
        } else if (n >= 8 && n <= 10) {
            System.out.println("Idade: " + n + " anos - Infantil B");
        } else if (n >= 11 && n <= 13) {
            System.out.println("Idade: " + n + " anos - Juvenil A");
        } else if (n >= 14 && n <= 17) {
            System.out.println("Idade: " + n + " anos - Juvenil B");
        } else if (n >= 18) {
            System.out.println("Idade: " + n + " anos - Sênior");
        } else {
            System.out.println("Não se encaixa em nenhuma categoria");
        }
    }
}
