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
public class Ex61 {

    public static void main(String args[]) {

        int cont1, cont2, tab;
        cont1 = 1;
        cont2 = 1;

        while (cont1 <= 10) {

            System.out.println("\n-------------------------");
            System.out.println("Tabuada do numero " + cont1 + ":");
            while (cont2 <= 10) {
                tab = cont1 * cont2;

                System.out.println(cont1 + " x " + cont2 + " = " + tab);

                cont2 = cont2 + 1;
            }
            cont2 = 1;
            cont1 = cont1 + 1;
        }

    }

}
