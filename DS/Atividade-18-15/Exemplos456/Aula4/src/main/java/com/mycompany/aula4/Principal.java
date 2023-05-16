/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Admin
 */
public class Principal extends JFrame {
    JList Lista;
    String cidades[]={"Barcelona","Paris","Turim","São Paulo","Buenos Aires","Los Angeles",
    "Tokyo"};
    JButton exibir;
    JLabel rotulo,texto;
    JComboBox listazinha2;
    String regiao []={"Centro","Norte","Oeste","Leste","Sul"};
    
    public Principal (){
     //Começo   
      super("Lista e ComboBox");
      setSize(600,450);
      setResizable(false);
      setLayout(null);
      Container  tela =  getContentPane();
    
    //Icone
      ImageIcon icone = new ImageIcon ("Imagem/bluelock.jpg");
      setIconImage(icone.getImage());
       
      
    //Configurando
      Lista = new JList(cidades);
      listazinha2= new JComboBox(regiao);
      texto = new JLabel("Configure sua Região através de sua Cidade ou a Mais Próxima:");
      rotulo= new JLabel("");
      exibir= new JButton("Cadastrar");
      
      Lista.setVisibleRowCount(5);
      listazinha2.setMaximumRowCount(5);
      
      
      JScrollPane painelRolagem = new JScrollPane(Lista);
      Lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      
    //Posição  
  
      texto.setBounds(40,10,500,100);
      painelRolagem.setBounds(40,80,150,100);     
      rotulo.setBounds(40,250,500,30);
      listazinha2.setBounds(40,200,200,30);
      
      exibir.setBounds(250,300,100,30);
      
      
    //Evento  
      exibir.addActionListener(
           new ActionListener(){
                public void actionPerformed(ActionEvent e){
                   rotulo.setText("A Cidade cadastrada foi: " +Lista.getSelectedValue().toString() +" e a Região foi " +listazinha2.getSelectedItem());
                 
                }
           
           }
      );
      
      
      //Adicionando na tela
        tela.add(texto);
      
        tela.add(listazinha2);
        tela.add(painelRolagem);
        tela.add(exibir);
        tela.add(rotulo);
        
      
      //Final
      setLocationRelativeTo(null);
      setVisible(true);
    }
    
    
    
    
    
    public static void main (String [] args){
           Principal app = new Principal();
           app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

}

