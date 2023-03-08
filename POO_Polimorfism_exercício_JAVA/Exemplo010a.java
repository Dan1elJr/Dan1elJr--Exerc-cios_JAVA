/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationstart;

/**
 *
 * @author Casal
 */
public class Exemplo010a {
    public static void main(String[] args) {
        Pessoa[] pessoas = {new Pessoa("Joao","1111-1111"),
        new Pessoa("Maria","2222-2222"),
        new Profissional("Luiz","3333-3333","Advogado")};
        for(int i=0; i< 3; i++)
        pessoas[i].exibir();
  }
}
