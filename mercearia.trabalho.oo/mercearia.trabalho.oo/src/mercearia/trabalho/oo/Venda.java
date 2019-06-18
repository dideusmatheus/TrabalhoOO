package mercearia.trabalho.oo;

/**
 *
 * @author matheus
 */
public class Venda {
    protected int idProduto;
    protected String nome;
    protected String descricao;
    protected double valor;
    protected int quantidade;
        
    // construtor
    public Venda(){}
    
    public Venda(String nome, double valor, int quantidade , int idProduto){
        this.idProduto=idProduto;
        this.nome=nome;
        this.quantidade=quantidade;
        this.valor=valor;
    }
    
    // set 
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setValor(double valor){
        if(valor>0){
            this.valor=valor;
        }
    }
    public void setQuantidade(int quantidade){
        if(quantidade>0){
            this.quantidade=quantidade;
        }
    }
    
    public void setidProduto(int idProduto){
        if(idProduto>0){
            this.idProduto=idProduto;
        }
    }
    
    //get
    
    public String getNome(){
        return this.nome;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public int getidProduto(){
        return this.idProduto;
    }
    
    // metodos
    
    public void Consulta(){
        System.out.println("Nome produto: "+this.nome);
        System.out.println("Quantidade: "+this.quantidade);
        System.out.println("Descricao do produto: "+this.descricao);
        System.out.println("Valor do produto: "+this.valor); 
    }
    
    public void Vender(String nome, int quantidade){
        if(this.idProduto == idProduto){
        this.quantidade=this.quantidade-quantidade;
        }
    }
}
