/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author GHUSALL
 */
public class Ex45 {

    public static void main(String[] args) {

        int num[] = new int[32];

        System.out.println("Todos os numero impares de 1 a 31: ");

        for (int i = 1; i < num.length; i++) {

            if (i % 2 != 0) {

                System.out.println(i);

            }
        }
    }
}
