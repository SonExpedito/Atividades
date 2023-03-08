/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.media;
import java.util.Scanner;
/**
 *
 * @author dti
 */
public class Media {
    public static float Media,Nota, contador=1;
    public static String Nome;
    public static Scanner teclado = new Scanner (System.in);
    
    public static void main (String [] args){
        System.out.println("Bem Vindo ao NSA");
        System.out.println("Por favor digite o Nome do Aluno");
        Nome = teclado.nextLine();
        
        //Notas
        
        do{
        System.out.println("Por Favor digite a " +contador +"° nota do " +Nome);
        Nota= teclado.nextInt();
        Media = Media+Nota;
        contador++;
        }
        while (contador<=4);
        
        Media=Media/4;
        
        System.out.println("O Aluno " +Nome +" Teve " +Media +" de Média");
    }
}
