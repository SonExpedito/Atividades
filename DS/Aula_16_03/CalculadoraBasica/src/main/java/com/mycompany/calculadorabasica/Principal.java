/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorabasica;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Principal {
    
    public static void main (String [] args){
       Calculadora LittleCalculator = new Calculadora(0,0,0);
    //Contador
       int op;
       
       do{
           op = Integer.parseInt(JOptionPane.showInputDialog("Olá \n"
                   + "1-Soma"
                   + "\n 2-Subtração"
                   + "\n 3-Multiplicação"
                   + "\n 4-Divisão"
                   + "\n 0-Sair"));
           
           switch (op){
               case 1:
                   JOptionPane.showMessageDialog(null, "Você selecionou Soma");
                   LittleCalculator.somar();
                   break;
                   
               case 2:
                   JOptionPane.showMessageDialog(null, "Você selecionou Subtração");
                   double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Minuendo Valor")); //Primeiro Valor
                   double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Subtraendo Valor")); //Segundo Valor
                   LittleCalculator.subtrair(num1,num2);
                   break;
                   
               case 3:
                   JOptionPane.showMessageDialog(null, "Você selecionou Multiplicação");
                   double resul = LittleCalculator.multiplicar();
                   JOptionPane.showMessageDialog(null,"O Produto dessa operação é " +resul);
                   break;
                   
               case 4:
                   JOptionPane.showMessageDialog(null, "Você selecionou Divisão");
                   double div1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Dividendo")); //Primeiro Valor
                   double div2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Divisor ")); //Segundo Valor
                   double div3 = LittleCalculator.dividir(div1, div2);                  
                   JOptionPane.showMessageDialog(null,"O Resto dessa Divisão é " +div3);
                   
                   break;
                   
               case 0:
                   JOptionPane.showMessageDialog(null, "Você selecionou Sair"
                           + "\n tenha um Bom Dia");
                   System.exit(0);
                   break;
                   
               default:
                   JOptionPane.showMessageDialog(null, "O Número digitado não tem uma operação.");
                 
           }

       
       }while(op != 0);
       
    
    }
    
}
