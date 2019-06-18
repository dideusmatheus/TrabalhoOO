package mercearia.trabalho.oo;

/**
 *
 * @author matheus
 */
public class Venda extends Cliente {
    protected Cliente cliente;
    private double valor;
    private double quantidade;
    
    // construtores
    public Venda(){}
    
    public Venda(Cliente cliente, double valor, double quantidade){
        this.cliente=cliente;
        this.valor=valor;
        this.quantidade=quantidade;
    }

    
    //get e set
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
    // metodos
    
    public void ValorTotal(){
        double valorTotal;
        
        valorTotal=
    }
    
    
}
