package collections.java.api.list.ordenacao.ordenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoa;

    public OrdenacaoPessoas() {
        this.listaPessoa = new ArrayList<>();
    }
    
    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }
    
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoa);
        Collections.sort(pessoasPorIdade);
        
        return pessoasPorIdade;
    }
    
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoa);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        
        return pessoasPorAltura;
    }
    
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();
        ordenacaoPessoa.adicionarPessoa("Ana", 25, 1.61);
        ordenacaoPessoa.adicionarPessoa("Pedro", 59, 1.75);
        ordenacaoPessoa.adicionarPessoa("Luiz", 38, 1.87);
        ordenacaoPessoa.adicionarPessoa("Maria", 79, 1.56);
        
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
