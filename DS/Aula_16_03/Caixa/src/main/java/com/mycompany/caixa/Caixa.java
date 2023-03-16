/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caixa;
import javax.swing.*;
/**
 *
 * @author dti
 */
public class Caixa {
    //Atributo
    private double saldo;
    //Construtor
    // Iniciazlizando o Atributo Zerado
    public Caixa(){
      this(0);
    }
    
    
    // Inicializando o atributo com o parâmetro
    public Caixa (double saldo){
       this.saldo= saldo;
    
    }
    
    
  //Set-Get  

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    //Métodos específicos da classe
    
    public void entrar(){
       // Lê um valor, converte da String para double e atribuí a variável valor
       double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Entrada: "));
       /*Soma o conteúdo do atributo saldo com o a variável valor e passa o resultado por parâmetro
          para o método setSaldo() */
         this.setSaldo(this.getSaldo()+valor);
  

    }
    
    
    public void retirar(){
    
      //Lê um valor, converte da String para double e atribuí a variável valor
      double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Retirada"));
      /* Soma o Conteúdo do atributo saldo com o a  variável valor e pasa o resultado por parâmetro
           para o método setSaldo()
        */
      this.setSaldo(this.getSaldo()-valor);
    }
    
    
}
