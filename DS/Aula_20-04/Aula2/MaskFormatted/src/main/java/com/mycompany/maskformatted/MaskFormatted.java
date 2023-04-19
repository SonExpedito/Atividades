/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maskformatted;
import javax.swing.*;
import java.awt.*;
import java.text.*;
import javax.swing.text.*;
/**
 *
 * @author alexe
 */
public class MaskFormatted extends JFrame {
    //Declarando os elementos
      JLabel rotulonome,rotuloinsta,rotulodata,rotulocell,rotimagem;
      JFormattedTextField nome,insta,data,cell;
      MaskFormatter mascaranome,mascarainsta,mascaradata,mascaracell;
      
      public MaskFormatted (){
          //Começo
          super("Mascarasinha"); //Título
          Container tela = getContentPane(); //Colocando o Painel
          setSize (600,450); //Colocando o Tamanho
          setLayout(null); //Limpando a Tela
          setResizable(false); //Impedindo o redimensionamento
          tela.setBackground(new Color(192,192,192));
          
           
          //Icone e Imagens
            ImageIcon icone = new ImageIcon ("Imagens/Deku.png");
            setIconImage(icone.getImage());
            
            
            ImageIcon imagem = new ImageIcon ("Imagens/Deku.jpg"); //Buscou a Imagem
            Image imagenzinha = imagem.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH); //Reescalonou e colocando num objeto
            
            ImageIcon midoriya = new ImageIcon(imagenzinha); //Transformou o objeto em uma imagem comum.
          
          //Elementos
            //Label
              rotulonome = new JLabel("Nome");
              rotuloinsta = new JLabel("Instagram");
              rotulodata = new JLabel ("Data-Nascimento");
              rotulocell = new JLabel ("Celular");
              rotimagem = new JLabel (midoriya);
             
              
             //Padrão  variavel.setBounds(eixoX,eixoY,Largura,Altura);
               
              rotulonome.setBounds(50,40,100,20);
              rotuloinsta.setBounds(50,80,100,20);
              rotulocell.setBounds(50,120,100,20);
              rotulodata.setBounds(50,160,100,20);
              rotimagem.setBounds(150,200,300,200);
              
            //Mascara
               
            try {
               mascaranome = new MaskFormatter("??????????????");
               mascarainsta = new MaskFormatter("@AAAAAAAA");
               mascaradata = new MaskFormatter("##/##/####");
               mascaracell = new MaskFormatter("(##)####-####");
               
               mascaranome.setPlaceholderCharacter('_');
               mascarainsta.setPlaceholderCharacter('_');
               mascaradata.setPlaceholderCharacter('_');
               mascaracell.setPlaceholderCharacter('_');
               
            }
            catch (ParseException excp){}
               
            //Texto Formatado
              nome = new JFormattedTextField(mascaranome);
              insta = new JFormattedTextField(mascarainsta);
              data = new JFormattedTextField(mascaradata);
              cell = new JFormattedTextField(mascaracell);
          
             //colocando cordenadas e tamanho
               nome.setBounds(150,40,100,20);
               insta.setBounds(150,80,100,20);
               cell.setBounds(150,120,100,20);
               data.setBounds(150,160,100,20);
               
               
             //Colocando a font
             rotulonome.setFont(new Font("Arial",Font.BOLD,14));
             rotuloinsta.setFont(new Font("Arial",Font.BOLD,14));
             rotulocell.setFont(new Font("Arial",Font.BOLD,14));
             rotulodata.setFont(new Font("Arial",Font.BOLD,14));
             
             nome.setFont(new Font("Arial",Font.BOLD,14));
             insta.setFont(new Font("Arial",Font.BOLD,14));
             cell.setFont(new Font("Arial",Font.BOLD,14));
             data.setFont(new Font("Arial",Font.BOLD,14));
               
             //Adicionando na tela
             tela.add(rotulonome);
             tela.add(nome);
             
             tela.add(rotuloinsta);
             tela.add(insta);
             
             tela.add(rotulocell);
             tela.add(cell);
             
             tela.add(rotulodata);
             tela.add(data);
             
             tela.add(rotimagem);
              
              
          //Últimos elementos
          setLocationRelativeTo(null); //Centralizando
          setVisible(true); //Deixando visível
       }
       
       public static void main (String [] args){
           MaskFormatted app = new MaskFormatted();
            app.setDefaultCloseOperation(EXIT_ON_CLOSE);
       }
  
}
