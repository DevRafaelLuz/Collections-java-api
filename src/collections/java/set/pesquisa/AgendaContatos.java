package collections.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> setContatos;

    public AgendaContatos() {
        this.setContatos = new HashSet<>();
    }
    
    public void adicionarContato(String nome, int numero) {
        setContatos.add(new Contato(nome, numero));
    }
    
    public void exibirContatos() {
        System.out.println(setContatos);
    }
    
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        
        for (Contato c : setContatos) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        
        return contatosPorNome;
    }
    
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        
        for (Contato c : setContatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        
        return contatoAtualizado;
    }
    
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Rafael", 123456789);
        agendaContatos.adicionarContato("Larisa", 987654321);
        agendaContatos.adicionarContato("Bruno", 456987321);
        agendaContatos.adicionarContato("Rafael Santos", 123789456);
        
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Rafael"));
        
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Larisa", 987321654));
        agendaContatos.exibirContatos();
    }
}
