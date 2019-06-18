
package mercearia.trabalho.oo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gabriel Lopes
 */
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected int cpf;
    protected Endereco end;
    boolean l;

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
        this.cpf = (int) cpf;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    // metodos
    
    public void ExibirDados(){
        System.out.println("Nome : " +this.nome);
        System.out.println("Idade : " +this.idade);
        System.out.println("CPF : " +this.cpf);
        System.out.println("Endereco : " +this.end);
        System.out.println("");
    }
    
    public void cadastraEndereco(){
        Scanner entradaU = new Scanner(System.in);
        System.out.println("Digite o NOME : ");
        this.nome = entradaU.nextLine();
        System.out.println("Digite sua IDADE : ");
        do{
            try{
            this.idade = entradaU.nextInt();
            l = false;
            }
            catch(InputMismatchException e){
                System.out.println("Sua idade deverá ser um número inteiro!");
                entradaU.nextLine();
            }
            
        }while(l);
        
        System.out.println("Digite o CPF (Somente números): ");
        do{
            try{
            this.cpf = entradaU.nextInt();
            l = false;
            }
            catch(InputMismatchException e){
                System.out.println("Seu CPF deverá ser um número inteiro!");
                entradaU.nextLine();
            }
            
        }while(l);
        
        System.out.println("Digite o nome do BAIRRO : ");
        this.end.cadastraEndereco();
        System.out.println("");
    }
}
