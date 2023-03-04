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
        Scanner sc= new Scanner (System.in);
        System.out.println("Digite a sua idade");
        int a= sc.nextInt();
        
        if(a>=18)
            System.out.println("entrada liberada");
        else
            System.out.println("entrada negada");
       
    }
    
    
}
