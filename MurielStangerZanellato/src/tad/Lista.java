
package tad;


public class Lista {
    
    private Nodo primeiro;
    private Nodo ultimo;
    
    public Lista(){
        this.inicializa();
    }  
    
    public Nodo getPrimeiro(){
        return this.primeiro;
    }
    
    public Nodo getUltimo(){
        return this.ultimo;
    }    
    
    public void inicializa(){
        this.primeiro = null;
        this.ultimo   = null;
    }
    
    public boolean estaVazia(){
        return this.primeiro == null;
    }    
    
     public void insereUltimoPedido(Pedido pedido){
         
        Nodo nodo = new Nodo(pedido);
        
        if (this.estaVazia()){
            this.primeiro = nodo;
            this.ultimo   = nodo;
            nodo.setProximo(null);
            nodo.setAnterior(null);
            return;
        }
        
        nodo.setProximo(this.ultimo);
        nodo.setAnterior(null);
        this.ultimo.setAnterior(nodo);
        this.ultimo = nodo;
    }  
     
      public void inserePrimeiroPedido(Pedido pedido){
          
        Nodo nodo = new Nodo(pedido);
        
        if (this.estaVazia()){
            this.primeiro = nodo;
            this.ultimo   = nodo;
            nodo.setProximo(null);
            nodo.setAnterior(null);
            return;
        }
        
        nodo.setAnterior(this.primeiro);
        nodo.setProximo(null);
        this.primeiro.setProximo(nodo);
        this.primeiro = nodo;        
    }  
      
     
      public void insereOrdenado(Pedido pedido){
        if (estaVazia()){
            this.insereUltimoPedido(pedido);
            return;
        }
        
        Nodo nodo = new Nodo(pedido);
        
        if(nodo.getPedido().getTotalTempo() >= this.ultimo.getPedido().getTotalTempo()) {
            this.insereUltimoPedido(pedido);
            return;
        }
        
          if(nodo.getPedido().getTotalTempo() < this.primeiro.getPedido().getTotalTempo()) {
            this.inserePrimeiroPedido(pedido);
            return;
        }
          Nodo atual = this.ultimo.getProximo();
          
          
          
          while (nodo.getPedido().getTotalTempo() < atual.getPedido().getTotalTempo() ) {
              System.out.println(atual.getPedido().getPedido());
              atual = atual.getProximo();
          }
        
        nodo.setAnterior(atual.getAnterior());
        nodo.setProximo(atual);
        atual.setAnterior(nodo);
        nodo.getAnterior().setProximo(nodo);
        
        
    } 
      
       public boolean removeInicio(){
        if (estaVazia()){
            return false;
        }
        
        if (this.primeiro == this.ultimo){
            this.inicializa();
            System.gc();
            return true;
        }
        
        this.primeiro = this.primeiro.getAnterior();
        this.primeiro.setProximo(null);
        System.gc();
        return true;
    }
}
