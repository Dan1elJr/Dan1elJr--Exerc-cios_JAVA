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
        public String getNome(){
        return nome;
        }
        public void setNome(String nome){
          this.nome = nome;
        }
        public String getTelefone(){
          return telefone;
        }
        public void setTelefone(String telefone){
          this.telefone = telefone;
        }
        private String nome;
        private String telefone;
      
       

        void exibir(){
         System.out.println(getNome()+"::"+getTelefone());
        } 
        
    }
            


