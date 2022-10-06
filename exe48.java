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
public class Ex53 {

    public static void main(String[] args) {

        int valor, conta, soma;
        double media = 0;

        conta = 0;
        soma = 0;

        while (true) {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor por linha, 0 para encerrar:\n"));

            if (valor == 0) {
                break;
            }

            conta = conta + 1;
            soma = soma + valor;
            media = soma / (float) conta;
        }

        JOptionPane.showMessageDialog(null, "A quantidade de numeros digitados foram: " + conta);
        JOptionPane.showMessageDialog(null, "A soma dos numeros digitados foram: " + soma);
        JOptionPane.showMessageDialog(null, "A média dos numeros digitados foi: " + media);
    }

}
