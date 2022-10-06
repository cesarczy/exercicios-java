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
public class Ex49 {

    public static void main(String[] args) {

        int n1, n2, n3;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º numero"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º numero"));

        if ((n1 > n2) && (n1 > n3)) {

            JOptionPane.showMessageDialog(null, " O Maior numero é: " + n1);

        } else if ((n2 > n1) && (n2 > n3)) {

            JOptionPane.showMessageDialog(null, " O Maior numero é: " + n2);
        } else

            JOptionPane.showMessageDialog(null, " O Maior numero é: " + n3);
        }
    }

