/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mediadealuno;
import javax.swing.JOptionPane;
/**
 *
 * @author alexe
 */
public class MediadeAluno {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem Vindo ao NSA");
        String Nome;
        float N1=1,N2=2,Media;
        Nome = JOptionPane.showInputDialog("Insira o Nome do Aluno");
        N1 = LerNota(N1);
        N2 = LerNota(N2);
        Media = calcularMedia(N1,N2);
        if (Media>=7){
        JOptionPane.showMessageDialog(null, "O Aluno " +Nome +" teve a Média de " +Media +" \n e Passou");
                
        }
        else{
          JOptionPane.showMessageDialog(null, "O Aluno " +Nome +" teve a Média de " +Media +" \n e Reprovou");
        }        
        
    }
    
    static float LerNota(float N){
        return Float.parseFloat(JOptionPane.showInputDialog("Digite a " +N +"° Nota do Aluno"));
    }
    
    static float calcularMedia(float n1, float n2){
      return (n1+n2)/2;
    }
}
