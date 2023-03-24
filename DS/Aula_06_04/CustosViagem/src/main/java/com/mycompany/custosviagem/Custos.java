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
public class Custos {
    private double totalPercurso;
    
    public Custos (){
      this(0);
    }
    public Custos (double totalPercurso){
      this.totalPercurso=totalPercurso;
    }
    
    
    //Getters e Setters

    public double getTotalPercurso() {
        return totalPercurso;
    }

    public void setTotalPercurso(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }
    
    //Métodos
    
    
    public void calcularViagem(Percurso Percuzin ){ //Nome DA Classe e o Apelido
        double CV = (Percuzin.getKmPerCorrido()* Percuzin.getValorCombustivel())+ Percuzin.getValorPedagio();
        JOptionPane.showMessageDialog(null, "O Valor da Viagem é de " +CV);
    }
    
}
