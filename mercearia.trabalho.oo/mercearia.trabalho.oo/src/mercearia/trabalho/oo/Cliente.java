package mercearia.trabalho.oo;

import java.util.Scanner;

public class Cliente extends Pessoa implements ExibirDados {
    protected Pessoa pessoa;
    private int id_pessoa;
    
    // construtores
    public Cliente(){}
    
    public Cliente(Pessoa pessoa, int id_pessoa){
        this.pessoa=pessoa;
        this.id_pessoa=id_pessoa;
    }

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
    @Override
    public void ExibirDados(){
        System.out.println("ID : " +this.id_pessoa);
        System.out.println("");
    }
    
    /**
     *
     */
    public void cadastrarCliente(){
        Scanner entradaU = new Scanner(System.in);
        System.out.println("Digite o ID do cliente: ");
        this.id_pessoa = entradaU.nextInt();
        System.out.println("");
           }
    
}
