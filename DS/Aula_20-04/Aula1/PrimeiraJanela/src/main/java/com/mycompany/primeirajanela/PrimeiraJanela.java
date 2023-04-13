/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeirajanela;
import javax.swing.*;
/**
 *
 * @author dti
 */

//Ao Colocar extends JFRAME, é erdado as propriedadsa do JFRAME
public class PrimeiraJanela extends JFrame {
       public PrimeiraJanela(){ //Construtor
             super("Nossa Primeira Janela"); //Colocando o Título
             setSize(600,450); //Largura e Altura
             setVisible(true); //Deixa Vísivel os itens acima (sempre o último)
       }
       
       public static void main (String [] args){
             PrimeiraJanela app = new PrimeiraJanela();
             app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
    
}
