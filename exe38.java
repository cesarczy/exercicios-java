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
public class Ex42 {
    
        public static void main(String[] args) {
        double alt, peso;
        String sexo;

        Scanner e1 = new Scanner(System.in);
        System.out.println("Qual o teu sexo?\n" + "M: para Masculino \n" + "F: para Feminino \n" + "Resposta: ");
        sexo = e1.nextLine();

        Scanner e2 = new Scanner(System.in);
        System.out.println("Qual tua altura?");
        alt = e2.nextDouble();

        if (sexo.equalsIgnoreCase("M")) {
            peso = (72.7 * alt) - 58;
            System.out.println("Seu peso Ideal é: " + peso);

        } else if (sexo.equalsIgnoreCase("F")) {
            peso = (62.1 * alt) - 44.7;
            System.out.println("Seu peso Ideal é: " + peso);
        } else {
            System.out.println("Opção inválida");
        }
    }
}
