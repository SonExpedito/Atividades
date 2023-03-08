/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comparador;
import java.util.Scanner;
/**
 *
 * @author dti
 */
public class RealouFake {
    public static float numA,numB;
    public static Scanner teclado = new Scanner (System.in);
    
    public static void main (String [] args){
      System.out.println("Bem Vindo ao Diferente ou Igual");
      
      System.out.println("Por Favor Digite o Primeiro Número da Comparação");
      numA = teclado.nextFloat();
      System.out.println("Por Favor Digite o Segundo Número da Comparação");
      numB = teclado.nextFloat();
        
      if (numA==numB){
         System.out.println("Os Dois números são iguais");
      }
      else {
         if (numA>numB){
             System.out.println("Os Dois Números são diferentes, sendo o Primeiro Maior deles \n"
                     + "de Forma Decrescente ficam dessa forma");
             System.out.println(numA +", " +numB);
         }      
         else {
             System.out.println("Os Dois Números são diferentes, sendo o Segundo Maior deles \n"
                     + "de Forma Decrescente ficam dessa forma");
             System.out.println(numB +", " +numA);
             
         }     
         
         
      }
      
    }
    
}
