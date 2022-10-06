/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author GHUSALL
 */
public class Ex58 {
    
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º numero")));
        list.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º numero")));
        list.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º numero")));
        Collections.reverse(list);
        JOptionPane.showMessageDialog(null, " Ordem inversa dos numeros digitados: " + list);
    }

}
