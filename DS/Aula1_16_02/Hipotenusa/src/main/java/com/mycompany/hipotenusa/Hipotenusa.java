/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hipotenusa;
import javax.swing.JOptionPane;
/**
 *
 * @author alexe
 */
public class Hipotenusa {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem Vindo a Calculadora de Hipotenusa");
        int base, altura, hipot; //Variáveis
        base = Integer.parseInt(JOptionPane.showInputDialog("Por favor Insira a Base"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Por favor Insira a Altura"));
        hipot = hipotenusa(base, altura);
        JOptionPane.showMessageDialog(null, "A Hipotenusa tem o valor de " +hipot);
    }
    
    static int hipotenusa(int basi, int altu){
                  basi=basi*basi;
                  altu= altu*altu;
                  return (int) Math.sqrt((basi+altu));
        }
}
