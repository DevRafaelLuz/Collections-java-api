package collections.java.api.list.ordenacao.ordenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Numero> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }
    
    public void adicionarNumero(int numero) {
        listaNumeros.add(new Numero(numero));
    }
    
    public List<Numero> ordenarPorAscendente() {
        List<Numero> ordemAscendente = new ArrayList<>(listaNumeros);
        Collections.sort(ordemAscendente);
        
        return ordemAscendente;
    }
    
    public List<Numero> ordenarPorDescendente() {
        List<Numero> pessoasPorAltura = new ArrayList<>(listaNumeros);
        Collections.sort(pessoasPorAltura, new ComparatorPorDescendente());
        
        return pessoasPorAltura;
    }
    
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumero = new OrdenacaoNumeros();
        ordenacaoNumero.adicionarNumero(71);
        ordenacaoNumero.adicionarNumero(105);
        ordenacaoNumero.adicionarNumero(89);
        ordenacaoNumero.adicionarNumero(23);
        
        System.out.println(ordenacaoNumero.ordenarPorAscendente());
        System.out.println(ordenacaoNumero.ordenarPorDescendente());
    }
}