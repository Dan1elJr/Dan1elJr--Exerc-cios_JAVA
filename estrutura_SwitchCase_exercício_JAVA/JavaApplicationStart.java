/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationstart;
import java.util.GregorianCalendar;
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
       Scanner s1 = new Scanner(System.in);
       System.out.println("DIGITE O DIA ATUAL");
       int d = s1.nextInt();
       System.out.println("DIGITE O MÊS ATUAL:");
       int m = s1.nextInt();
       System.out.println("DIGITE O ANO ATUAL:");
       int a = s1.nextInt();
       GregorianCalendar g1 = new GregorianCalendar(a,m-1,d);
       switch(g1.get(GregorianCalendar.DAY_OF_WEEK)){
           case 1:
              System.out.println("DOMINGO! FERIADO! :)");
              break;
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
              System.out.println("DIA ÚTIL! TRABALHANDO. :(");
              break;
           case 7:
              System.out.println("SÁBADO! FERIADO! :)");
              break;
           default :
              System.out.println("ALGO ESTÁ ERRADO....");
              break;
               
       }
    
   }
}
