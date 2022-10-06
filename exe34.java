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
public class Ex35 {

    public static void main(String[] args) {

        String[] pessoas = new String[5];
        String nome = "";
        int cor = 0;

        for (int i = 0; i < pessoas.length; i++) {

            System.out.println("------------------------------");

            Scanner e1 = new Scanner(System.in);
            System.out.println("Nome: ");
            nome = e1.nextLine();

            System.out.println("------------------------------");

            Scanner e2 = new Scanner(System.in);
            System.out.println("Qual a cor favorita? \n" + " 1 - Verde \n" + " 2 - Vermelho \n" + " 3 - Amarelo \n" + " 4 - Azul\n" + " 5 - Roxo \n" + "Resposta:");
            cor = e2.nextInt();

            switch (cor) {
                case 1:
                    pessoas[i] = nome + " prefere cor Verde";
                    continue;
                case 2:
                    pessoas[i] = nome + " prefere cor Vermelho";
                    continue;
                case 3:
                    pessoas[i] = nome + " prefere cor Amarelo";
                    continue;
                case 4:
                    pessoas[i] = nome + " prefere cor Azul";
                    continue;
                case 5:
                    pessoas[i] = nome + " prefere cor Roxo";
                    continue;
                default:
                    pessoas[i] = nome + " Opção inválida";
            }

        }

        System.out.println("------------------------------");

        for (int i = 0; i < pessoas.length; i++) {

            System.out.println(pessoas[i]);
        }

    }

}
