package collections.java.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> setConvidados;

    public ConjuntoConvidados() {
        this.setConvidados = new HashSet<>();
    }
    
    public void adicionarConvidado(String nome, int codigoConvite) {
        setConvidados.add(new Convidado(nome, codigoConvite));
    }
    
    public void removerConvidadoPorCodidoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        
        for (Convidado c : setConvidados) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        
        setConvidados.remove(convidadoParaRemover);
    }
    
    public int contarConvidados() {
        return setConvidados.size();
    }
    
    public void exibirConvidados() {
        System.out.println(setConvidados);
    }
    
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Há " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");
    
        conjuntoConvidados.adicionarConvidado("Mario", 123);
        conjuntoConvidados.adicionarConvidado("Julia", 456);
        conjuntoConvidados.adicionarConvidado("Jack", 456);
        conjuntoConvidados.adicionarConvidado("Paulo", 789);
        System.out.println("Há " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");
        
        conjuntoConvidados.exibirConvidados();
        
        conjuntoConvidados.removerConvidadoPorCodidoConvite(789);
        System.out.println("Há " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");
    }
}
