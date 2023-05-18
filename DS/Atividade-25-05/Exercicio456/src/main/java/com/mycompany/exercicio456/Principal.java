/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio456;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;



public class Principal extends JFrame {
     JTextField nome,idade;
     JButton enviar,limpar,sair;
     JLabel texto,txtNome,txtIdade,txtSexo,txtInteresse,txtEstado,txtCredito;
     
     JRadioButton masculino,feminino;
     ButtonGroup grupo;
     
     JCheckBox Automoveis,Avioes,Barcos;
     
     JComboBox estado;
     String estadoscivis[] =  {"Solteiro","Casado"};
     String resuSex="",ResuInte="Essa é minha opinião e eu to aqui para dividir ela com você.";
     
     
    public Principal (){
          super("Atividade-Formulário");
          setSize(600,500);
          setResizable(false);
          setLayout(null);
          Container tela = getContentPane();
          
          //Icone
          ImageIcon icone = new ImageIcon("imagem/Diggo.png");
          setIconImage(icone.getImage());
          
          //Colocando os Campos e Configurando
          nome = new JTextField(50);
          idade = new JTextField(3);
          
          //Botao
          
          enviar = new JButton("Enviar");
          limpar = new JButton("Limpar");
          sair = new JButton("Sair");
          
          enviar.setToolTipText("Assim que apertar irá confirmar o envio dos Dados");
          UIManager.put("ToolTip.background",SystemColor.info);
          
          limpar.setToolTipText("Assim que apertar irá resetar os Dados");
          UIManager.put("ToolTip.background",SystemColor.info);
          
          
          
          enviar.setMnemonic(KeyEvent.VK_C);
          limpar.setMnemonic(KeyEvent.VK_V);
          
          enviar.requestFocus();
          
          //Labels
          texto = new JLabel ("Por favor cadastre os seus dados:");
          txtNome = new JLabel("Nome:");
          txtIdade = new JLabel("Idade:");
          txtSexo = new JLabel("Sexo:");
          txtInteresse= new JLabel("Interesses:");
          txtEstado= new JLabel("Estado Civil:");
          txtCredito = new JLabel("Alex Expedito 'Diggo' 2°DS");
          
          //ComboBox
          estado = new JComboBox(estadoscivis);
          estado.setMaximumRowCount(2);
          
          //Radio
          masculino = new JRadioButton("Masculino");
          feminino = new JRadioButton("Feminino");
          grupo = new ButtonGroup();
          
          grupo.add(masculino);
          grupo.add(feminino);
          
          //CheckBox
          Automoveis = new JCheckBox("Automoveis");
          Avioes = new JCheckBox("Aviões");
          Barcos = new JCheckBox("Barcos");
          
          //Organizando
           texto.setBounds(40,10,200,20);
           
           txtNome.setBounds(40,50,200,20);
           nome.setBounds(100,50,200,20);
           
           txtIdade.setBounds(40,100,200,20);          
           idade.setBounds(100,100,200,20);
          
           txtSexo.setBounds(40,150,200,20);
           masculino.setBounds(100,150,100,20);
           feminino.setBounds(200,150,100,20);
          
           txtInteresse.setBounds(40,200,200,20);
           Automoveis.setBounds(40,230,200,20);
           Avioes.setBounds(40,260,200,20);
           Barcos.setBounds(40,290,200,20);
           
           txtEstado.setBounds(40,340,200,20);
           estado.setBounds(120,341,200,20);
           
           enviar.setBounds(180,390,80,20);
           limpar.setBounds(260,390,80,20);
           sair.setBounds(340,390,80,20);
           
           txtCredito.setBounds(220,440,200,20);
           
           
          //Comandos
            masculino.addActionListener((ActionEvent e) -> {
                            resuSex = "Masculino";
                 });
            
            feminino.addActionListener((ActionEvent e) -> {
                            resuSex = "Feminino";
                 });
          
            
            //Interesses
             Automoveis.addActionListener((ActionEvent e) -> {
                             ResuInte = "Automóveis";
                 });
            
             Avioes.addActionListener((ActionEvent e) -> {
                             ResuInte = "Aviões";
                 });
              
             Barcos.addActionListener((ActionEvent e) -> {
                             ResuInte = "Barcos";
                 });
            
          
          
          
          enviar.addActionListener((ActionEvent e ) -> {
             
                JOptionPane.showMessageDialog(null,"Você Cadastrou os seguintes dados: \n"
                        + "Nome: " +nome.getText() +"\n"
                        + "Idade: " +idade.getText() +"\n"
                        + "Sexo: " +resuSex +"\n"
                        + "Interesses: " + ResuInte+"\n"
                        +"Estado Civil: " +estado.getSelectedItem().toString()
                        
                        ,"Resultado",JOptionPane.INFORMATION_MESSAGE,null);
          
          }
          );
          
          
          
          limpar.addActionListener((ActionEvent e) -> {
                nome.setText("");
                idade.setText("");
            });
          
           sair.addActionListener((ActionEvent e) -> {
                 int opcao;
               Object[] botoes = {"Sim","Não"};
               opcao = JOptionPane.showOptionDialog(null,"Nunca é um Adeus","Já vai tarde?",
                               JOptionPane.YES_NO_OPTION,
                               JOptionPane.QUESTION_MESSAGE,
                               null,botoes,botoes[0]);
                               if (opcao==JOptionPane.YES_OPTION)
                                   System.exit(0);
            });
          
           
           
           //Adicionado
           tela.add(texto);
           tela.add(txtNome);
           tela.add(txtIdade);
           tela.add(txtSexo);
           tela.add(txtInteresse);
           tela.add(txtEstado);
           tela.add(txtCredito);
           
           tela.add(nome);
           tela.add(idade);
           
           tela.add(masculino);
           tela.add(feminino);
           
           tela.add(Automoveis);
           tela.add(Avioes);
           tela.add(Barcos);
           
           
           tela.add(estado);
           
           tela.add(enviar);
           tela.add(limpar);
           tela.add(sair);
           
          //Final
          setLocationRelativeTo(null);
          setVisible(true);
    }
    
    
    public static void main (String [] args){
          Principal app = new Principal();
          app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
