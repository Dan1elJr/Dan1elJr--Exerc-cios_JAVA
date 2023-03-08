/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplicationstart;

/**
 *
 * @author Casal
 */

public class exemplo010 {
    public static void main(String[] args) {
      // Instanciando e inicializando os objetos p1 e p2
      Profissional p1 = new Profissional("João","1111-1111","44\n");
      Profissional p2 = new Profissional("Maria","2222-2222","55\n");

      // Chamada ao método exibir em p1 e p2
      p1.ExibirProfissional();
      p2.ExibirProfissional();
    }
}

