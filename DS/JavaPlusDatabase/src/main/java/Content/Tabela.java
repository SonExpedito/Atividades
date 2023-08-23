/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Content;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Admin
 */
public class Tabela extends JFrame{
    JTable tblClientes; //datagrid
    JScrollPane scp_tabela; //Container para o data grid
    
            public Tabela(){
            tblClientes = new JTable();
            scp_tabela=  new JScrollPane();
            
            tblClientes.setBounds(50,200,550,200);
            scp_tabela.setBounds(50,200,550,200);
            
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
                
                    public boolean isCellEditable(int rowIndex, int columnindex){
                         return canEdit [columnindex];         
                     };
                    
            
                    }); 
                    
                    scp_tabela.setViewportView(tblClientes);
                    tblClientes.setAutoCreateRowSorter(true); //Ativa a Classificação ordenada da tabela.
                    
                 
                }
}
