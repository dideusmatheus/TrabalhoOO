/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercearia.trabalho.oo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gabriel Lopes
 */
public class Cliente extends Pessoa {
    protected Pessoa pessoa;
    private int id_pessoa;
    private int i;
    private boolean l;

    // get e set
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

   // metodos
    
    public void ExibirDados(){
        System.out.println("ID : " +this.id_pessoa);
        System.out.println("");
    }
    
    public void cadastraEndereco(){
        Scanner entradaU = new Scanner(System.in);
        System.out.println("Digite o ID do cliente: ");
        do{
            try{
            i = entradaU.nextInt();
            l = false;
            }
            catch(InputMismatchException e){
                System.out.println("O seu ID deverá ser um número inteiro.");
                entradaU.nextLine();
            }
            
        }while(l);

           }
    
}
