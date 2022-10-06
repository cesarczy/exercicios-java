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
public class Ex64 {

    public static void main(String args[]) {

        double salario;
        double Salreajuste;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário ?"));

        if (salario < 500) {
            Salreajuste = salario+(salario * 0.15);
            JOptionPane.showMessageDialog(null, "Você receberá um aumento de 15% no salário, o total do seu" + 
                    "salário será R$" + Salreajuste);
        } else if (salario >= 500 && salario <= 1000) {
            Salreajuste = salario+(salario * 0.10);
            JOptionPane.showMessageDialog(null, "Você receberá um aumento de 10% no salário, o total do seu" + 
                    "salário será R$" + Salreajuste);
        } else if (salario > 1000) {
            Salreajuste = salario+(salario * 0.05);
            JOptionPane.showMessageDialog(null, "Você receberá um aumento de 5% no salário, o total do seu" + 
                    "salário será R$" + Salreajuste);

        }
    }
}
