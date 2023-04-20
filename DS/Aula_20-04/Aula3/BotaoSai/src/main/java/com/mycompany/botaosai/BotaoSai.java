/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.botaosai;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author alexe
 */
public class BotaoSai extends JFrame {
     JButton botaosair;
     JLabel valo;
    
    public BotaoSai(){
        //Começo
       super("BotãoFuncional");
       Container tela = getContentPane();
       setSize(600,450);
       setResizable(false);
       setLayout(null);
       
       //Imagem e Icones
         ImageIcon icone = new ImageIcon ("imagens/icone.png");
         setIconImage(icone.getImage());
         
          ImageIcon imagenzinha = new ImageIcon("imagens/Valo.jpg");
            Image imagenzinha2 = imagenzinha.getImage().getScaledInstance(400, 200, Image.SCALE_SMOOTH); //Reescalonou e colocando num objeto
            
            ImageIcon valorant = new ImageIcon(imagenzinha2); //Transformou o objeto em uma imagem comum.
       
       
       
       
       //Elementos
         botaosair = new JButton("Sair");
         botaosair.setBounds(250,280,80,20);
         valo = new JLabel(valorant);
         valo.setBounds(100,50,400,200);
         
         botaosair.addActionListener(
            new ActionListener(){
                     public void actionPerformed(ActionEvent e){
                         System.exit(0);
                     }        
            }               
         );
         
       
       tela.add(botaosair);
       tela.add(valo);
       
       //Final
       setVisible(true);
       setLocationRelativeTo(null);
    }
    
    
    public static void main(String[] args) {
        BotaoSai app = new BotaoSai();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
