/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocanumero;
import java.util.Scanner;
/**
 *
 * @author dti
 */
public class TrocaNumero {
    public static Scanner teclado = new Scanner (System.in);
    public static float numA,numB,suporte;
    
    public static void main (String  [] args){
        System.out.println("Bem Vindo  a troca de Números");
        System.out.println("Para informaçaõ o Primeiro será conhecido como A, e o Segundo como B");
        System.out.println("Insira o Primeiro Número para a mudança");
        numA = teclado.nextFloat();
        
        System.out.println("Insira o Segundo Número para a mudança");
        numB = teclado.nextFloat();
        suporte = numA;
        
        System.out.println("Os Números estão dessa forma \n" 
                + "numA = \n" +numA +
                "numB = " +numB);
        
        //Troca
        numA= numB;
        numB= suporte;
        //Saída
        
          System.out.println("Os Números ficarão dessa forma \n" 
                + "numA = " +numA +
                "\n numB = " +numB);
        
        
        
    }
}
