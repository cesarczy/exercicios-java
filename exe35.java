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
public class Ex36 {

    public static void main(String[] args) {
        int faixa;
        String condicaoParada;

        do {

            Scanner e1 = new Scanner(System.in);
            System.out.println("Escolha uma faixa");
            faixa = e1.nextInt();

            if (faixa <= 100) {
                System.out.println("Pertence a Faixa 1 ");
            } else if (faixa > 100 && faixa <= 200) {
                System.out.println("Pertence a Faixa 2 ");
            } else if (faixa > 200 && faixa <= 300) {
                System.out.println("Pertence a Faixa 3 ");
            } else if (faixa > 300 && faixa <= 400) {
                System.out.println("Pertence a Faixa 4 ");
            } else if (faixa > 400 && faixa <= 500) {
                System.out.println("Pertence a Faixa 5 ");

            } else if (faixa > 500) {
                System.out.println("Não pertence a nenhuma faixa");
            }

            Scanner e2 = new Scanner(System.in);
            System.out.println("Digite S para continuar ou N para sair:");
            condicaoParada = e2.nextLine();
            System.out.println("------------------------------");

        } while (condicaoParada.equalsIgnoreCase("S"));
    }
}
