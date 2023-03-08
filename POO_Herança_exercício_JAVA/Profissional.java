/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationstart;

/**
 *
 * @author Casal
 */
public class Profissional extends Pessoa {
    String profissao;
    
    Profissional(String nome, String telefone, String profissao) {
    super(nome, telefone);
    this.profissao = profissao;
  }
    void ExibirProfissional(){
        System.out.printf("%s-%s-%s",nome,telefone,profissao);
    }
}
