/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author alexe
 */
//Coloca a Extensão
public class Label_TextField extends JFrame { 
       JLabel imagem,rotulo1,rotulo2,rotulo3,rotulo4; //Criando as Label onde serão inseridos os textos
       JTextField  texto1,texto2,texto3,texto4; //Campo de Texto
       
       public Label_TextField(){ //Construtor
           
           //Configurações Iniciais
            super("Texto e Input");  //Título    
            setSize(600,450); //X and Y Size
            setResizable(false); // Não permite que seja redimensionada
            Container tela = getContentPane(); //Cria a Tela *Container para colocar os elementos
            tela.setBackground(new Color(10,46,60)); //Coloca uma Cor de Fundo
            setLayout(null); //Limpa a Tela
            
            
            //Ícone e imagens
            ImageIcon icone = new ImageIcon("Cellbit.jpg");
            setIconImage(icone.getImage());
            
            ImageIcon cellbit = new ImageIcon("Cellbit2.jpeg");
            
            
            
            //Elementos
              //Texto
              rotulo1 = new JLabel ("Nome");
              rotulo2 = new JLabel ("Idade");
              rotulo3 = new JLabel ("Celular");
              rotulo4 = new JLabel ("Instagram");
              
              
              //Campo de Texto (tamanho da caixa de texto)
              texto1 = new JTextField(50);
              texto2 = new JTextField(3);
              texto3 = new JTextField(10);
              texto4 = new JTextField(10);
              imagem = new JLabel (cellbit);
              
              /*Colocando as Posições 
                Padrão  variavel.setBounds(eixoX,eixoY,Largura,Altura);
                */
              rotulo1.setBounds(50,20,80,20);
              rotulo2.setBounds(50,60,80,20);
              rotulo3.setBounds(50,100,80,20);
              rotulo4.setBounds(50,140,80,20);
              
              texto1.setBounds(110,20,80,20);
              texto2.setBounds(110,60,20,20);
              texto3.setBounds(110,100,80,20);
              texto4.setBounds(130,140,80,20);
              imagem.setBounds(120,200,380,250);
              /* Colocando as Cores
                 Padrão variavel.setForeground( new Color(R,G,B))
                */
              rotulo1.setForeground( new Color(124,123,122));
              rotulo2.setForeground( new Color(124,123,122));
              rotulo3.setForeground( new Color(124,123,122));
              rotulo4.setForeground( new Color(124,123,122));
              
              /* Setando a Fonte
                variavel.setFont(new Font("Arial",Font.BOLD,14));
              */
               rotulo1.setFont(new Font("Arial",Font.BOLD,14));
               rotulo2.setFont(new Font("Arial",Font.BOLD,14));
               rotulo3.setFont(new Font("Arial",Font.BOLD,14));
               rotulo4.setFont(new Font("Arial",Font.BOLD,14));
               
               texto1.setFont(new Font("Arial",Font.BOLD,14));
               texto2.setFont(new Font("Arial",Font.BOLD,14));
               texto3.setFont(new Font("Arial",Font.BOLD,14));
               texto4.setFont(new Font("Arial",Font.BOLD,14));
               
              
               //Colocando na Tela
                 tela.add(rotulo1);
                 tela.add(rotulo2);
                 tela.add(rotulo3);
                 tela.add(rotulo4);
                 
                 tela.add(texto1);
                 tela.add(texto2);
                 tela.add(texto3);
                 tela.add(texto4);
                 tela.add(imagem);
                 texto1.requestFocus();
               
            //Finais
            setVisible(true); //Deixa tudo visível
            setLocationRelativeTo(null); //Centraliza a Tela
       }
       
       public static void main (String[] args){
           Label_TextField app = new Label_TextField ();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
   
}
