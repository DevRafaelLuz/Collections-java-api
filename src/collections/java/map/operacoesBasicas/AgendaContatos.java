package collections.java.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }
    
    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }
    
    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }
    
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        
        return numeroPorNome;
    }
    
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Maria", 123456789);
        agendaContatos.adicionarContato("José", 987654321);
        agendaContatos.adicionarContato("Felipe", 123456789);
        agendaContatos.adicionarContato("Maria", 654987321);
        agendaContatos.adicionarContato("Lucas", 654321987);
        
        agendaContatos.exibirContato();
        
        agendaContatos.removerContato("Lucas");
        agendaContatos.exibirContato();
        
        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Maria"));
    }
}
