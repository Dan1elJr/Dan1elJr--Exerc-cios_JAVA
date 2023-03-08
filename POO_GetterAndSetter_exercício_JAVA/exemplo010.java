/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplicationstart;

import java.util.Scanner;

/**
 *
 * @author Casal
 */

public class exemplo010 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      String a;
      a=sc.next();
      // Instanciando e inicializando os objetos p1 e p2
      Pessoa p1 = new Pessoa();
      Pessoa p2 = new Pessoa();
      p1.setTelefone(a);
      p1.setNome(a);
      p2.setTelefone(a);
      p2.setNome(a);
      // Chamada ao método exibir em p1 e p2
      p1.exibir();
      p2.exibir();
    }
}

