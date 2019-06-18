/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercearia.trabalho.oo;
import java.util.Scanner;

/**
 *
 * @author Gabriel Lopes
 */
public class Higiene extends Produto{
   private String tipo;
   
   // construtores
   public Higiene(){}
   
   public Higiene(String tipo){
       this.tipo=tipo;
   }
   
   // get e set
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
    // metodos
   @Override
    public void ExibirDados(){
        System.out.println("Tipo do produto : " +this.tipo);
    }
    
    public void cadastrarTipo(){
        Scanner entradaU = new Scanner(System.in);
        System.out.println("Digite o TIPO do produto ( P - higiene PESSOAL / NP - higiene NAO PESSOAL ) : ");
        this.tipo = entradaU.nextLine();
    }
  
}
