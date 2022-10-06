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
public class Ex65 {
    
    public static void main(String args[]) {

        double salarioB;
        double salarioL;

        salarioB = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário ?"));

        if (salarioB <= 135) {            
            JOptionPane.showMessageDialog(null, "Seu salário é de: " + salarioB + " você esta isento de impostos");
        } else if (salarioB > 135 && salarioB <= 750) {
            salarioL = salarioB-(salarioB * 0.10);
            JOptionPane.showMessageDialog(null, "Com o desconto de impostos no valor de R$" + (salarioB * 0.10) + " seu salário será R$" + salarioL);
        } else if (salarioB > 750) {
            salarioL = salarioB-(salarioB * 0.25);
            JOptionPane.showMessageDialog(null, "Com o desconto de impostos no valor de R$" + (salarioB * 0.25) + " seu salário será R$" + salarioL);

        }
    }
}
