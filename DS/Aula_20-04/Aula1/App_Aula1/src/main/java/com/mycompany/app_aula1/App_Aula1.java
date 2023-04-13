/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.app_aula1;
import javax.swing.*;
import java.awt.*; // para a utilização do container
/**
 *
 * @author dti
 */
//Entendendo para ser "Filho" do JFRAME.
public class App_Aula1 extends JFrame {

    public App_Aula1(){ //construtor
        super("Light Yagami"); //título
        setSize(600,450); //Definindo o Tamanho
        setResizable(false); //Não permite o Reajuste do APP
        setLocationRelativeTo(null); //Sempre aparecerá centralizada
        
        Container tela = getContentPane(); //Painel de Conteúdo onde ficará os elementos
        tela.setBackground(new Color(255,128,128));
        
        //Ícone
        //Funciona criando uma instância para a imagem que sera colocada.
        ImageIcon Icone = new ImageIcon("imagens/kira.png");
        setIconImage(Icone.getImage());
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
       App_Aula1 app = new App_Aula1(); //Instanciando
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para fechar normalmente
    }
}
