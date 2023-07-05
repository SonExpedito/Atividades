/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menumodalexerci;

import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alexe
 */
public class Sobre extends JDialog {
    
    JLabel nome, data, turma;
    JButton voltar;
    
    public Sobre(Frame owner, String title, boolean modal){
        super(owner, title, modal);
            setResizable(false);
            setLayout(null);

            Container tela1 = getContentPane();
            tela1.setLayout(null); // layout do formulário

            nome = new JLabel("Nome: Alex Expedito");
            data = new JLabel("Realizado no dia 26/06/2023");
            turma = new JLabel("Tumar 2°DS-AMS");
            
            nome.setBounds(50, 20, 300, 20);
            data.setBounds(50, 70, 300, 20);
            turma.setBounds(50, 130, 100, 20);
            
            
            voltar = new JButton("Voltar");
            voltar.setBounds(50, 250, 100, 20);
           voltar.addActionListener((ActionEvent e) -> {
               
               setVisible(false);
               dispose();
               
            });
          
            
            tela1.add(voltar);
             tela1.add(data);
              tela1.add(nome);
               tela1.add(turma);
            
            setSize(400, 400);
            setLocationRelativeTo(null);
            setVisible(true);
            
             
    
    }

    

   
     
        
}
