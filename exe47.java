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
public class Ex52 {

    public static void main(String[] args) {

        int qtde = 0;

        qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros deseja para fazer uma soma e média?"));

        double num[] = new double[qtde];
        double soma = 0;
        double media = 0;
        double maior, menor;

        for (int i = 0; i < num.length; i++) {

            num[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º numero"));

            maior = num[0];
            menor = num[0];

            for (num[0] = 0; i < num.length; i++) {
                if (num[i] > maior) {
                    maior = num[i];
         }

                if (num[i] < menor) {
                    menor = num[i];
                }

                soma = soma + num[i];
                media = soma / qtde;

                JOptionPane.showMessageDialog(null, "Sua soma  foi: " + soma);
                JOptionPane.showMessageDialog(null, "Sua média  foi: " + media);
                JOptionPane.showMessageDialog(null, "Smenor: " + menor);
                JOptionPane.showMessageDialog(null, "maior: " + maior);
            }
        }

    }
}
