package mercearia.trabalho.oo;

import java.util.Scanner;

public abstract class Pessoa implements ExibirDados {
    protected String nome;
    protected int idade;
    protected double cpf;
    protected Endereco end;

    // construtores
    public Pessoa(){}
    
    public Pessoa(String nome, int idade, double cpf, Endereco end){
        this.nome=nome;
        this.idade=idade;
        this.cpf=cpf;
        this.end=end;
    }
    
    // get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getCpf() {
        return cpf;
    }
    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public Endereco getEnd() {
        return end;
    }
    public void setEnd(Endereco end) {
        this.end = end;
    }

    // metodos

    /**
     *
     */
    
    @Override
    public void ExibirDados(){
        System.out.println("Nome : " +this.nome);
        System.out.println("Idade : " +this.idade);
        System.out.println("CPF : " +this.cpf);
        System.out.println("Endereco : " +this.end);
        System.out.println("");
    }
    
    public void cadastrarPessoa(){
        Scanner entradaU = new Scanner(System.in);
        System.out.println("Digite o NOME : ");
        this.nome = entradaU.nextLine();
        System.out.println("Digite sua IDADE : ");
        this.idade = entradaU.nextInt();
        System.out.println("Digite o CPF : ");
        this.cpf = entradaU.nextDouble();
        System.out.println("Digite o nome do BAIRRO : ");
        this.end.cadastrarEndereco();
        System.out.println("");
    }
}
