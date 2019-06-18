package mercearia.trabalho.oo;

/**
 *
 * @author matheus
 */
public abstract class Produto implements ExibirDados {
    protected int idProduto;
    protected String nome;
    protected String descricao;
    protected double valor;
    protected int quantidade;
    
    //construtor
    public Produto(){  
    }
    
    public Produto(int idProduto, String nome, String descricao, double valor, int quantidade) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    
    //Métodos get e set
    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        if(idProduto > 0){
            this.idProduto = idProduto;
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        if(valor>0){
            this.valor = valor;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        if(quantidade > 0){
            this.quantidade = quantidade;
        }
    }
    
    // metodos

    /**
     *
     */
    @Override
    public void ExibirDados(){
        System.out.println("ID do produto : " +this.idProduto);
        System.out.println("Nome do produto : " +this.nome);
        System.out.println("Descricao do produto : " +this.descricao);
        System.out.println("Valor do produto : " +this.valor);
        System.out.println("Quantidade do produto :" +this.quantidade);
        System.out.println("");
    }
    
}

