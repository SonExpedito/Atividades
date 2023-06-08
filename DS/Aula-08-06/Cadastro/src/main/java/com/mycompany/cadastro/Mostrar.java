/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author alexe
 */
public class Mostrar extends JFrame {
    JLabel txtTitulo,txtNome, txtMatricula,txtRestricao,txtTurno,txtCurso,txtSerie;
    JLabel nomee,matriculaa,restricaoo,turnoo,cursoo,seriee;
    JButton voltar,sair;
    
    public Mostrar(String nome, String matricula, String restricao, String Turno,String Curso, String Serie ){
        super("Dados Cadastrados");
        setSize(800,500);
        setResizable(false);
        setLayout(null);
        Container tela = getContentPane();
        
        ImageIcon icone = new ImageIcon("imagem/miles.png");
            setIconImage(icone.getImage());
        
        
        
        txtTitulo = new JLabel("Os Dados Cadastrados foram:");
        txtNome = new JLabel("Nome:");
        txtMatricula = new JLabel("Matrícula:");
        txtRestricao = new JLabel("Restrição Médica:");
        txtTurno = new JLabel("Turno:");
        txtCurso = new JLabel("Curso:");
        txtSerie = new JLabel("Serie:");
        
        nomee = new JLabel(nome);
        matriculaa = new JLabel(matricula);
        restricaoo = new JLabel(restricao);
        turnoo = new JLabel(Turno);
        cursoo= new JLabel(Curso);
        seriee = new JLabel(Serie);
        
        voltar = new JButton("Voltar");
        sair = new JButton("Sair");
                
        
        
        
        
        
       txtTitulo.setBounds(250,10,500,30);
       txtTitulo.setFont(new Font("Arial",Font.BOLD,20));
            
       txtNome.setBounds(50,50,100,10);
       nomee.setBounds(100,50,100,10);
            
       txtMatricula.setBounds(50,100,100,10);
       matriculaa.setBounds(100,100,100,10);
            
       txtRestricao.setBounds(50,150,200,10);
       restricaoo.setBounds(180,150,100,10);
       
       txtTurno.setBounds(50,200,100,10);
       turnoo.setBounds(100,200,100,10);
       
       
       
       txtCurso.setBounds(50,250,100,10);
       cursoo.setBounds(100,250,100,10);     
        
       txtSerie.setBounds(50,300,100,10);
       seriee.setBounds(100,300,100,10);
        
        
        voltar.setBounds(300,400,100,20);
        sair.setBounds(400,400,100,20);
        
        
        voltar.addActionListener((ActionEvent e) -> {
                 Cadastro app = new Cadastro();
                 app.setVisible(true);
                 dispose();
            });
        
        sair.addActionListener((ActionEvent e) -> {
                 System.exit(0);
            });
        
        
        
        
        
        tela.add(txtTitulo);
        tela.add(txtNome);
        tela.add(txtMatricula);
        tela.add(txtRestricao);
        tela.add(txtTurno);
        tela.add(txtCurso);
        tela.add(txtSerie);
        
        tela.add(nomee);
        tela.add(matriculaa);
        tela.add(restricaoo);
        tela.add(turnoo);
        tela.add(cursoo);
        tela.add(seriee);
        
        tela.add(voltar);
        tela.add(sair);
        
        
        setLocationRelativeTo(null);
            setVisible(true);
        
    }
    
    
   
}
