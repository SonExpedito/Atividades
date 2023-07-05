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
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JTextField;

/**
 *
 * @author alexe
 */
public class Multiplicacao extends JDialog{
    JButton voltar,limpar;
        JLabel rotulo1, rotulo2, exibir;
        JTextField texto1, texto2;
        JButton multiplicar;

        public Multiplicacao (Frame owner, String title, boolean modal) {
            super(owner, title, modal);
            setResizable(false);
            setLayout(null);

            Container tela1 = getContentPane();
            tela1.setLayout(null); // layout do formulário

            rotulo1 = new JLabel("1º Número: ");
            rotulo2 = new JLabel("2º Número: ");
            texto1 = new JTextField(5);
            texto2 = new JTextField(5);
            exibir = new JLabel("");
            multiplicar = new JButton("Multiplicar");
            limpar = new JButton("Limpar");
            
            
            rotulo1.setBounds(50, 20, 100, 20);
            rotulo2.setBounds(50, 60, 100, 20);
            texto1.setBounds(120, 20, 200, 20);
            texto2.setBounds(120, 60, 200, 20);
            exibir.setBounds(50, 140, 200, 20);
            multiplicar.setBounds(100, 100, 100, 20);
            limpar.setBounds(200,100,80,20);

            multiplicar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int numero1, numero2, mult;
                    mult = 0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    mult = numero1 * numero2;
                    exibir.setVisible(true);
                    exibir.setText("O Resultado é: " + mult);
                }
            });

            
            limpar.addActionListener((ActionEvent e) -> {
                texto1.setText("");
                texto2.setText("");
                exibir.setText("");
            });
            
            
            exibir.setVisible(false);
            tela1.add(rotulo1);
            tela1.add(rotulo2);
            tela1.add(texto1);
            tela1.add(texto2);
            tela1.add(exibir);
            tela1.add(multiplicar);
            tela1.add(limpar);

            voltar = new JButton("Voltar");
            voltar.setBounds(50, 250, 100, 20);
            TBsair tsair = new TBsair();
            voltar.addActionListener(tsair);
            tela1.add(voltar);

            setSize(400, 400);
            setLocationRelativeTo(null);
            setVisible(true);
        }
        
        private class TBsair implements ActionListener {
        public void actionPerformed(ActionEvent evento) {
            setVisible(false);
            dispose();}
            }
}
