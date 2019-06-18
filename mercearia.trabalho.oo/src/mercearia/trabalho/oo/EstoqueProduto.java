
package mercearia.trabalho.oo;

/**
 *
 * @author Gabriel Lopes
 */
public class EstoqueProduto extends Venda{
    protected Venda venda;
    public void vendido (){
        if(this.idProduto == idProduto){
        this.quantidade=this.quantidade-quantidade;
        }
    }
}
