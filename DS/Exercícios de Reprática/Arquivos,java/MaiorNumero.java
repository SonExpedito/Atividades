/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class MaiorNumero {
    public static int num1,num2;
     public static Scanner teclado = new Scanner (System.in);
     
    public static void main (String [] args){
       System.out.println("Bem Vindo ao Comparador de Números");
       //Entrada de Dados
       System.out.println("Insira o Primeiro Número da Comparação");
       num1 = teclado.nextInt();
       System.out.println("Insira o Segundo Número da Comparação");
       num2 = teclado.nextInt();
       
       //Lógica
       if (num1>num2){
           System.out.println("O Maior número inserido é o " +num1);
           
       }
       else {
            System.out.println("O Maior número inserido é o " +num2);
    
        }
       
 
    }
}
