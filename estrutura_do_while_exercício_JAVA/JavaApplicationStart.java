/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationstart;

import java.util.Scanner;


/**
 *
 * @author Casal
 */
public class JavaApplicationStart {

    /**
     * @param args the command line arguments
     */
  
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int valor=0,soma = 0;
            do{
              System.out.print("Digite um numero (0 para sair):");
              valor = teclado.nextInt();
              soma += valor;
            } while(valor!=0);
            System.out.printf("\nA soma dos numeros "+"digitados e: %d\n",soma);
        }
}

