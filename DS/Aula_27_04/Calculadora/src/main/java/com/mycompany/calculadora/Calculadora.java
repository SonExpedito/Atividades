/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author alexe
 */
public class Calculadora extends JFrame{
    JButton Somar,Subtrair,Multiplicar,Dividir,Habilitar,Desabilitar,Exibir,Ocultar,Limpar,Sair;
    JLabel valorzin1,valorzin2,nome,resultado;
    JTextField valor1,valor2;        
    
    public Calculadora(){
        //Começo
      super("Calculadora");
      setSize(600,450);
      setResizable(false);
      setLayout(null);
      Container  tela =  getContentPane();
      
      //Icone
      ImageIcon neymar = new ImageIcon ("imagem/neymar.jpg");
      setIconImage(neymar.getImage());
      
      //Declarando e Colocando
      valorzin1 = new JLabel ("1°Valor:");
      valorzin2 = new JLabel ("2°Valor:");
      nome = new JLabel ("Alex-Expedito 2°DS");
      resultado = new JLabel ("");
      resultado.setVisible(false);
      
      valor1 = new JTextField(5);
      valor2 = new JTextField(5);
      
      Somar = new JButton("+");
      Subtrair = new JButton("-");
      Multiplicar = new JButton("X");
      Dividir = new JButton("/");
      
      Habilitar = new JButton("Habilitar");
      Desabilitar = new JButton("Desabilitar");
      
      Exibir = new JButton("Exibir");
      Ocultar = new JButton("Ocultar");
      
      Limpar = new JButton("Limpar");
      Sair = new JButton("Sair");
      
      
      //Colocando
      valorzin1.setBounds(50, 20,100, 20);
      valorzin2.setBounds(50, 60,100, 20);      
      resultado.setBounds(50,100,250,20);
      resultado.setForeground(new Color(125,50,75));
      nome.setBounds(240, 300, 150, 20);
      
      valor1.setBounds(100,20,200,20);
      valor2.setBounds(100,60,200,20);
      
      Somar.setBounds(450,20,100,25);
      Subtrair.setBounds(450,60,100,25);
      Multiplicar.setBounds(450,100,100,25);
      Dividir.setBounds(450,140,100,25);
      
      Habilitar.setBounds(30,200,100,25);
      Desabilitar.setBounds(130,200,100,25);
      
      Exibir.setBounds(230,200,100,25);        
      Ocultar.setBounds(330,200,100,25);
      
      Limpar.setBounds(430,200,100,25);        
      Sair.setBounds(240,350,100,20);
      
      //Função
        Somar.addActionListener((ActionEvent e) -> {
          int num1 = Integer.parseInt(valor1.getText());
          int num2 = Integer.parseInt(valor2.getText());
          int result = num1+num2;
          
          resultado.setVisible(true);
          resultado.setText("O Resultado da Soma é " +result);
      });
        
        Subtrair.addActionListener((ActionEvent e) -> {
          int num1 = Integer.parseInt(valor1.getText());
          int num2 = Integer.parseInt(valor2.getText());
          int result = num1-num2;
          
          resultado.setVisible(true);
          resultado.setText("O Resultado da Subtração é " +result);
      });
        
        
        Multiplicar.addActionListener((ActionEvent e) -> {
          int num1 = Integer.parseInt(valor1.getText());
          int num2 = Integer.parseInt(valor2.getText());
          int result = num1*num2;
          
          resultado.setVisible(true);
          resultado.setText("O Resultado da Multiplicação é " +result);
      });
        
        
         Dividir.addActionListener((ActionEvent e) -> {
          int num1 = Integer.parseInt(valor1.getText());
          int num2 = Integer.parseInt(valor2.getText());
          int result = num1/num2;
          
          resultado.setVisible(true);
          resultado.setText("O Resultado da Divisão é " +result);
      });
        
      //Habilitar e Dsabilitar   
         
       Habilitar.addActionListener((ActionEvent e) -> {
          resultado.setEnabled(true);
      });
       
       Desabilitar.addActionListener((ActionEvent e) -> {
          resultado.setEnabled(false);
      });
      
       //Exibir e Ocultar
       Exibir.addActionListener((ActionEvent e) -> {
          resultado.setVisible(true);
      });
       
       
        Ocultar.addActionListener((ActionEvent e) -> {
          resultado.setVisible(false);
      });
       
      //Sair e Limpar
      Sair.addActionListener((ActionEvent e) -> {
          System.exit(0);
      });
      
      Limpar.addActionListener((ActionEvent e) -> {
          valor1.setText("");
          valor2.setText("");
      });
      
      
      
      
      
      
      
      
      //Final
      tela.add(nome);     
      tela.add(valorzin1);
      tela.add(valorzin2);
      tela.add(resultado);
      
      tela.add(valor1);
      tela.add(valor2);
      
      tela.add(Somar);
      tela.add(Subtrair);
      tela.add(Multiplicar);
      tela.add(Dividir);
      
      tela.add(Exibir);
      tela.add(Ocultar);    
      
      tela.add(Habilitar);
      tela.add(Desabilitar);
      
      tela.add(Limpar);
      tela.add(Sair);
      
      
      
      setLocationRelativeTo(null);
      setVisible(true);
    }
    
    public static void main(String [] args){
        Calculadora app = new Calculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
