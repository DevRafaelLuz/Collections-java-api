package collections.java.api.list.operacoesBasicas.carrinhoCompras;

public class Itens {
    private String nome;
    private double preco;
    private int quantidade;

    public Itens(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }    

    @Override
    public String toString() {
        return nome;
    }
}
