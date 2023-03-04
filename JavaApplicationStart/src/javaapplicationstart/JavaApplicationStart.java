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
    int a = 5, b = 32, c = 7;
    System.out.printf("A: %d\t B: %d\t C:%d\n",a,b,c);
    b = b - c;
    b /= a;
    System.out.printf("A: %d\t B: %d\t C:%d\n",a,b,c);
    b = a ^ c;
    System.out.printf("A: %d\t B: %d\t C:%d\n",a,b,c);
    b++;
    System.out.printf("A: %d\t B: %d\t C:%d\n",a,b,c);
    }
    
    
}
