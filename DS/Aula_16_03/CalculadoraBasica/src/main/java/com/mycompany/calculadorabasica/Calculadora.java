/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorabasica;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Calculadora {
    private double n1;
    private double n2;
    private double r;
    
    
    //Construtores 
    
    //Iniciador de Vari[aveisw
    public Calculadora(){
       this(0,0,0);
    }
    
    //Permissão para o GET/SET
    public Calculadora(double n1, double n2, double r){
       this.n1 = n1;
       this.n2 = n2;
       this.r = r;
    }


    //GET-SET
    
    //N1
    public double getN1() {
        return n1;
    }


    public void setN1(double n1) {
        this.n1 = n1;
    }

 
    
   // N2
    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    //R
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    //Métodos da Classe
    
    public void somar(){
       this.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Valor")));
       this.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Valor")));
       this.setR(this.getN1() + this.getN2());
       JOptionPane.showMessageDialog(null, "O Resultado dessa Operação é " +this.getR());
    }
    
    public void subtrair (double a, double b){
       this.setR(a-b);
       JOptionPane.showMessageDialog(null, "O Resultado dessa Operação é " +this.getR());
    }
    
    public double multiplicar(){
       this.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Valor")));
       this.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Valor")));
       this.setR(this.getN1() * this.getN2());
    
       return this.getR();

    }
    
    public double dividir(double a , double b){
        this.setR(a/b);
          return this.getR();
    
    }
    
}
