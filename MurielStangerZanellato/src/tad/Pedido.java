
package tad;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import javax.swing.text.DateFormatter;


public class Pedido {
    
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    private int pedido;
    private double totalPreco;
    private int totalTempo;
    private List<Cardapio> itensCardapio;
    private LocalDateTime dataHoraPedido;

    public Pedido() {
        this.pedido = 1 + (int) (Math.random() * 2500);
        this.setTotalPreco(0);
        this.setTotalTempo(0);
        this.setDataHoraPedido(LocalDateTime.now());
        this.itensCardapio = new LinkedList<>();
    }

    
     
    public Pedido(double totalPreco, int totalTempo,  LocalDateTime dataHoraPedido) {
        this.setTotalPreco(totalPreco);
        this.setTotalTempo(totalTempo);
        this.setDataHoraPedido(dataHoraPedido);
    }

    public int getPedido() {
        return pedido;
    }
    
    
    public double getTotalPreco() {
        return this.totalPreco;
    }

    public int getTotalTempo() {
        return this.totalTempo;
    }

    public List<Cardapio> getItensCardapio() {
        return this.itensCardapio;
    }

    public LocalDateTime getDataHoraPedido() {
        return this.dataHoraPedido;
    }

  
    
    

    public void setTotalPreco(double totalPreco) {
        this.totalPreco = totalPreco;
    }

    public void setTotalTempo(int totalTempo) {
        this.totalTempo = totalTempo;
    }

    public void setItensCardapio(List<Cardapio> itensCardapio) {
        this.itensCardapio = itensCardapio;
    }

    public void setDataHoraPedido(LocalDateTime dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido == null?LocalDateTime.now():dataHoraPedido;
    }

     
    
    @Override
    public String toString() {
        return "Pedido " + this.pedido + " " + formato.format(this.dataHoraPedido)+" tempo para ficar pronto: " + this.totalTempo;
    }
    
    
    
    
}
