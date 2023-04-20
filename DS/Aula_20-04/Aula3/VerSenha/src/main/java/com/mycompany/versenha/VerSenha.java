/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.versenha;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author alexe
 */
public class VerSenha extends JFrame{
      JPasswordField caixa;
      JLabel rotulo,exibir;
      JButton mostrar;
    
    
     public VerSenha(){
            //Começo
             super("Vendo Senha");
             Container tela = getContentPane();
             setSize(600,450);
             setResizable(false);
             setLayout(null);
             
            
             //Icone
                ImageIcon icone = new ImageIcon("icone.png");
                setIconImage(icone.getImage());
             
                
              //Elementos
                 rotulo = new JLabel ("Senha");
                 exibir = new JLabel ("A Senha Digitada é ");
                 caixa = new JPasswordField(10);
                 mostrar = new JButton ("Mostrar");
                 
                 
                 
                 exibir.setVisible(false);
                 
                 rotulo.setBounds(50,20,100,20);
                 caixa.setBounds(50,60,200,20);
                 exibir.setBounds(50,120,200,20);
                 mostrar.setBounds(150,100,80,20);
             
                 mostrar.addActionListener(
                         new ActionListener(){
                             public void actionPerformed(ActionEvent e){
                                String senha = new String(caixa.getPassword());
                                        exibir.setVisible(true);
                                        exibir.setText(senha);
                                }
                         
                        }
                   );
                      
                 tela.add(rotulo);
                 tela.add(caixa);
                 tela.add(mostrar);
                 tela.add(exibir);
                 
                 
                 
             //Fim
             setVisible(true);
             setLocationRelativeTo(null);
     }
   
     
     public static void main (String[] args){
       VerSenha app = new VerSenha();
       app.setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
}
