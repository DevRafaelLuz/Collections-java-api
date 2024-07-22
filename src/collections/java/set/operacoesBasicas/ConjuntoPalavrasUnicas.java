package collections.java.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> setPalavras;

    public ConjuntoPalavrasUnicas() {
        this.setPalavras = new HashSet<>();
    }
    
    public void adicionarPalavra(String palavra) {
        setPalavras.add(new Palavra(palavra));
    }
    
    public void removerPalavra(String palavra) {
        Palavra palavraParaRemover = null;
        
        for (Palavra p : setPalavras) {
            if (p.getPalavras() == palavra) {
                palavraParaRemover = p;
                break;
            }
        }
        
        setPalavras.remove(palavraParaRemover);
    }
    
    public void verificarPalavra(String palavra) {
        for (Palavra p : setPalavras) {
            if (p.getPalavras() == palavra) {
                System.out.println("Palavra " + palavra + " está presente no conjunto");
                break;
            }
        }
    }
    
    public void exibirPalavrasUnicas() {
        System.out.println(setPalavras);
    }
    
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();
        palavrasUnicas.adicionarPalavra("Java");
        palavrasUnicas.adicionarPalavra("JavaScript");
        palavrasUnicas.adicionarPalavra("C");
        palavrasUnicas.adicionarPalavra("Java");
        
        palavrasUnicas.verificarPalavra("C");
        
        palavrasUnicas.removerPalavra("JavaScript");
        
        palavrasUnicas.exibirPalavrasUnicas();
    }
}
