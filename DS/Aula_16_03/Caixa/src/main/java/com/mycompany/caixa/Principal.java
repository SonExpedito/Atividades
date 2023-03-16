/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caixa;
import javax.swing.*; //Importação da API Swing
/**
 *
 * @author dti
 */
public class Principal {
    
     public static void main (String [] args){
           
            Caixa cx1 = new Caixa(); //Instanciação do objeto CX1
            int op; //Declaração da variável de opções
            
            do{  //Início do looping do-while
                 // Apresentação e leitura do menu de opções
                 op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n 1-Entrada"
                 +"\n 2-Retirada"
                 +"\n 3-Consultar Saldo"
                 +"\n 0-Sair"));
                 
                 switch (op) { //Abertura da Estrutura de Switch-Case
                     case 1:
                         cx1.entrar(); //Chamada ao Método entrar do objeto cx1
                         break;
                         
                     case 2:
                         cx1.retirar(); //Chamada ao método retirar do objeto cx1
                         break;
                 
                     case 3:
                         //Apresentação do conteúdo do artibuto saldo
                         JOptionPane.showMessageDialog(null, "Saldo Atual: " + cx1.getSaldo());
                         break;
                         
                     case 0:
                         JOptionPane.showMessageDialog(null, "Finalizando Programa!");
                         System.exit(0);
                         break;
                         
                     default:
                         JOptionPane.showMessageDialog(null, "Opção Invalida!");
                 }
                 
 
            }while(op != 0); //Repetirá as operações enquanto a opção for diferente de zero
            
     } 
    
}
