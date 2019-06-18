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
public class Endereco extends Pessoa {
    private String Rua;
    private String numero;
    private String bairro;
    private String cidade;

    // get e set
    public String getRua() {
        return Rua;
    }
    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    // metodos
    
    @Override
    public void ExibirDados(){
        System.out.println("Rua : " +this.Rua);
        System.out.println("Numero : " +this.numero);
        System.out.println("Cidade : " +this.cidade);
        System.out.println("Bairro: " +this.bairro);
        System.out.println("");
    }
    
    /**
     *
     */
    @Override
     public void cadastraEndereco(){
        Scanner entradaU = new Scanner(System.in);
        System.out.println("Digite o nome da RUA: ");
        this.Rua = entradaU.nextLine();
        System.out.println("Digite o NUMERO da casa: ");
        this.numero = entradaU.nextLine();
        System.out.println("Digite o nome da CIDADE: ");
        this.cidade = entradaU.nextLine();
        System.out.println("Digite o nome do BAIRRO: ");
        this.bairro = entradaU.nextLine();
        System.out.println("");
           }
    
}
