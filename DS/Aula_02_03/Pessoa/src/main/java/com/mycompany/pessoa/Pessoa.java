/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;
import javax.swing.JOptionPane;
/**
 *
 * @author alexe
 */
public class Pessoa {
    //Atibutos
    private String Nome;
    private String Endereco;
    private String Telefone;
    
    //Construtor
    public Pessoa(){
     this("","",""); //Inicializa os Atributos
    }
    
    public Pessoa(String Nome, String Endereco, String Telefone){
     this.Nome= Nome;
     this.Endereco= Endereco;
     this.Telefone= Telefone;
     //Faz que os atributos possam ser modificados via Classe Principal
    }
    //Set e Get
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = JOptionPane.showInputDialog("Por Favor insira seu Nome");
    }

    //Endereço
    public String getEndereco() {
        return Endereco;
    }


    public void setEndereco(String Endereco) {
        this.Endereco = JOptionPane.showInputDialog("Por Favor insira seu Endereço");
    }

//Telefone
    public String getTelefone() {
        return Telefone;
    }


    public void setTelefone(String Telefone) {
        this.Telefone = JOptionPane.showInputDialog("Por Favor insira seu Telefone");
    }
    
    
    //Métodos
    
    public void inserirDados(){
        JOptionPane.showMessageDialog(null, "Bem Vindo a Enel, por favor prossiga com o Cadastro");
        setNome(Nome);
        setEndereco(Endereco);
        setTelefone(Telefone);
    }
    
    public void apresentardados(){
              JOptionPane.showMessageDialog(null, "Os Dados cadastrados foram: \n"
                      + "Nome: " +getNome()
                      + "\n Endereço: " +getEndereco()
                      + "\n Telefone: " +getTelefone());
              JOptionPane.showMessageDialog(null,"Dados Cadastrados com Sucesso");
    }

    
}
