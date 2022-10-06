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
public class Ex34 {

    public static void main(String[] args) {
        int caso;
        Scanner e1 = new Scanner(System.in);

        System.out.println(" 1 - Futebol \n" + " 2 - Volei \n" + " 3 - Basquete \n" + " 4 - Natação \n" + " 0 - Nehuma das alternativas \n" + "Qual teu esporte favorito?");
        caso = e1.nextInt();

        switch (caso) {

            case 1:
                System.out.println("Futebol");
                break;
            case 2:
                System.out.println("Volei");
                break;
            case 3:
                System.out.println("Basquete");
                break;
            case 4:
                System.out.println("Natação");
                break;

            case 0:
                System.out.println("Nenhuma das alternativas");
                break;
            default:
                System.out.println("Nenhuma das alternativas");
        }

    }
}
