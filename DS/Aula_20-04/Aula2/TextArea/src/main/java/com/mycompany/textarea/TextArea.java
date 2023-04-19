/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.textarea;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author alexe
 */
public class TextArea extends JFrame {
        JLabel rotulo;
        JTextArea texto;
        JScrollPane rolagem;
        JPanel painel;
    
        public TextArea (){
            //Começo
             super("TextArea");
             Container tela = getContentPane();
             setLayout(null);
             setSize(600,450);
             
             
             //Elementos
               rotulo = new JLabel ("Comentário");
               rotulo.setBounds(50,20,100,20);
               rotulo.setFont(new Font("Arial",Font.BOLD,14));
             
               //Area
               texto = new JTextArea(10,30);
               
               //Scrol
               rolagem = new JScrollPane (texto); 
               rolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
               
               //Painel
               painel = new JPanel();
               painel.add(rolagem);
               painel.setBounds(40,40,250,250);
               
             //Adicionando
               tela.add(rotulo);
               tela.add(painel);
               
             //Fim
             setResizable(false);
             setLocationRelativeTo(null);
             setVisible(true);
        }
        
        public static void main (String args []){
            TextArea app = new TextArea();
            app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
}
