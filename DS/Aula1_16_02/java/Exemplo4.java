/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplo4;
import javax.swing.JOptionPane;

/**
 *
 * @author alexe
 */
public class Exemplo4 {

    public static void main(String[] args) {
         int num;
         num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um Número"));
         //Transformando o que é Recebido em String para Inteiro
          if (RestoPorDois(num) == 0)
              JOptionPane.showMessageDialog(null, "O Número é Par \n");
          else
              JOptionPane.showMessageDialog(null, "O Número é Ímpar \n");
    }
    
    static int RestoPorDois(int a){
        //Módulo com Retorno
          return a%2;   
    }
}
