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
public class Ex51 {
    
    
    public static void main(String[] args) {
        
        int qtde = 0;
        
        qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros deseja para fazer uma soma e média?"));
        
        double num[] = new double[qtde];
        double soma = 0;
        double media = 0;

        for (int i = 0; i < num.length; i++) {

            num[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º numero"));
            soma = soma + num[i];
            media = soma / qtde;
        }
                
        JOptionPane.showMessageDialog(null, "Sua soma  foi: " + soma);
        JOptionPane.showMessageDialog(null, "Sua média  foi: " + media);
    }
}
