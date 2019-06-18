package mercearia.trabalho.oo;

import java.util.Scanner;

public class Endereco extends Pessoa implements ExibirDados {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    
    // construtor
    public Endereco (){}
    
    public Endereco(String rua, int numero, String bairro, String cidade){
        this.rua=rua;
        this.numero=numero;
        this.bairro=bairro;
        this.cidade=cidade;
    }
    
    // get e set
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
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
        System.out.println("Rua : " +this.rua);
        System.out.println("Numero : " +this.numero);
        System.out.println("Cidade : " +this.cidade);
        System.out.println("Bairro: " +this.bairro);
        System.out.println("");
    }
    
     public void cadastrarEndereco(){
        Scanner entradaU = new Scanner(System.in);
        System.out.println("Digite o nome da RUA: ");
        this.rua = entradaU.nextLine();
        System.out.println("Digite o NUMERO da casa: ");
        this.numero = entradaU.nextInt();
        System.out.println("Digite o nome da CIDADE: ");
        this.cidade = entradaU.nextLine();
        System.out.println("Digite o nome do BAIRRO: ");
        this.bairro = entradaU.nextLine();
        System.out.println("");
           }
    
}
