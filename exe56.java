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
public class Ex67 {
    
    public static void main(String[] args) {
        
        int h = 0;
        int cima = 1;
        
        for(int baixo = 1; baixo<50; baixo++) {
            cima = cima + 2;
            h = h+(cima/baixo);            
            JOptionPane.showMessageDialog(null, h);
        }
        
    }
    
}
