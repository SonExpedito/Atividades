/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.BorderFactory;

import conexao.Conexao;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

import Content.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.border.Border;


/**
 *
 * @author dti
 */
public class Login extends JFrame {
        Conexao con_cliente;
        Controle controlinho;
        
        JPasswordField tsenha;
        JTextField tusuario;
        JLabel iuser,isenha,imancha,jtitle;
        JButton blogin;
        
         Font titulozinho = null;
          int tentativas = 3;
    
    public Login(){
        con_cliente = new Conexao();
        con_cliente.conecta();
        
        if(con_cliente.conecta() ){
                JOptionPane.showMessageDialog(null, "Conexão Estabelecida", "Aviso", JOptionPane.INFORMATION_MESSAGE); 
        }
        else{
                JOptionPane.showMessageDialog(null, con_cliente.erros,"Erro",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        controlinho = new Controle();
        

        setTitle("Login");
        setSize(700,550);
        setResizable(false);
        setLayout(null);
        Container tela = getContentPane();
         tela.setBackground(new Color(14,14,26));
        
        ImageIcon icone = new ImageIcon("imagens/logo.png");
        setIconImage(icone.getImage());
        
        ImageIcon mancha = new ImageIcon("imagens/milesvsmancha.png");
        Image mlesmancha = mancha.getImage();
                    
        Image scaledImage = mlesmancha.getScaledInstance(250, 180, Image.SCALE_SMOOTH);
        ImageIcon milesvsmancha = new ImageIcon(scaledImage);
        
        ImageIcon user = new ImageIcon("imagens/usuario.png");
        ImageIcon senhas = new ImageIcon("imagens/senha.png");
        
        
        
      
        
        
         try{
                     titulozinho = Font.createFont(Font.BOLD, getClass().getClassLoader().getResourceAsStream("Content/spiderfont.ttf"));
                     }
                        catch(IOException|FontFormatException e){
                                    System.out.println("Merda " + e);
                        }       
                    
        
        
        tusuario = new JTextField(50);
        tsenha = new JPasswordField(20);
        
       iuser = new JLabel(user);
       isenha= new JLabel(senhas);
       jtitle = new JLabel("IDENTIFICAÇÃO");
       imancha = new JLabel(milesvsmancha);
       
       blogin = new JButton("Logar");
       
       
       jtitle.setBounds(260,10,200,20);
       jtitle.setForeground(new Color(255,42,37));
       jtitle.setFont(new Font("titulozinho",Font.BOLD,20));
       
       tusuario.setBounds(240,91,180,20);
       tusuario.setBackground(new Color(213,204,254));
       
       tsenha.setBounds(240,141,180,20);
       tsenha.setBackground(new Color(213,204,254));
       
       
       imancha.setBounds(10,280,250,180);
       
       blogin.setBackground(new Color(213,204,254));
       blogin.setBounds(290,300,80,20);
       
       
       iuser.setBounds(120,91,180,20);
       iuser.setForeground(new Color(213,204,254));
       
       isenha.setBounds(120,141,180,20);
      
      
      
       blogin.addActionListener( new ActionListener(){
                 @Override
                 public void actionPerformed(ActionEvent e){
                        try{
                           
                            String pesquisa = "select * from tblusuario where usuario like '" + tusuario.getText() + "' && senha = " + tsenha.getText() + "";
                            con_cliente.executaSQL(pesquisa);
                            
                            if(con_cliente.resultset.first()){
                                    //Acessa o form do cadastro
                                    JOptionPane.showMessageDialog(null, "Login Efetuado com sucesso \n Seja Bem Vindo: " +tusuario.getText());
                                    controlinho.setVisible(true);
                                    dispose();
                            
                            }
                            else{
                                    tentativas--;
                                    JOptionPane.showMessageDialog(null, "Usuário ou Senha Encorreta \n Você ainda possuí "  +tentativas +" tentativas.");
                                      
               
                            }
                            
                            if(tentativas<=0){
                                    JOptionPane.showMessageDialog(null, "Você já realizou todas tentativas, fechando o programa.");
                                    con_cliente.desconecta();
                                    System.exit(0);
                            }
                        
                        
                        
                        }
                        catch(SQLException errosql ){
                        
                        }
                
                
                }
       
       });
               
       tela.add(jtitle);
       tela.add(imancha);
        tela.add(tusuario);
        tela.add(tsenha);
        tela.add(blogin);
        tela.add(iuser);
        tela.add(isenha);
        
         setLocationRelativeTo(null);
         setVisible(true);
    
    
    }
    
    
    public static void main(String [] args){
                        
                            Login app = new Login();
                            app.setDefaultCloseOperation(EXIT_ON_CLOSE);
                            
                    }
}
