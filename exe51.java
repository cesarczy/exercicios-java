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
public class Ex60 {

    public static void main(String[] args) {

        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para fazer a tabuada"));
        JOptionPane.showMessageDialog(null, " A tabuada do numero: " + num);
        for (int i = 1; i <= 10; i++) {

            JOptionPane.showMessageDialog(null, num + "x" + i + " = " + (num * i));
        }
    }
}
