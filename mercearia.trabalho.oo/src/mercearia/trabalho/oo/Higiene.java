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
    private boolean pessoal;

    public boolean isPessoal() {
        return pessoal;
    }
    public void setPessoal(boolean pessoal) {
        this.pessoal = pessoal;
    }
    
    
    public void cadastraProdutoHig(){
        Scanner entradaU = new Scanner(System.in);
        System.out.println("digite o nome do produto que deseja cadastrar: ");
        nome = entradaU.nextLine();
        System.out.println("digite o codigo deste produto: ");
        idProduto = entradaU.nextInt();
        System.out.println("digite a descricao deste produto: ");
        descricao = entradaU.nextLine();
        System.out.println("digite o valor deste produto: ");
        valor = entradaU.nextDouble();
        System.out.println("digite a quantidade comprada deste produto: ");
        quantidade = entradaU.nextInt();
        System.out.println("produto é de higiene pessoal? ");
        pessoal = entradaU.nextBoolean();
    }
}
