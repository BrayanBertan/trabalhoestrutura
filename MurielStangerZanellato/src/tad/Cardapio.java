
package tad;

public enum Cardapio {
    VI("VITAMINA",3.00,10),
    HA("HAMBURGUER",12.50,15),
    SU("SUCO",5.00,5),
    PI("PIZZA",25.00,20),
    TO("TORTA",22.50,90);
    
    
    private String nome;
    private double preco;
    private int tempoMinutos;

    private Cardapio(String nome, double preco, int tempoMinutos) {
        this.nome = nome;
        this.preco = preco;
        this.tempoMinutos = tempoMinutos;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getTempoMinutos() {
        return tempoMinutos;
    }

    @Override
    public String toString() {
        return this.nome + " R$" + this.getPreco() + " " + this.getTempoMinutos() + " Minutos";
    }
    
    
    
}
