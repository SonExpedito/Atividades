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
        JLabel rotulo,mk;
        JTextArea texto;
        JScrollPane rolagem;
        JPanel painel;
    
        public TextArea (){
            //Começo
             super("TextArea");
             Container tela = getContentPane();
             setLayout(null);
             setSize(600,450);
             
             //Icone e IMagem
               ImageIcon icone = new ImageIcon ("imagens/icone.jpg");
               setIconImage(icone.getImage());
             
               ImageIcon imagem = new ImageIcon ("Imagens/mk.jpg"); //Buscou a Imagem
               Image imagenzinha = imagem.getImage().getScaledInstance(350, 150, Image.SCALE_SMOOTH); //Reescalonou e colocando num objeto
            
               ImageIcon mortal = new ImageIcon(imagenzinha); //Transformou o objeto em uma imagem comum.
               
             
             
             
             //Elementos
               rotulo = new JLabel ("MortalKombat");
               rotulo.setBounds(50,20,100,20);
               rotulo.setFont(new Font("Arial",Font.BOLD,14));
               
                mk = new JLabel (mortal); 
                mk.setBounds(100,50,350,150);
               //Area
               texto = new JTextArea(10,20);
               
               //Scrol
               rolagem = new JScrollPane(texto); 
               rolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
               rolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
               
               //Painel
               painel = new JPanel();
               painel.setBounds(150,200,250,250);
               painel.add(rolagem);
               
               
             //Adicionando
               tela.add(rotulo);
               tela.add(painel);
               tela.add(mk);
               
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
