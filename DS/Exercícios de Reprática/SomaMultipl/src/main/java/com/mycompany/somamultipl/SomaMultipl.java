/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.somamultipl;
/**
 *
 * @author dti
 */


public class SomaMultipl {
    public static int impar,par;
    
    public static void main (String [] args){
      System.out.println("Bem Vindo ao Soma e Multiplicação");
      
      for (int cont=0; cont<=30;cont++){
         if(cont %2 != 0){
           impar = impar+cont;
           
           System.out.println(impar +" + " +cont +" = " +impar);
         }
         
          System.out.println("Multiplicação dos Números Pares");
         
         if (cont %2 == 0){
           par=par*cont;
           System.out.println(par +" X " +cont +" = " +par);
         }
             
      }
          
          
    
    }
}
