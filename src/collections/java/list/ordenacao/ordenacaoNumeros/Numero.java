package collections.java.api.list.ordenacao.ordenacaoNumeros;

import java.util.Comparator;

public class Numero implements Comparable<Numero> {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "" + numero;
    }

    @Override
    public int compareTo(Numero n) {
        return Integer.compare(numero, n.getNumero());
    }
}

class ComparatorPorDescendente implements Comparator<Numero> {
    @Override
    public int compare(Numero n1, Numero n2) {
        return Integer.compare(n2.getNumero(), n1.getNumero());
    }
    
}
