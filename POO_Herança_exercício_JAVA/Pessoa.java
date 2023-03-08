/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplicationstart;

/**
 *
 * @author Casal
 */


   
    public class Pessoa {
        String nome;
        String telefone;
      
        Pessoa(String nome, String telefone){
            this.nome = nome;
            this.telefone = telefone;
        }  

        void exibir(){
         System.out.println(nome+"::"+telefone);
        } 
        void telefone(){
         System.out.println(telefone);
        } 
    }
            


