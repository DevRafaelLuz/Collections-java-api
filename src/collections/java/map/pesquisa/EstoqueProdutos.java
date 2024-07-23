package collections.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }
    
    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }
    
    public double calculaValorTotalEstoque() {
        double valorTotalEstoque = 0.0;
        
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        
        return valorTotalEstoque;
    }
    
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        
        return produtoMaisCaro;
    }
    
    public static void main(String[] args) {
        EstoqueProdutos estoqueProduto = new EstoqueProdutos();
        estoqueProduto.adicionarProduto(1, "Produto 1", 7, 5.45);
        estoqueProduto.adicionarProduto(2, "Produto 2", 4, 11.04);
        estoqueProduto.adicionarProduto(3, "Produto 3", 3, 24.1);
        estoqueProduto.adicionarProduto(4, "Produto 4", 8, 7.8);
        
        estoqueProduto.exibirProdutos();
        
        System.out.println("Valor total do estoque: R$ " + estoqueProduto.calculaValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProduto.obterProdutoMaisCaro());
    }
}
