/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.botaoocultarexibir;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author alexe
 */
public class BotaoOcultarExibir extends JFrame {
    JLabel rotulo1,rotulo2;
    JButton ocultar,exibir;
    
    public BotaoOcultarExibir(){
        super("Botão Ocultar/Limpar");
          setSize(600,450);
          setResizable(false);
          setLayout(null);
          Container tela = getContentPane();
         
          
          //Icone
            ImageIcon Icone = new ImageIcon("icone.jpg");
            setIconImage(Icone.getImage());
          
            //Elementos
             rotulo1 = new JLabel("GhostWire"); 
             rotulo2 = new JLabel("Tokyo");
             ocultar = new JButton("Ocultar "); exibir = new JButton("Exibir ");
             rotulo1.setBounds(50,20,100,20); 
             rotulo2.setBounds(50,60,100,20);
             ocultar.setBounds(100,100,80,20); 
             exibir.setBounds(250,100,80,20);
             ocultar.addActionListener(
                        new ActionListener(){
                            public void actionPerformed(ActionEvent e){
                                        rotulo1.setVisible(false);
                                        rotulo2.setVisible(false);
                                    }
                            }
                        );
             exibir.addActionListener(
                            new ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                        rotulo1.setVisible(true);
                                        rotulo2.setVisible(true);
                                        }
                                    }
                            );
             
             tela.add(exibir);
             tela.add(ocultar);
             tela.add(rotulo1);
             tela.add(rotulo2);
            
           //Fim
           setLocationRelativeTo(null);
           setVisible(true);
    }
    
    public static void main(String[] args) {
        BotaoOcultarExibir app = new BotaoOcultarExibir();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
