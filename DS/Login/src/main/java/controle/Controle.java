/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Controle extends JFrame{
    
            Conexao con_cliente;
            
    
            JLabel Titulo,rCodigo, rNome, rEmail, rTel, rData,Miles,rPesquisar;
            JTextField tcodigo, tnome, temail,tpesquisar;
            JFormattedTextField tel,data;
            MaskFormatter mTel, mData;
            
            JButton bprimeiro,bultimo, bproximo, banterior;
            JButton bNovoRegistror,bAlterar,bGravar,bExcluir;
            JButton pesquisar,sair;
            
            JTable tblClientes; //datagrid
            JScrollPane scp_tabela; //Container para o data grid
    
            Font titulozinho = null;
            
            ImageIcon imagens[];
            
    
            public Controle(){
                    setTitle("Confinguração de Registros");
                    setSize(900, 600);
                    setResizable(false);
                    setLayout(null);
                    Container tela = getContentPane();
            
                    ImageIcon icone = new ImageIcon("imagens/logo.png");
                    setIconImage(icone.getImage());
                    
                    tela.setBackground(new Color(14,14,26));
                    
                    try{
                     titulozinho = Font.createFont(Font.BOLD, getClass().getClassLoader().getResourceAsStream("Content/spiderfont.ttf"));
                     }
                        catch(IOException|FontFormatException e){
                                    System.out.println("Merda " + e);
                        }       
                    
                    
                    con_cliente = new Conexao();
                    con_cliente.conecta();
                    
                    //Miles Morales
                    ImageIcon mileszin = new ImageIcon("imagens/Miles.png");
                    Image mileszin2 = mileszin.getImage();
                    
                    Image scaledImage = mileszin2.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
                    ImageIcon milesfinal = new ImageIcon(scaledImage);
                    Miles = new JLabel(milesfinal);
                    Miles.setBounds(620,30,300,200);
                    
                    
                    
                    
                    //Labels
                    Titulo = new JLabel("SGBD Spider-Verse");
                     rCodigo = new JLabel("Código:");
                           rNome = new JLabel ("Nome:");
                           rEmail = new JLabel ("Email:");
                           rTel = new JLabel ("Telefone:");
                           rData = new JLabel ("Data-Nascimento:");
                           
                           //Inputs
                           tcodigo = new JTextField(5);
                           tnome = new JTextField(50);
                           temail = new JTextField(80);
                           
                           
                           //Mascaras
                           try{
                                mTel = new MaskFormatter("(##)#####-####");
                                mData = new MaskFormatter("##/##/####");
                            }
                           catch(ParseException excp){
                           
                           }
                           
                          tel = new JFormattedTextField(mTel);
                          data = new JFormattedTextField(mData);
                          
                          
                          //SetBounds
                          Titulo.setBounds(350,10,200,20);
                          Titulo.setForeground(new Color(255,42,37));
                          Titulo.setFont(new Font("titulozinho",Font.BOLD,20));
                          
                          
                          rCodigo.setBounds(50,40,100,20);
                          tcodigo.setBounds(100,41,100,18);
                          
                          tcodigo.setBackground(new Color(213,204,254));
                          
                          rCodigo.setFont(new Font("Arial",Font.BOLD,12));
                          
                          
                          
                          rNome.setBounds(50,90,100,20);
                          tnome.setBounds(100,91,180,18);
                          tnome.setBackground(new Color(213,204,254));
                          
                          rNome.setFont(new Font("Arial",Font.BOLD,12));
                          
                          rEmail.setBounds(50,140,100,20);
                           temail.setBounds(100,141,130,18);
                           temail.setBackground(new Color(213,204,254));
                           
                          rEmail.setFont(new Font("Arial",Font.BOLD,12));
                           
                          rTel.setBounds(50,190,100,20);
                          tel.setBounds(120,191,100,18);
                          tel.setBackground(new Color(213,204,254));
                          
                          rTel.setFont(new Font("Arial",Font.BOLD,12));
                          
                          rData.setBounds(50,240,150,20);
                          data.setBounds(160,241,80,18);
                          data.setBackground(new Color(213,204,254));
                          
                          rData.setFont(new Font("Arial",Font.BOLD,12));
                          
                          data.setHorizontalAlignment(JFormattedTextField.CENTER);
                          
                          
                          rCodigo.setForeground(new Color(213,204,254));
                          rNome.setForeground(new Color(213,204,254));
                          rEmail.setForeground(new Color(213,204,254));
                          rTel.setForeground(new Color(213,204,254));
                          rData.setForeground(new Color(213,204,254));
                          
                          
                          
                          //Botões e Pesquisa
                                String icones[]={"imagens/primeiro.png","imagens/anterior.png",
                                         "imagens/proximo.png","imagens/ultimo.png","imagens/novoregistro.png","imagens/gravar.png",
                                        "imagens/atualizar.png","imagens/delete.png","imagens/pesquisar.png","imagens/sair.png"};
                                          imagens = new ImageIcon[11];
                                        for(int i = 0;i < 10;i++){
                                  imagens[i] = new ImageIcon(icones[i]);}      
                          
                            rPesquisar = new JLabel("Pesquise:");
                            tpesquisar = new JTextField(5);
                            pesquisar = new JButton(imagens[8]);
                            
                            bprimeiro = new JButton(imagens[0]);
                            bultimo = new JButton(imagens[3]);
                            bproximo = new JButton(imagens[2]);
                            banterior = new JButton(imagens[1]);
                            
                            bNovoRegistror = new JButton(imagens[4]);
                            bAlterar = new JButton(imagens[6]);
                            bGravar = new JButton(imagens[5]);
                            bExcluir = new JButton(imagens[7]);
                            sair = new JButton(imagens[9]);
                          
                            rPesquisar.setBounds(200,530,200,20);
                           tpesquisar.setBounds(280,530,350,20);
                           pesquisar.setBounds(650,530,30,20);
                           
                           rPesquisar.setForeground(new Color(213,204,254));
                           
                           bprimeiro.setBounds(680,280,30,20);
                           bultimo.setBounds(730,280,30,20);
                           bproximo.setBounds(780,280,30,20);
                           banterior.setBounds(830,280,30,20);
                           
                           
                           
                           bNovoRegistror.setBounds(680,330,30,20);
                           bAlterar.setBounds(730,330,30,20);
                           bGravar.setBounds(780,330,30,20);
                           bExcluir.setBounds(830,330,30,20);
                           
                           sair.setBounds(750,390,30,20);
                            
                           //Corzinha
                           
                           bprimeiro.setBackground(new Color(213,204,254));
                           bultimo.setBackground(new Color(213,204,254));
                           bproximo.setBackground(new Color(213,204,254));
                           banterior.setBackground(new Color(213,204,254));
                           
                           bNovoRegistror.setBackground(new Color(213,204,254));
                           bAlterar.setBackground(new Color(213,204,254));
                           bGravar.setBackground(new Color(213,204,254));
                           bExcluir.setBackground(new Color(213,204,254));
                           
                           sair.setBackground(new Color(213,204,254));
                           
                           //Dicas
                           Miles.setToolTipText("Alex Expedito Silva Santos");
                           bprimeiro.setToolTipText("Seleciona o Primeiro Registro da Tabela");
                           bultimo.setToolTipText("Seleciona o Último Registro da Tabela");
                           bproximo.setToolTipText("Seleciona o Próximo Item da Tabela");
                           banterior.setToolTipText("Seleciona o  Item anterior da Tabela");
                           
                           bNovoRegistror.setToolTipText("Inicia um novo Registro");
                           bAlterar.setToolTipText("Altera um Registro da Tabela");
                           bGravar.setToolTipText("Cria um novo registro na tabela");
                           bExcluir.setToolTipText("Excluí um Registro da Tabela");
                           
                           sair.setToolTipText("Fecha o SGBD");
                           
                           
                           //Função dos Botões
                            sair.addActionListener( new ActionListener(){
                                         public void actionPerformed(ActionEvent e){
                                                int opcaosair;
                                                    Object[]botoessair={"Sim","Não"};
                                                    opcaosair = JOptionPane.showOptionDialog(null,"Você deseja mesmo sair?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoessair,botoessair[0]);
                                                     if(opcaosair==JOptionPane.YES_NO_OPTION)System.exit(0);   
                                 }});
                           
                           bprimeiro.addActionListener( new ActionListener(){
                                             public void actionPerformed(ActionEvent e){
                                                     try{
                                                             con_cliente.resultset.first();
                                                                    mostrar_Dados();
                                                 }catch(SQLException erro){
                                                 JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro");
                                    }
                                 }});
            
                        banterior.addActionListener( new ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                    try{
                                             if(con_cliente.resultset.isFirst()){
                                                    JOptionPane.showMessageDialog(null, "Você se encontra no primeiro registro");}
                                             else{
                                                    con_cliente.resultset.previous();   
                                                     mostrar_Dados();}  
                                   }catch(SQLException erro){
                                          JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro");
                                        }
                                  }});
            
                            bproximo.addActionListener( new ActionListener(){
                                            public void actionPerformed(ActionEvent e){
                                                         try{
                                                                 if(con_cliente.resultset.isLast()){
                                                                            JOptionPane.showMessageDialog(null, "Você se encontra no último registro");}
                                                                else{
                                                                             con_cliente.resultset.next();
                                                                                mostrar_Dados();}
                                                        }catch(SQLException erro){
                                                                    JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro");
                                                                       }
                                              }});
            
                                            bultimo.addActionListener( new ActionListener(){
                                                                public void actionPerformed(ActionEvent e){
                                                                            try{
                                                                                    con_cliente.resultset.last();
                                                                                    mostrar_Dados();
                                                                         }catch(SQLException erro){
                                                                            JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro");
                                                                         }
                                                                    }});
            
                                            
                                            
                                                bNovoRegistror.addActionListener( new ActionListener(){
                                                                 public void actionPerformed(ActionEvent e) {
                                                                                tcodigo.setText(""); // limpa a caixa de texto em questão
                                                                                tnome.setText("");
                                                                                temail.setText("");
                                                                                tel.setText("");
                                                                                data.setText("");
                                                                                tcodigo.requestFocus(); // posiciona o cursor neste campo para a digitação
                                                                      }});
            
                                    bGravar.addActionListener( new ActionListener(){
                                                     public void actionPerformed(ActionEvent e) {
                                                     String nome = tnome.getText();
                                                     String data_nasc = data.getText();
                                                     String telefone = tel.getText();
                                                     String email = temail.getText();
                    
                                                try {
                                                                String insert_sql="insert into tbclientes (nome,telefone, email, dt_nasc) values ('" + nome + "','" + telefone + "','" + email + "','" + data_nasc + "')";
                                                                con_cliente.statement.executeUpdate(insert_sql);
                                                                JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                        
                                                                con_cliente.executaSQL("select * from tbclientes order by cod");
                                                                preencherTabela();
                                                 }catch(SQLException errosql){
                                                            JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                                                    }
                                                }});
             
            
                                        bAlterar.addActionListener( new ActionListener(){
                                                                        public void actionPerformed(ActionEvent e) {
                                                                                            String nome = tnome.getText();
                                                                                            String data_nasc = data.getText();
                                                                                            String telefone = tel.getText();
                                                                                            String email = temail.getText();
                                                                                            String sql;
                                                                                             String msg="";
                    
                                                                                        try {
                                                                                                 if(tcodigo.getText().equals("")){
                                                                                                            sql="insert into tbclientes (nome,telefone, email, dt_nasc) values ('" + nome + "','" + telefone + "','" + email + "','" + data_nasc + "')";
                                                                                                            msg="Gravação de um novo registro";
                                                                                                             }
                                                                                                 else{
                                                                                                                        sql="update tbclientes set nome='" + nome + "',telefone='" + telefone + "', email='" + email + "', dt_nasc='" + data_nasc + "' where cod = " + tcodigo.getText();
                                                                                                                        msg="Alteração de registro";
                                                                                                                }
                        
                                                                                             con_cliente.statement.executeUpdate(sql);
                                                                                                JOptionPane.showMessageDialog(null, msg,"Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                        
                                                                                                 con_cliente.executaSQL("select * from tbclientes order by cod");
                                                                                            preencherTabela();
                        
                                                                                     }catch(SQLException errosql){
                                                                                                    JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                                                                                            }
                                                                                }});
                 
            bExcluir.addActionListener( new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                   String sql=""; 
                   try{
                       int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ","Confirmar Exclusão",JOptionPane.YES_NO_OPTION,3);
                       if (resposta==0){
                           sql = "delete from tbclientes where cod = " + tcodigo.getText();
                           int excluir = con_cliente.statement.executeUpdate(sql);
                           if(excluir ==1){
                               JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!", "Mensagem do programa",JOptionPane.INFORMATION_MESSAGE);
                               con_cliente.executaSQL("select * from tbclientes order by cod");
                               con_cliente.resultset.first();
                               preencherTabela();
                               posicionarRegistro();
                           }
                           else{
                               JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!!","Menssagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                           }
                       }
                   }catch (SQLException excecao){
                        JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n "+excecao,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    }
                }});
            
                                         pesquisar.addActionListener( new ActionListener(){
                                                     public void actionPerformed(ActionEvent e) {
                                                             try{
                                                                     String pesquisa = "select * from tbclientes where nome like '" + tpesquisar.getText() + "%'";
                                                                     con_cliente.executaSQL(pesquisa);
                     
                                                                        if(con_cliente.resultset.first()){
                                                                                            preencherTabela(); 
                                                                                         }
                                                                        else{
                                                                                    JOptionPane.showMessageDialog(null, "\n Não existe dados com este paramêtro!! :\n ","Mensagem do Programa,",JOptionPane.INFORMATION_MESSAGE);
                                                                                    }
                                                              }catch(SQLException errosql){
                                                                                        JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                                                         }
                            }});      
                           
                            
                          //Tabela
                            tblClientes = new JTable();
                            scp_tabela=  new JScrollPane();
                             tela.add(tblClientes);
                            tela.add(scp_tabela);
                            
                            tblClientes.setBounds(100,280,550,200);
                            scp_tabela.setBounds(100,280,550,200);
                            
                            tblClientes.setBackground(new Color(213,204,254));
                            scp_tabela.setBackground(new Color(213,204,254));
                            
            
                             tblClientes.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
                            tblClientes.setFont (new Font("Arial",1,12));
            
            
                            tblClientes.setModel(new javax.swing.table.DefaultTableModel(
                                        new Object[][]{
                                                {null,null,null,null,null},
                                                {null,null,null,null,null},
                                                {null,null,null,null,null},
                                                {null,null,null,null,null}
                                                 },
                                            new String [] {"Código","Nome", "Data Nascimento", "Telefone", "Email" }
                                             )
            
                                     {
                                                         boolean[] canEdit = new boolean []{
                                                                             false,false,false,false,false
                                                                 };
                
                                                         @Override
                                        public boolean isCellEditable(int rowIndex, int columnindex){
                                                return canEdit [columnindex];         
                                            };
                                                     }); 
              
                    scp_tabela.setViewportView(tblClientes);
                    tblClientes.setAutoCreateRowSorter(true); //Ativa a Classificação ordenada da tabela.
                          
                          
                          
                          
                    
                   
                        tela.add(Miles);
                        tela.add(Titulo);
                         tela.add(rCodigo);
                         tela.add(tcodigo);
                         tela.add(rNome);
                         tela.add(tnome);
                         tela.add(rEmail);
                         tela.add(temail);
                         tela.add(rTel);
                         tela.add(tel);
                         tela.add(rData);
                         tela.add(data);
                         
                              tela.add(rPesquisar);
                              tela.add(tpesquisar);
                              tela.add(pesquisar);
                              
                              tela.add(bprimeiro);
                              tela.add(bultimo);
                              tela.add(bproximo);
                              tela.add(banterior);
                              
                              tela.add(bNovoRegistror);
                              tela.add(bAlterar);
                              tela.add(bGravar);
                              tela.add(bExcluir);
                              
                              tela.add(sair);
                              
                        
                    
                    setLocationRelativeTo(null);

                    con_cliente.executaSQL("select * from tbclientes order by cod");
                    preencherTabela();
                    posicionarRegistro();
                
            }
            
             public void preencherTabela(){
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(80);
        tblClientes.getColumnModel().getColumn(1).setPreferredWidth(170);
        tblClientes.getColumnModel().getColumn(2).setPreferredWidth(130);
        tblClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblClientes.getColumnModel().getColumn(4).setPreferredWidth(150);
        
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setNumRows(0);
        
        try {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()){
            modelo.addRow(new Object[]{
            con_cliente.resultset.getString("cod"),con_cliente.resultset.getString("nome"),con_cliente.resultset.getString("dt_nasc"),con_cliente.resultset.getString("telefone"), con_cliente.resultset.getString("email")

            });
          }
        }catch (SQLException erro){
          JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //método posicionarRegistro
    public void posicionarRegistro(){
        try{
            con_cliente.resultset.first(); // posiciona no 1° registro da tabela
            mostrar_Dados(); // chama o método que irá buscar o dado da tabela
           }catch(SQLException erro){
           JOptionPane.showMessageDialog(null,"Não foi possível posicionar no primeiro registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);    
           }
    }
    
    
       public void mostrar_Dados(){
       try{
           tcodigo.setText(con_cliente.resultset.getString("cod")); // Associar a caixa de texto ao campo cod
           tnome.setText(con_cliente.resultset.getString("nome")); // Associar a caixa de texto ao campo nome
           data.setText(con_cliente.resultset.getString("dt_nasc"));
           tel.setText(con_cliente.resultset.getString("telefone"));
           temail.setText(con_cliente.resultset.getString("email"));
       }catch(SQLException erro){
       JOptionPane.showMessageDialog(null,"Não localizou dados: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);    
       }     
    }
            
            
            
            public static void main(String [] args){
                        
                            Controle app = new Controle();
                            app.setDefaultCloseOperation(EXIT_ON_CLOSE);
                            
                    }
    
            }

