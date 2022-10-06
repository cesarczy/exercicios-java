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
public class Ex33 {

    public static void main(String[] args) {

        double sal, novsal;

        Scanner e1 = new Scanner(System.in);

        System.out.println("Digite o salario do funcionario:");
        sal = e1.nextInt();

        if (sal < 500) {
            novsal = sal + (sal * 0.30);

            System.out.println(" O teu salario com + 30% de aumento será: " + novsal);

        } else {

            System.out.println(" Não tem aumento ");
        }
    }
}
