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
public class Ex59 {

    public static void main(String[] args) {

        int n1, n2;
        int soma, sub, mult;
        double div;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));

        soma = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        div = n1 - n2;

        JOptionPane.showMessageDialog(null, " A soma entre os numeros digitados: " + soma);
        JOptionPane.showMessageDialog(null, " A subtração entre os numeros digitados: " + sub);
        JOptionPane.showMessageDialog(null, " A multiplica entre os numeros digitados: " + mult);
        JOptionPane.showMessageDialog(null, " A divisão entre os numeros digitados: " + div);

    }

}
