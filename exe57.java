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
public class Ex68 {

    public static void main(String[] args) {
        
        int r = 0;
        int cima = 1;
        
        for(int baixo = 3; baixo<=211; baixo+=2) {            
            cima = cima + 2;
            r = r+(cima/baixo);            
            JOptionPane.showMessageDialog(null, r);
        }
        
    }
    
}
