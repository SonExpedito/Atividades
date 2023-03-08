/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo1;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Principal {
    public static void main (String [] args){
        int a;
        digite(); //Chamada de Função
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número: "));
        dobro(a); //No Metódo a ser puxado é colocado o nome da variável para ser passada.
    
    }
    
    static void digite()
    {
           JOptionPane.showMessageDialog(null,"Digite um Número::");
           
    }
    
    static void dobro(int n){ //Parâmetro é a "versão" alternativa da variável.
       int d= n*2;
       JOptionPane.showMessageDialog(null,"Dobro de "+n+" é " +d);
    }
}
