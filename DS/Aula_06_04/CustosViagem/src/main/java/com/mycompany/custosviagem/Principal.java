/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.custosviagem;

import javax.swing.JOptionPane;

/**
 *
 * @author alexe
 */
public class Principal {
    public static int op;
    public static void main (String [] args){
        //Objetos
           Percurso Percuzin = new Percurso();   
           Custos Custoszin = new Custos();
        //Código
          JOptionPane.showMessageDialog(null, "Bem Vindo ao Uber");
          
          
          do{
               op = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das Opções a Seguir: "
                   + "\n 1- Cadastrar Dados da Viagem"
                   + "\n 2- Apresentar Dados da Viagem"
                   + "\n 3- Apresentar Custos total da Viagem"
                   + "\n 4- Sair"));
                switch (op){
                    case 1:
                        Percuzin.cadastrarPercurso();
                        break;
                    case 2:
                        Percuzin.listarViagem();
                        break;
                    case 3:
                        Custoszin.calcularViagem(Percuzin);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Fechando Aplicativo");
                       System.exit(0);
                       break;
            
                    default:
                        JOptionPane.showMessageDialog(null, "´Opção Inválida");
                        break;
                }
                    
          }
          while(op !=0);
    
    
    }
    
}
