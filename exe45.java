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
public class Ex50 {

    public static void main(String[] args) {

        double num[] = new double[10];
        double soma = 0;
        double media = 0;

        for (int i = 0; i < num.length; i++) {

            num[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º numero"));
            soma = soma + num[i];
            media = soma / 10;
        }
                
        JOptionPane.showMessageDialog(null, "Sua soma  foi: " + soma);
        JOptionPane.showMessageDialog(null, "Sua média  foi: " + media);
    }
}