/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.menu;
import javax.swing.JOptionPane;
/**
 *
 * @author alexe
 */
public class Menu {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem Vindo ao Menu de Operações");
        int escolha;
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Operação: \n"
                + "1–Soma \n"
                + "2–Subtração \n"
                + "3–Divisão \n"
                + "4–Multiplicação \n"
                + "5–Resto da Divisão \n"
                + "6–Dobro \n"
                + "7–Quadrado \n"
                + "8–Cubo \n"
                + "9–Raiz Quadrada \n"
                + "0–Sair"));
        switch (escolha){
            case 1:
              Soma();    
            break;
            
            case 2:
              Subtração();    
            break;
            
            case 3:
              Divisão();    
            break;
            
            case 4:
              Multiplicacao();    
            break;
            
            case 5:
              RestDiv();    
            break;
            
            case 6:
              Dobro();    
            break;
            
            case 7:
              Quadrado();    
            break;
            
            case 8:
              Cubo();    
            break;
            
            case 9:
              Raiz();    
            break;
             
            default:
             JOptionPane.showMessageDialog(null, "O Valor insirido não possui nenhum remetente, por favor tente novamente");
             System.exit(0);
            break;
        }
    }
    static void Soma(){
        JOptionPane.showMessageDialog(null, "A Operação Selecionada foi Soma");
       float a,b;
        a = Float.parseFloat(JOptionPane.showInputDialog("Digite o Primeiro valor"));
        b = Float.parseFloat(JOptionPane.showInputDialog("Digite o Segundo valor"));
        a= a+b;
        JOptionPane.showMessageDialog(null, "O Resultado dessa Operação é " +a);
    }
    
    static void Subtração(){
      JOptionPane.showMessageDialog(null, "A Operação Selecionada foi Subtração");
      float a,b;
        a = Float.parseFloat(JOptionPane.showInputDialog("Digite o Minuendo valor"));
        b = Float.parseFloat(JOptionPane.showInputDialog("Digite o Subtraendo valor"));
        a= a-b;
        JOptionPane.showMessageDialog(null, "O Resultado dessa Operação é " +a);
    }
    
    static void Divisão(){
       JOptionPane.showMessageDialog(null, "A Operação Selecionada foi Divisão");
       float a,b;
       a = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Dividendo"));
       b = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Divisor"));
       a= a/b;
       JOptionPane.showMessageDialog(null, "O Resultado dessa Operação é " +a);
    }
    
     static void Multiplicacao(){
       JOptionPane.showMessageDialog(null, "A Operação Selecionada foi Multiplicação");
       float a,b;
       a = Float.parseFloat(JOptionPane.showInputDialog("Digite o Primeiro Fator"));
       b = Float.parseFloat(JOptionPane.showInputDialog("Digite o Segundo Fator"));
       a= a*b;
       JOptionPane.showMessageDialog(null, "O Resultado dessa Operação é " +a);
    }
     
     static void RestDiv(){
         JOptionPane.showMessageDialog(null, "A Operação selecionada foi Divisão com Resto");
         float a,b;
         a = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Dividendo"));
         b = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Divisor"));
         a= a%b;
         JOptionPane.showMessageDialog(null, "O Resto dessa Operação é " +a);
     }
     
     static void Dobro(){
         JOptionPane.showMessageDialog(null, "A Operação selecionada foi Dobro");
         float a;
         a = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que será utilizado"));
         a= a*2;
         JOptionPane.showMessageDialog(null, "O Dobro do valor inserido é  " +a);
     }
     
      static void Quadrado(){
         JOptionPane.showMessageDialog(null, "A Operação selecionada foi o Quadrado");
         float a;
         a = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que será utilizado"));
         a= a*a;
         JOptionPane.showMessageDialog(null, "O Quadrado do valor inserido é  " +a);
     }
      
           
      static void Cubo(){
         JOptionPane.showMessageDialog(null, "A Operação selecionada foi o Cubo");
         float a;
         a = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que será utilizado"));
         a= a*a*a;
         JOptionPane.showMessageDialog(null, "O Cubo do valor inserido é  " +a);
     }
     
     static void Raiz(){
         JOptionPane.showMessageDialog(null, "A Operação selecionada foi Raiz Quadrada");
         double a;
         a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que será utilizado"));
         a= Math.sqrt(a);
         JOptionPane.showMessageDialog(null, "A Raíz Quadrada do valor inserido é  " +a);
     }
    
}
