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
    Scanner s1 =new Scanner(System.in);
    System.out.println("DIGITE UM NÚMERO:");
    int x = s1.nextInt();
    if(x%2==0)
      System.out.println("O NÚMERO É PAR");
    else
      System.out.println("O NÚMERO É ÍMPAR");
  }
    
    
}
