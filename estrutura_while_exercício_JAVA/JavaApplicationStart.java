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
            int[] x1 = {21, 32, 15, 27, 33, 17};
            int posicao = 0;
            int soma = 0;
            while(posicao< x1.length){
             // Enquanto for menor que o tamanho do vetor
                soma += x1[posicao];
                posicao++;
            }
            System.out.println(soma);
        }
}

