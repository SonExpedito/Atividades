/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Principal extends JFrame{
    JLabel rotulo1,rotulo2,rotulo3,texto;
    JCheckBox negrito,italico,normal,negritoitalico;
    JRadioButton tam1,tam2,tam3,tam4;
    ButtonGroup grupo;
    String cor[] = {"Sem Cor", "Vermelho", "Azul", "Verde"," Amarelo"," Branco"," Preto"};
    JComboBox lista;
    Integer estilo, tamfonte;
    
    public Principal(){
    //Começo   
      super("APP com Check,Combo e Radio");
      setSize(600,450);
      setResizable(false);
      setLayout(null);
      Container  tela =  getContentPane();
    
    //Icone
      ImageIcon icone = new ImageIcon ("Imagem/bluelock.jpg");
      setIconImage(icone.getImage());
      
     //Configurando
        rotulo1 = new JLabel("Cor"); 
        rotulo2 = new JLabel("Estilo");
        rotulo3 = new JLabel("Tamanho"); 
        texto = new JLabel("Programa feito em Java"); 
      
        lista = new JComboBox(cor);
        lista.setMaximumRowCount(7);
        
     //CheckBox    
       //Opções de Letras 
        negrito = new JCheckBox("Negrito");
        italico = new JCheckBox("Itálico");
        normal = new JCheckBox("Normal");
        negritoitalico = new JCheckBox("Negrito Itálico");
    
        
     //Radio Button   
        //Tamanho das Letras
         tam1 = new JRadioButton("12");
         tam2 = new JRadioButton("14");
         tam3 = new JRadioButton("16");
         tam4 = new JRadioButton("18");
         
         //Colocando em Grupo
         grupo = new ButtonGroup();
         grupo.add(tam1);
         grupo.add(tam2);
         grupo.add(tam3);
         grupo.add(tam4);
      
      //Posicionando
        rotulo1.setBounds(40,20,70,20); 
        rotulo2.setBounds(200,20,70,20);
        rotulo3.setBounds(300,20,70,20); 
        
        texto.setBounds(100,200,300,20);
        lista.setBounds(40,50,150,20); 
        
        negrito.setBounds(200,50,100,20);
        italico.setBounds(200,70,100,20); 
        normal.setBounds(200,90,100,20);
        negritoitalico.setBounds(200,110,150,20);
        
        tam1.setBounds(350,50,100,20);
        tam2.setBounds(350,70,100,20);
        tam3.setBounds(350,90,100,20);
        tam4.setBounds(350,110,100,20);

        tamfonte=12; estilo=Font.PLAIN;
      
      
      //Colocando Eventos
       //Cores
       lista.addActionListener( new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
            if (lista.getSelectedItem().toString() == "Sem Cor")
                texto.setForeground(Color.black);
            if (lista.getSelectedItem().toString() == "Vermelho")
                    texto.setForeground(Color.red);
            if (lista.getSelectedItem().toString() == "Azul")
                    texto.setForeground(Color.blue);
            if (lista.getSelectedItem().toString() == "Verde")
                    texto.setForeground(Color.green);
            if (lista.getSelectedItem().toString() == "Amarelo")
                    texto.setForeground(Color.yellow);
            if (lista.getSelectedItem().toString() == "Branco")
                    texto.setForeground(Color.white);
            if (lista.getSelectedItem().toString() == "Preto")
                    texto.setForeground(Color.black);
            }
       });
       
       //Tamanhos
       tam1.addActionListener((ActionEvent e) -> {
           tamfonte=12;
           texto.setFont(new Font("",estilo,tamfonte));
         });
        tam2.addActionListener((ActionEvent e) -> {
            tamfonte=14;
            texto.setFont(new Font("",estilo,tamfonte));
         });
        tam3.addActionListener((ActionEvent e) -> {
            tamfonte=16;
            texto.setFont(new Font("",estilo,tamfonte));
          });
        tam4.addActionListener((ActionEvent e) -> {
            tamfonte=18;
            texto.setFont(new Font("",estilo,tamfonte));
          });

         //Fontes
            //Coloca a fonte em negrito
                negrito.addActionListener((ActionEvent e) -> {
                             estilo=Font.BOLD;
                             normal.setSelected(false);
                             italico.setSelected(false);
                             negritoitalico.setSelected(false);
                            texto.setFont(new Font("",estilo,tamfonte));
                 });
             
            // Coloca a fonte em itálico
                  italico.addActionListener((ActionEvent e) -> {
                              estilo=Font.ITALIC;
                              normal.setSelected(false);
                              negrito.setSelected(false);
                              negritoitalico.setSelected(false);
                              texto.setFont(new Font("",estilo,tamfonte));
                            });
   
                  
             //Coloca a fonte normal
                   normal.addActionListener((ActionEvent e) -> {
                                estilo=Font.PLAIN;
                                negrito.setSelected(false);
                                italico.setSelected(false);
                                negritoitalico.setSelected(false);
                                texto.setFont(new Font("",estilo,tamfonte));
                            });
             //Coloca a fonte em negrito e itálico
                   negritoitalico.addActionListener((ActionEvent e) -> {
                                  estilo=Font.BOLD+Font.ITALIC;
                                  negrito.setSelected(false);
                                  italico.setSelected(false);
                                  normal.setSelected(false);
                                  texto.setFont(new Font("",estilo,tamfonte));
                         });
      
                   
                   
                   
      //Adicionando             
         tela.add(rotulo1); 
         tela.add(rotulo2); 
         tela.add(rotulo3);
         tela.add(texto);
         tela.add(negrito);
         tela.add(italico);
         tela.add(normal); 
         tela.add(negritoitalico);
         tela.add(tam1);
         tela.add(tam2);
         tela.add(tam3);
         tela.add(tam4);
         tela.add(lista);          
      
      //Final
      setLocationRelativeTo(null);
      setVisible(true);
      
    
    }
    
    
    public static void main (String [] args){
          Principal app = new Principal();    
          app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
