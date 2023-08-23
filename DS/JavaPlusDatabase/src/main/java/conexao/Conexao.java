/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;
import java.sql.*;  //Para execução do SQL

public class Conexao {
    final private String driver = "com.mysql.cj.jdbc.Driver"; //Definição do Driver MySQL
    final private String url = "jdbc:mysql://localhost/clientes"; //acessa o bd "clientes" através do MyADMIN
    final private String usuario = "root"; //Usuária do MYSQL
    final private String senha = ""; //Senha do Mysql
    
    private Connection conexao; //variável que armazenará a conexão aberta
    public Statement statement; //Variável que executará comeandos SQL
    public ResultSet resultset; //variável que armazenará o resultado de um comando SQL
    
    
    public boolean conecta(){
        boolean result = true;
          try{
              Class.forName(driver);
              conexao = DriverManager.getConnection(url, usuario, senha);
              JOptionPane.showMessageDialog(null, "Conexão Estabelecida", "Aviso", JOptionPane.INFORMATION_MESSAGE); 
              
          }
          catch(ClassNotFoundException Driver){
           
              JOptionPane.showMessageDialog(null, "Driver não foi encontrado" +Driver, "Erro", JOptionPane.ERROR_MESSAGE);
              result = false;
          }
          
          catch(SQLException Fonte){
                JOptionPane.showMessageDialog(null, "Banco de Dados não encontrado: " +Fonte, "Erro", JOptionPane.ERROR_MESSAGE);
                result = false;
          }
          
            return result;
        
    }
    
    public void desconecta(){
        try{
                conexao.close();
                JOptionPane.showMessageDialog(null, "Conexão com o Banco Encerrada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        
        
        }
        catch(SQLException fecha){
            JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão com o Banco", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void executaSQL(String sql){
            try{
                statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                resultset = statement.executeQuery(sql);
            }
            catch(SQLException excecao){
                JOptionPane.showMessageDialog(null, "Erro ao executar o Comando SQL"+ excecao, "Mensagem do Programa", JOptionPane.ERROR_MESSAGE);
            }
    }
    
}
