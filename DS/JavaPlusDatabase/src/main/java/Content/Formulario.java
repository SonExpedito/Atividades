/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Content;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Admin
 */
public class Formulario extends JFrame{
            JLabel rCodigo, rNome, rEmail, rTel, rData;
            JTextField tcodigo, tnome, temail;
            JFormattedTextField tel,data;
            MaskFormatter mTel, mData;
            
             public Formulario(){
                           //Labels
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
                                mTel = new MaskFormatter("(##)####-####");
                                mData = new MaskFormatter("##/##/####");
                            }
                           catch(ParseException excp){
                           
                           }
                           
                          tel = new JFormattedTextField(mTel);
                          data = new JFormattedTextField(mData);
                          
                          
                          //SetBounds
                          
                          rCodigo.setBounds(50,100,100,10);
                          tcodigo.setBounds(100,100,200,10);
                          
                          rNome.setBounds(50,150,100,10);
                          tnome.setBounds(100,150,200,10);
                          
                          rEmail.setBounds(50,200,100,10);
                           temail.setBounds(100,200,200,10);
                          
                          rTel.setBounds(50,250,100,10);
                          rTel.setBounds(100,250,200,10);
                          
                          rData.setBounds(50,300,100,10);
                          rData.setBounds(100,300,200,10);
                          
                          
                    }
    }
          

