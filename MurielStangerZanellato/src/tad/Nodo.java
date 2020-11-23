
package tad;

public class Nodo {
    private Pedido pedido;
    private Nodo anterior;
    private Nodo proximo;    
    //
    public Nodo(Pedido pedido){
        this.setPedido(pedido);
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
  

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }    
    public void setProximo(Nodo proximo){
        this.proximo = proximo;
    }

    public Pedido getPedido() {
        return pedido;
    }
  
    public Nodo getProximo(){
        return this.proximo;
    }
    public Nodo getAnterior() {
        return anterior;
    }
}
