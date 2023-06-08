/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastro;

import javax.swing.*;
import javax.swing.JRadioButton;
import java.awt.event.*;
import java.awt.*;
import static java.awt.font.TextAttribute.*;
import java.util.*;

/**
 *
 * @author alexe
 */
public class Cadastro extends JFrame {
        JLabel txtTitulo,txtNome,txtMatricula,txtCurso,txtRestri;
        JTextField inputNome,inputMatricula;
        JButton Cadastrar,Limpar,Sair;
        
        JRadioButton serie1,serie2,serie3,curso1,curso2,curso3;
        ButtonGroup series,cursos;
        
        JComboBox turno;
        String periodos[] = {"Selecione","Diurno","Vespertino","Noturno"};
        
        JTextArea inputRestri;
        JScrollPane rolagemRestri;
        JPanel painelrestri;
    
    
        
        String Nomee,Matriculaa,Turnoo,Cursoo,Seriee,Restriee;
    
    public Cadastro(){
            super("Formulário-Cadastre seus Dados");
            setSize(800,500);
            setResizable(false);
            setLayout(null);
            Container tela = getContentPane();
            
            
            ImageIcon icone = new ImageIcon("imagem/gwen.jpg");
            setIconImage(icone.getImage());
        
            
            txtTitulo = new JLabel("Formulário para o Campeonato");
            txtNome = new JLabel("Nome:");
            txtMatricula = new JLabel("Matrícula:");
            txtRestri= new JLabel("Restrições Médicas:");
            txtCurso= new JLabel("Informe dados do seu Curso:");
            
            
            inputNome = new JTextField(50);
            inputMatricula = new JTextField(5);
            
            Cadastrar = new JButton("Cadastrar");
            Limpar = new JButton("Limpar");
            Sair = new JButton("Sair");
            
            Cadastrar.setMnemonic(KeyEvent.VK_A);
            Limpar.setMnemonic(KeyEvent.VK_S);
            Sair.setMnemonic(KeyEvent.VK_D);
            
            
            Cadastrar.setToolTipText("Assim que apertar irá confirmar o envio dos Dados");
            UIManager.put("ToolTip.background",SystemColor.info);
            
            Limpar.setToolTipText("Assim que apertar irá Limpar os Dados inseridos");
            UIManager.put("ToolTip.background",SystemColor.info);
            
            Sair.setToolTipText("Assim que apertar irá Sair do Cadastro");
            UIManager.put("ToolTip.background",SystemColor.info);
            
            
            serie1 = new JRadioButton("1°Série");
            serie2 = new JRadioButton("2°Série");
            serie3 = new JRadioButton("3°Série");
            
            curso1 = new JRadioButton("Etim");
            curso2 = new JRadioButton("Mtec");
            curso3 = new JRadioButton("Técnico");

            series = new ButtonGroup();
            cursos= new ButtonGroup();
            
            series.add(serie1);
            series.add(serie2);
            series.add(serie3);
            
            cursos.add(curso1);
            cursos.add(curso2);
            cursos.add(curso3);
            
            turno = new JComboBox(periodos);
            turno.setMaximumRowCount(3);
            
            
            inputRestri = new JTextArea(10,20);
            rolagemRestri = new JScrollPane(inputRestri);
            rolagemRestri.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            rolagemRestri.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            painelrestri = new JPanel();
            painelrestri.add(rolagemRestri);
            
            
            
            
            
            
            Cadastrar.addActionListener((ActionEvent e ) -> {
                    Nomee = inputNome.getText();
                    Matriculaa= inputMatricula.getText();
                    Restriee = inputRestri.getText();
                    Seriee = "";
                    Cursoo = "";
                    Turnoo = turno.getSelectedItem().toString();
                    
                    if(curso1.isSelected()){
                        Cursoo = curso1.getText();                  
                    }
                    else{
                        if(curso2.isSelected()){
                            Cursoo = curso2.getText();
                        }
                        else{
                            if(curso3.isSelected()){
                                Cursoo = curso3.getText();
                            }
                            else{
                                Cursoo = "Nada Selecionado";
                            }
                        }
                       
                    }
                    
                    
                    if(serie1.isSelected()){
                        Seriee = serie1.getText();                  
                    }
                    else{
                        if(serie2.isSelected()){
                            Seriee = serie2.getText();
                        }
                        else{
                            if(serie3.isSelected()){
                                Seriee = serie3.getText();
                            }
                            else{
                                Seriee = "Nada Selecionado";
                            }
                        }
                       
                    }
                    
                   Mostrar mostrarzin = new Mostrar(Nomee,Matriculaa,Restriee,Turnoo,Cursoo,Seriee) ;
                   mostrarzin.setVisible(true);
                   dispose();
            });
            
            
            
            
            Limpar.addActionListener((ActionEvent e) -> {
                inputNome.setText("");
                inputMatricula.setText("");
                inputRestri.setText("");
                series.clearSelection();
                cursos.clearSelection();
                turno.setSelectedIndex(0);
            });
            
            Sair.addActionListener((ActionEvent e) -> {
                 int opcao;
               Object[] botoes = {"Sim","Não"};
               opcao = JOptionPane.showOptionDialog(null,"Nunca é um Adeus","Já vai tarde?",
                               JOptionPane.YES_NO_OPTION,
                               JOptionPane.QUESTION_MESSAGE,
                               null,botoes,botoes[0]);
                               if (opcao==JOptionPane.YES_OPTION)
                                   System.exit(0);
            });
            
            
            txtTitulo.setBounds(250,10,500,30);
            txtTitulo.setFont(new Font("Arial",Font.BOLD,20));
            
            txtNome.setBounds(50,50,100,10);
            inputNome.setBounds(100,47,100,20);
            
            txtMatricula.setBounds(50,100,100,10);
            inputMatricula.setBounds(120,97,100,20);
            
            txtCurso.setBounds(50,150,300,10);
            
           
            
            curso1.setBounds(50,180,100,10);
            curso2.setBounds(50,230,100,10);
            curso3.setBounds(50,280,100,10);
            
            serie1.setBounds(130,180,100,10);
            serie2.setBounds(130,230,100,10);
            serie3.setBounds(130,280,100,10);
            
            
            turno.setBounds(100,300,100,20);
            
            txtRestri.setBounds(350,100,200,10);
            
            painelrestri.setBounds(400,120,300,200);
            
            
            Cadastrar.setBounds(250,400,100,20);
            Sair.setBounds(350,400,100,20);
            Limpar.setBounds(450,400,100,20);
            
            tela.add(txtNome);
            tela.add(txtTitulo);
            tela.add(txtMatricula);
            tela.add(txtCurso);
            tela.add(txtRestri);
            
            tela.add(inputNome);
            tela.add(inputMatricula);
            
            tela.add(turno);
            
            tela.add(curso1);
            tela.add(curso2);
            tela.add(curso3);
            
            tela.add(serie1);
            tela.add(serie2);
            tela.add(serie3);
           
            tela.add(painelrestri);
            
            tela.add(Cadastrar);
            tela.add(Limpar);
            tela.add(Sair);
            
           
            
            
            setLocationRelativeTo(null);
            setVisible(true);
        }
    
    
    
    public static void main(String[] args) {
            Cadastro app = new Cadastro();
            app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
