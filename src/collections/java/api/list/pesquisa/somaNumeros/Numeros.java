package collections.java.api.list.pesquisa.somaNumeros;

public class Numeros {
    private int numeros;

    public Numeros(int numeros) {
        this.numeros = numeros;
    }

    public int getNumeros() {
        return numeros;
    }

    @Override
    public String toString() {
        return "" + numeros;
    }
}
