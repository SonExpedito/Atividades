/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundaquestao;
import java.util.Scanner;
/**
 *
 * @author dti
 */
public class NumeroDecrescente {
    public static int Number;
    public static Scanner teclado = new Scanner (System.in);
    
    public static void main (String [] args){
        System.out.println("Bem Vindo ao Redutor de Números");
        System.out.println("Por Favor Insira o Número que será reduzido");
        Number = teclado.nextInt();
        
        while (Number>0){
            Number--;
            System.out.println(Number +" ");
        }  
    
    }
}
