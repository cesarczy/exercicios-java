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
public class Ex62 {
    
     public static void main(String[] args) {
    
    String frase;
    
    frase = JOptionPane.showInputDialog("Digite uma frase");
    
    JOptionPane.showMessageDialog(null, String.format("<html><center>A frase centralizada<br>%s</center></html>", frase));

     }
    
}
