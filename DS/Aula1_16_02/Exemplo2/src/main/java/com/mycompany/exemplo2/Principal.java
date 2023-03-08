/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo2;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Principal {
    
    public static void main(String args []){
      int t;
      String p;
      digite();
      p = JOptionPane.showInputDialog("Digite uma palavra qualquer: ");
      t = tamanho(p); //Atribuindo o Módulo como Variável
      JOptionPane.showMessageDialog(null,p+ "possui" +t+ "caracteres");
      
    
    }
    
    static void digite(){
       JOptionPane.showMessageDialog(null, "Digite uma palavra");
       
    }
    //*Os Módulos tem duas versões
    /*Void serve para executar funções nele próprio
      enquanto o static "tipo" é utilizado para fazer interações com
     main
    */
    static int tamanho(String x)
    {
       return x.length();
    
    }       
}
