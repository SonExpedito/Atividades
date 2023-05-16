/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula6;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.Calendar;
import javax.swing.Timer;
/**
 *
 * @author alexe
 */
public class Aula6 extends JFrame{
        JButton Cadastrar,Sair,
                Informacao,Erro,Exclamacao, Pergunta, Nenhum;
        JLabel Texto,Nome,Data,Horas,Estado;
        String nome;
        
        
        Calendar hora, data;
        DecimalFormat formato;
        
        int hh,mm,ss,h;
        int ds,dia,mes,ano;
        String Diasemana[]={"Domingo","Segunda-Feira","Terça-Feira","Quarta Feira",
                            "Quinta-Feira","Sexta-Feira","Sábado"};
        String Meses[]={"Janeiro","Fevereiro","Março","Abril","Maio","Junho",
                "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        
     public Aula6(){
         super("Aula 6");
          setSize(600,450);
         setResizable(false);
         setLayout(null);
         Container tela = getContentPane();
         
         //Icone
         ImageIcon icone = new ImageIcon("Imagem/bluelock.jpg");
         setIconImage(icone.getImage());
         
         
         //Configurando
            Nome = new JLabel();
            Estado = new JLabel();
            Horas = new JLabel();
            Data = new JLabel();
         
           Cadastrar = new JButton("Cadastrar");
           Cadastrar.setToolTipText("Assim que apertar iremos iniciar o Cadastro");
           UIManager.put("ToolTip.background",SystemColor.info);

           Sair = new JButton("Sair");
           Sair.setToolTipText("Assim que apertar irá Sair do Aplicativo");
           
           Exclamacao = new JButton("Detalhes");
           Informacao = new JButton("Informacao");
           Erro = new JButton("Segurança");
           Pergunta = new JButton("Perguntas");
           Nenhum= new JButton("Legal");
           
           Texto = new JLabel("Os Dados Cadastrados foram:");
           
           //Horas
            hora = Calendar.getInstance();
            hh = hora.get(Calendar.HOUR_OF_DAY);
            mm = hora.get(Calendar.MINUTE);
            ss = hora.get(Calendar.SECOND);
            formato = new DecimalFormat("00");
           
            Horas.setText("Hora do Cadastro: "+formatar(hh%12)+":"+formatar(mm)+":"+formatar(ss));
            
            //Data
            data = Calendar.getInstance();
            ds = data.get(Calendar.DAY_OF_WEEK);
            dia = data.get(Calendar.DAY_OF_MONTH);
            mes = data.get(Calendar.MONTH);
            ano = data.get(Calendar.YEAR);

            Data.setText("Data do Cadastro: "+Diasemana[ds-1]+", "+dia+" de "+Meses[mes]+" de "+ano);
           
           
            //Posição
           Nome.setBounds(100,50,400,30);
           Estado.setBounds(100,100,200,20);
           
           Horas.setBounds(100,150,200,20);
           Data.setBounds(100,200,200,20);
           Texto.setBounds(150,10,200,20);
       
           
           Cadastrar.setBounds(180,10,200,20);
           Erro.setBounds(180,60,200,20);
           Exclamacao.setBounds(180,110,200,20);
           Informacao.setBounds(180,160,200,20);
           Pergunta.setBounds(180,210,200,20);
           Nenhum.setBounds(180,260,200,20);
         
           
           Sair.setBounds(180,310,200,20);
           
           //Ação 
           //Botões de Aviso
           
             Erro.addActionListener((ActionEvent e) -> {
                 JOptionPane.showMessageDialog(null,"Está criptografado de ponta a ponta","Segurança",JOptionPane.ERROR_MESSAGE,null);
                });
             
            Informacao.addActionListener((ActionEvent e) -> {
                JOptionPane.showMessageDialog(null,"Você escolheu informação","Informação",JOptionPane.INFORMATION_MESSAGE,null);
                });
            Exclamacao.addActionListener((ActionEvent e) -> {
                JOptionPane.showMessageDialog(null,"Os dados só serão salvos após o envio","Detalhes",JOptionPane.WARNING_MESSAGE,null);
                });
            Pergunta.addActionListener((ActionEvent e) -> {
                JOptionPane.showMessageDialog(null,"Ao se Cadastrar você irá concorrer a uma vaga, caso selecionada irá ser chamada.","Perguntas",JOptionPane.QUESTION_MESSAGE,null);
                });
            Nenhum.addActionListener((ActionEvent e) -> {
                JOptionPane.showMessageDialog(null,"Você escolheu nenhum","Legal",JOptionPane.PLAIN_MESSAGE,null);
                 });
           
           
         //Botão Sair   
            
           Sair.addActionListener((ActionEvent e) -> {
               int opcao;
               Object[] botoes = {"Sim","Não"};
               opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo fechar a janela?","Fechar",
                               JOptionPane.YES_NO_OPTION,
                               JOptionPane.QUESTION_MESSAGE,
                               null,botoes,botoes[0]);
                               if (opcao==JOptionPane.YES_OPTION)
                                   System.exit(0);
         });
           
           
         //Cadastrar
            Cadastrar.addActionListener((ActionEvent e) -> {
                      nome = JOptionPane.showInputDialog("Entre com seu nome: ");
                      Nome.setText("O Nome cadastrado foi: " +nome.toUpperCase());
                       
                      Object cidades [] = {"Paris","Catalhuna","São Paulo","Los Angeles"};
                      Object opcao = JOptionPane.showInputDialog(null,"Qual sua linguagem favorita" ,"Enquete",JOptionPane.QUESTION_MESSAGE,null,cidades,cidades[0]);
                       
                      Estado.setText("A Cidade Cadastrada foi:" +opcao);
                      
                         
                      
                      
                      Cadastrar.setVisible(false);
                      Erro.setVisible(false);
                      Exclamacao.setVisible(false);
                      Informacao.setVisible(false);
                      Nenhum.setVisible(false);
                      Pergunta.setVisible(false);
                      
                      Nome.setVisible(true);
                      Estado.setVisible(true);
                      Horas.setVisible(true);
                      Data.setVisible(true);
                      Texto.setVisible(true);
                                 
                      
                      setLayout(null);
                   
                   
         });
           
           //Colocando
           tela.add(Nome);
           tela.add(Estado);
           tela.add(Horas);
           tela.add(Data);
           tela.add(Texto);
           
             //INvisivel
               Nome.setVisible(false);
               Estado.setVisible(false);
               Horas.setVisible(false);
               Data.setVisible(false);
               Texto.setVisible(false);
           
           
           tela.add(Cadastrar);
           tela.add(Erro);
           tela.add(Exclamacao);
           tela.add(Informacao);
           tela.add(Nenhum);
           tela.add(Pergunta);
           tela.add(Sair);
           
         

           
           
      setLocationRelativeTo(null);
      setVisible(true);
           
         
     }
     
     
      private String formatar(int num){
                formato = new DecimalFormat("00");
                return formato.format(num);
              };   
      
     public static void main (String [] args){
        Aula6 app = new Aula6();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}
