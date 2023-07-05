/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menumodalexerci;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author alexe
 */
public class MenuModalExerci extends JFrame {
    JMenuBar barra;
    JMenu operacoes;
    JMenuItem sobre,sair,soma,dividir,multiplicacao,subtracao,
            sairpop,sobrepop;
    
    JPopupMenu opcoes;
    
    Sobre sobrinho;
    
    JToolBar navbar;
    ImageIcon[] imagens;
    JButton miles, gwen, peter, pork,miles2;
        
        public MenuModalExerci(){
            
            super("NavBar e o Modal");
            setSize(800, 500);
            setResizable(false);
            setLayout(null);
            Container tela = getContentPane();
            
            ImageIcon icone = new ImageIcon("imagens/spiderman.jpg");
            setIconImage(icone.getImage());

            
            
            
            
            //Menu
            barra = new JMenuBar();
            setJMenuBar(barra);
            
            operacoes = new JMenu("Operações");
            
            
            soma = new JMenuItem("Soma");
            subtracao = new JMenuItem("Subtração");
            multiplicacao = new JMenuItem("Multiplicação");
            dividir = new JMenuItem("Divisão");
            
            sobre = new JMenuItem("Sobre");
            sair = new JMenuItem("Sair");

            operacoes.add(soma);
            operacoes.add(subtracao);
            operacoes.add(multiplicacao);
            operacoes.add(dividir);
            
            
            barra.add(operacoes);
            barra.add(sobre);
            barra.add(sair);
           
            
            
           //NavBar 
            String[] icones = {"imagens/miles.png", "imagens/gwen.png", "imagens/peter.png", "imagens/pork.png","imagens/miles2.jpg"};
            
            imagens = new ImageIcon[5];
                 for (int i = 0; i < 5; i++) {
                    Image imagemOriginal = new ImageIcon(icones[i]).getImage();
                    Image imagemRedimensionada = imagemOriginal.getScaledInstance(80, 100, Image.SCALE_SMOOTH);
                imagens[i] = new ImageIcon(imagemRedimensionada);
                 }
            
            miles = new JButton(imagens[0]);
            gwen = new JButton(imagens[1]);
            peter = new JButton(imagens[2]);
            pork = new JButton(imagens[3]);
            miles2 = new JButton(imagens[4]);

            miles.setToolTipText("Se Você apertar Realizará: Soma");
            gwen.setToolTipText("Se Você apertar Realizará: Subtração");
            peter.setToolTipText("Se Você apertar Realizará: Multiplicação");
            pork.setToolTipText("Se Você apertar Realizará: Divisão");
            miles2.setToolTipText("Se Você apertar Você irá sair");
            
            navbar = new JToolBar("SpiderBar");
            UIManager.put("ToolTip.background", SystemColor.info);
            UIManager.put("ToolTip.foreground", Color.blue);
            navbar.setRollover(true);

            navbar.add(miles);
            navbar.add(gwen);
            navbar.add(peter);
            navbar.add(pork);
            navbar.add(miles2);
           //Fim NavBar 
           
           //POP UP
           
           opcoes=new JPopupMenu();
           sobrepop = new JMenuItem("Sobre");
            sairpop = new JMenuItem("Sair");
            
           opcoes.add(sobrepop);
           opcoes.add(sairpop);
           
              tela.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    opcoes.show(e.getComponent(), e.getX(), e.getY());
                }
                    }               
                        });
              
              sobrepop.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                 sobrinho = new Sobre(null, "Sobre", true);
                sobrinho.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                }
            });
               
             sairpop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int status = JOptionPane.showConfirmDialog(null,
                        "Deseja realmente fechar o programa?", "Mensagem de saída",
                        JOptionPane.YES_NO_OPTION);
                    if (status == JOptionPane.YES_OPTION) {
                    System.exit(0);
                 }
                }
                });
           
           
           
           
           
           
           //Comando NavBar
             miles.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               Somar somarinho = new Somar(null, "Somar", true);
                    somarinho.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    
            }});
             
             gwen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Subtracao subzinho = new Subtracao(null, "Subtração", true);
                    subzinho.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    
                    }
                });
               
               peter.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Multiplicacao multizinho = new Multiplicacao(null, "Multiplicação", true);
                    multizinho.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    
                    }
                });
               
               pork.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Dividir divisinho = new Dividir(null, "Divisão", true);
                    divisinho.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    
                    }
                });
               
                miles2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int status = JOptionPane.showConfirmDialog(null,
                        "Deseja realmente fechar o programa?", "Mensagem de saída",
                        JOptionPane.YES_NO_OPTION);
                    if (status == JOptionPane.YES_OPTION) {
                    System.exit(0);
                 }
                }
                });
            
           
           
           
           //Comando Menu
               soma.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Somar somarinho = new Somar(null, "Somar", true);
                    somarinho.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    
                    }
                });
               
               subtracao.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Subtracao subzinho = new Subtracao(null, "Subtração", true);
                    subzinho.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    
                    }
                });
               
               multiplicacao.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Multiplicacao multizinho = new Multiplicacao(null, "Multiplicação", true);
                    multizinho.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    
                    }
                });
               
               dividir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Dividir divisinho = new Dividir(null, "Divisão", true);
                    divisinho.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    
                    }
                });
           
           
              sobre.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                     sobrinho = new Sobre(null, "Sobre", true);
                    sobrinho.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    
                    }
                });
               
             sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int status = JOptionPane.showConfirmDialog(null,
                        "Deseja realmente fechar o programa?", "Mensagem de saída",
                        JOptionPane.YES_NO_OPTION);
                    if (status == JOptionPane.YES_OPTION) {
                    System.exit(0);
                 }
                }
                });
            
             
             
             navbar.setBounds(150, 1, 500, 100);
             tela.add(navbar);
             
            setLocationRelativeTo(null);
            setVisible(true);
         }
    
    
    public static void main(String[] args) {
        try {
    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (Exception ex) {
    ex.printStackTrace();
}
        MenuModalExerci app = new MenuModalExerci();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
    
}
