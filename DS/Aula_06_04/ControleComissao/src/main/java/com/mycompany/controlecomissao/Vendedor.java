/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlecomissao;
import javax.swing.*;
/**
 *
 * @author alexe
 */
public class Vendedor {
    //Variáveis
    private String nome;
    private double SalarioBase;        
    //Construtores        
    public Vendedor(){
      this("",0);
    }
    
    public Vendedor (String nome, double SalarioBase){
      this.nome=nome;
      this.SalarioBase=SalarioBase;
    }

    //Getters e Setters
    //Nome
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

   //SalarioBase
    public double getSalarioBase() {
        return SalarioBase;
    }

 
    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }
    
    //Métodos
    
    public double calculoComissao (double Valorzin){
        this.setNome(JOptionPane.showInputDialog("Digite o Seu nome"));
        this.setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu Salário-Base")));
        double SalBase = this.getSalarioBase();
        
        return SalBase+((Valorzin*10)/100);
    
    }
    
    
}
