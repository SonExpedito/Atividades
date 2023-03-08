/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamento;

/**
 *
 * @author alexe
 */
public class Usuario {
    
    //Atributos
    private String nome;
    private String email;
    private String login;
    private String senha;
    
    //Construtores
    //Inicializa os atributos vazios
    public Usuario() {
      this("","","","");
    }
    
    //Inicializa os atributos com valores passados por parâmetro
    public Usuario(String nome, String email, String login, String senha){
        this.nome = nome;
        this.email= email;
        this.login = login;
        this.senha= senha;
    }
    
    //Getters e Setters
    public String getNome(){
        return nome;
    }
    
    
    public void setNome(String nome){
       this.nome= nome;
    }
    
    //Email
        public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Login
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    //Senha
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    //Implementação dos demais getters e setters
    
    //Métodos específicos da classe
    
    public void provarExistencia(){
       System.out.println("Oi, meu nome é " + this.getNome() + "e eu Existo!");
    }


}
