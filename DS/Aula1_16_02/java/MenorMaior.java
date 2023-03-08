/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.menormaior;
import javax.swing.JOptionPane;
/**
 *
 * @author alexe
 */
public class MenorMaior {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem Vindo a Calculadora de Diferença");
        float a,b,c=0;
        a = Integer.parseInt(JOptionPane.showInputDialog("Por Favor insira o Primeiro Valor"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Por Favor insira o Segundo Valor"));
        diferenca(a, b, c);
    }
    
    static void diferenca(float x, float y, float z){
       if (x==y){
           JOptionPane.showMessageDialog(null, "Os Dois Números São Iguais");
       }
       else {
           if (x > y){
             z=x-y;
             JOptionPane.showMessageDialog(null, "O Valor " +x +" é o maior, havendo uma diferença de " +z);    
            }
           else{
            z=y-x;
            JOptionPane.showMessageDialog(null, "O Valor " +y +" é o maior, havendo uma diferença de " +z);
           }
       }
    } 
}
