package collections.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    
    public void adicionarProduto(int cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }
    
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        
        return produtosPorNome;
    }
    
    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        
        return produtosPorPreco;
    }
    
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1, "Produto 3", 15.5, 4);
        cadastroProdutos.adicionarProduto(2, "Produto 1", 23.4, 2);
        cadastroProdutos.adicionarProduto(3, "Produto 2", 9.9, 5);
        cadastroProdutos.adicionarProduto(4, "Produto 4", 30.1, 1);
        
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        
        System.out.println(cadastroProdutos.exibirProdutoPorPreco());
    }
}