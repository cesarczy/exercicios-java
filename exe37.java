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
public class Ex41 {

    public static void main(String[] args) {
        double n1, n2, n3, n4, mf;

        Scanner e1 = new Scanner(System.in);
        System.out.println("Nota do primeiro bimestre:");
        n1 = e1.nextDouble();

        Scanner e2 = new Scanner(System.in);
        System.out.println("Nota do segundo bimestre:");
        n2 = e2.nextDouble();

        Scanner e3 = new Scanner(System.in);
        System.out.println("Nota do terceiro bimestre:");
        n3 = e3.nextDouble();

        Scanner e4 = new Scanner(System.in);
        System.out.println("Nota do quarto bimestre:");
        n4 = e4.nextDouble();

        mf = (n1 + n2 + n3 + n4) / 4;

        if (mf >= 7) {
            System.out.println("Sua média final foi: " + mf + " - Aluno aprovado");
        } else {
            System.out.println("Sua média final foi: " + mf + " - Aluno reprovado");

        }
    }

}
