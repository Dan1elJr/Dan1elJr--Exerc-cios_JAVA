/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationstart;


/**
 *
 * @author Casal
 */
public class JavaApplicationStart {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // Calculo do valor médio da sequencia y = f(x) = x * x
        // Media = Somatorio dos valores / quantidade
        // Limites 1 a 5
        double soma=0.0;
        for(int x=1;x<=5;x++)
            soma+=Math.pow(x, 2);
          // eleva x a potência 2 e acumula
        System.out.println(soma/5);
      
    }
}

