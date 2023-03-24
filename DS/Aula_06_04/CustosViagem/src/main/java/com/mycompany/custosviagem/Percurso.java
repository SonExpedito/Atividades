/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.custosviagem;

import javax.swing.JOptionPane;

/**
 *
 * @author alexe
 */
public class Percurso {
    //Variáveis
    private double KmPerCorrido;
    private double valorCombustivel;
    private double ValorPedagio;
 
    
   //Construtores 
    public Percurso (){
      this(0,0,0);
    }
    
    public Percurso (double KmPerCorrido, double valorCombustivel, double ValorPedagio){
       this.KmPerCorrido= KmPerCorrido;
       this.valorCombustivel= valorCombustivel;
       this.ValorPedagio= ValorPedagio;
    }
    
    
    //Getters and Setters

    //KmPerCorrida
    public double getKmPerCorrido() {
        return KmPerCorrido;
    }


    public void setKmPerCorrido(double KmPerCorrido) {
        this.KmPerCorrido = KmPerCorrido;
    }

 //ValorCombustivel
    public double getValorCombustivel() {
        return valorCombustivel;
    }

    public void setValorCombustivel(double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }

  //ValorPedagio
    public double getValorPedagio() {
        return ValorPedagio;
    }


    public void setValorPedagio(double ValorPedagio) {
        this.ValorPedagio = ValorPedagio;
    }
    
    //Métodos
    
    public void cadastrarPercurso(){
     JOptionPane.showMessageDialog(null, "Cadastro Selecionado");
     this.setKmPerCorrido(Double.parseDouble(JOptionPane.showInputDialog("Insira a Quilometragem Percorrida")));
     this.setValorCombustivel(Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor do Combustível")));
     this.setValorPedagio(Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor do Pedágio")));
    
    }
      
    public void listarViagem(){
     JOptionPane.showMessageDialog(null, "Listagem Selecionada");
     JOptionPane.showMessageDialog(null, "Os Dados Cadastrados Foram"
             + "\n Quilometragem Percorrida : " +this.getKmPerCorrido() 
             + "\n Valor do Combustível: " +this.getValorCombustivel()
             + "\n Valor do Pedágio:  " +this.getValorPedagio());
    }    

    
}
