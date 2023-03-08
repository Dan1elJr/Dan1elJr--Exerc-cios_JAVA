/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationstart;

/**
 *
 * @author Casal
 */
public class Profissional extends Pessoa{
    private String profissao;
    public Profissional(String nome, String telefone, String profissao) {
      super(nome, telefone);
      this.profissao = profissao;
    }
    @Override
    public void exibir() {
      super.exibir();
        // Chama o exibir de Pessoa, imprimindo nome e telefone
      System.out.println("\tTrabalha como "+profissao);
        // Complementa a informação acerca da profissão
    }
}
