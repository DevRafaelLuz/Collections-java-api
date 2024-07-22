package collections.java.api.list.operacoesBasicas.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Itens> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItens.add(new Itens(nome, preco, quantidade));
    }
    
    public void removerItem(String nome) {
        List<Itens> itemParaRemover = new ArrayList<>();
        
        for (Itens i : listaItens) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(i);
            }
        }
        
        listaItens.removeAll(itemParaRemover);
    }
    
    public double calcularValorTotal() {
        double totalCarrinho = 0.0;
        
        for (Itens i : listaItens) {
            totalCarrinho += (i.getPreco() * i.getQuantidade());
        }
        
        return totalCarrinho;
    }
    
    public void exibirItens() {
        System.out.println(listaItens);
    }
    
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Arroz", 20.0, 2);
        carrinhoDeCompras.adicionarItem("Feijão", 15.0, 3);
        carrinhoDeCompras.adicionarItem("Suco", 10.0, 1);
        
        double valorTotal = carrinhoDeCompras.calcularValorTotal();
        System.out.println("Valor total: " + valorTotal);
        
        carrinhoDeCompras.removerItem("Arroz");
        
        carrinhoDeCompras.exibirItens();
    }
}
