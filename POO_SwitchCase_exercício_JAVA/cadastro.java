/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.util.Scanner;

/**
 *
 * @author Casal
 */
public class cadastro {
    public static void main (String[]args){
        
        Scanner i= new Scanner(System.in);
        Out item = new Out();
        System.out.println("Digite 1 ou 2");
        int menu = i.nextInt();
        switch(menu){
            case 1:
              item.bomdia();
            break;
            case 2:
              item.nome();
            break;
            
        }
         
    }
}
