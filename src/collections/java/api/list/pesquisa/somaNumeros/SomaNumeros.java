package collections.java.api.list.pesquisa.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numeros> listaNumerosInteiros;

    public SomaNumeros() {
        this.listaNumerosInteiros = new ArrayList<>();
    }
    
    public void adicionarNumero(int numero) {
        listaNumerosInteiros.add(new Numeros(numero));
    }
    
    public int calcularSoma() {
        int resultado = 0;
        
        for (Numeros n : listaNumerosInteiros) {
            resultado += n.getNumeros();
        }
        
        return resultado;
    }
    
    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        
        for (Numeros n : listaNumerosInteiros) {
            if (n.getNumeros() > maiorNumero) {
                maiorNumero = n.getNumeros();
            }
        }
        
        return maiorNumero;
    }
    
    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        
        for (Numeros n : listaNumerosInteiros) {
            if (n.getNumeros() < menorNumero) {
                menorNumero = n.getNumeros();
            }
        }
        
        return menorNumero;
    }
    
    public void exibirNumeros() {
        System.out.println(listaNumerosInteiros);
    }
    
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(158);
        somaNumeros.adicionarNumero(278);
        somaNumeros.adicionarNumero(73);
        
        int resultadoSoma = somaNumeros.calcularSoma();
        System.out.println("Soma dos números: " + resultadoSoma);
        
        int maiorNumero = somaNumeros.encontrarMaiorNumero();
        int menorNumero = somaNumeros.encontrarMenorNumero();
        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Menor número: " + menorNumero);
        
        somaNumeros.exibirNumeros();
    }
}
