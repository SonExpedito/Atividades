/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.botaohabilitardesabilitar;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author alexe
 */
public class BotaoHabilitarDesabilitar extends JFrame{
  JLabel rotulo1,rotulo2;
    JButton habilitar,desabilitar;
    
    public BotaoHabilitarDesabilitar(){
        super("Botão Habilitar/Desabilitar");
          setSize(600,450);
          setResizable(false);
          setLayout(null);
          Container tela = getContentPane();
         
          
          //Icone
            ImageIcon Icone = new ImageIcon("icone.png");
            setIconImage(Icone.getImage());
          
            //Elementos
            rotulo1 = new JLabel("Genji"); 
            rotulo2 = new JLabel("Kiriko");
            desabilitar = new JButton("Desabilitar"); 
            habilitar = new JButton("Habilitar");
            
            rotulo1.setBounds(50,20,100,20); 
            rotulo2.setBounds(50,60,100,20);
            desabilitar.setBounds(80,100,100,20); 
            habilitar.setBounds(250,100,100,20);
            
            desabilitar.addActionListener(
                            new ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                            rotulo1.setEnabled(false);
                                            rotulo2.setEnabled(false);
                                            }
                                        }
                        );
            habilitar.addActionListener(
                            new ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                            rotulo1.setEnabled(true);
                                            rotulo2.setEnabled(true);
                                    }
                               }
                    );

            tela.add(rotulo1);
            tela.add(rotulo2);
            tela.add(desabilitar);
            tela.add(habilitar);
            
           //Fim
           setLocationRelativeTo(null);
           setVisible(true);
    }
    
    public static void main(String[] args) {
         BotaoHabilitarDesabilitar app = new BotaoHabilitarDesabilitar();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
