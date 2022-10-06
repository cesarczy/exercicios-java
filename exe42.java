/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author GHUSALL
 */
public class Ex47 {

    public static void main(String[] args) {

        float fat;
        int num, opt;

        do {

            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para obter o fatorial:\n"));
            if (num == 1 || num == 0) {
                fat = 1;
                JOptionPane.showMessageDialog(null, "O fatorial: " + fat);
            } else if (num <= 30 && num > 1) {
                fat = num;
                while (num > 1) {
                    fat = fat * (num - 1);
                    num = num - 1;
                }
                JOptionPane.showMessageDialog(null, "O fatorial: " + fat);
            }

            opt = Integer.parseInt(JOptionPane.showInputDialog("Tecle 1 para continuar ou 0 para sair:"));

        } while (opt == 1);

    }
}
