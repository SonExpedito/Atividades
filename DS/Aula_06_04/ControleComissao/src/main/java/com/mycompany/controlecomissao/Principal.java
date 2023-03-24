/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlecomissao;
import javax.swing.*;
/**
 *
 * @author alexe
 */
public class Principal {

    public static void main(String[] args) {
        Vendedor Vendedorzin = new Vendedor(); //Criando Objeto do Vendedor
        
        double SalarioFinal = 0;
        
       //Começo Do Código
        JOptionPane.showMessageDialog(null, "Bem Vindo a Calculadora de Salário e Comissão");
        double Valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número de Vendas"));
        
        SalarioFinal=Vendedorzin.calculoComissao(Valor);
        
        JOptionPane.showMessageDialog(null, "Seu Novo Salário é de " +SalarioFinal);
        
    }
}
