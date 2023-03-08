/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pesoideal;
import javax.swing.JOptionPane;
/**
 *
 * @author alexe
 */
public class PesoIdeal {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem Vindo a Calculadora de Peso Ideal");
        String Sexo;
        double altura, pesoideal=0;
        Sexo = JOptionPane.showInputDialog("Informe o seu Gênero (Digite Homem ou Mulher)");
        altura = Float.parseFloat(JOptionPane.showInputDialog("Por Favor informe sua altura (utilize ,)"));
        pesoideal = calcularPesoIdeal(Sexo, altura, pesoideal);
        if (pesoideal!= 0){
        JOptionPane.showMessageDialog(null, "O Seu Peso ideal é de "  +pesoideal);
        }
        else{
        JOptionPane.showMessageDialog(null, "O Gênero não foi digitado corretamente");
        }
    }
    
    static double calcularPesoIdeal(String Sex, double h, double pid){
         if (Sex.equals("Homem") || Sex.equals("homem")){
              return (72.7*h)-58;
         }
         else{
            if (Sex.equals("Mulher") || Sex.equals("mulher")){ 
            return (62.1*h)-44.7;
            }
            else{
             return 0;
            }
            
         }
         
     
    }
}
