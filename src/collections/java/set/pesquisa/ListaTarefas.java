package collections.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> setTarefa;

    public ListaTarefas() {
        this.setTarefa = new HashSet<>();
    }
    
    public void adicionarTarefa(String descricao) {
        setTarefa.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao) {
        for (Tarefa t : setTarefa) {
            if (t.getDescricao() == descricao) {
                setTarefa.remove(t);
            }
        }
    }
    
    public void exibirTarefas() {
        System.out.println(setTarefa);
    }
    
    public void contarTarefas() {
        System.out.println("Total de tarefas: " + setTarefa.size());
    }
    
    public void obterTarefasConcluidas() {
        for (Tarefa t : setTarefa) {
            if (t.isConclusao() == true) {
                System.out.println("Tarefa concluída: " + t.getDescricao());
            }
        }
    }
    
    public void obterTarefasPendentes() {
        for (Tarefa t : setTarefa) {
            if (t.isConclusao() == false) {
                System.out.println("Tarefa pendente: " + t.getDescricao());
            }
        }
    }
    
    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : setTarefa) {
            if (t.getDescricao() == descricao) {
                t.setConclusao(true);
            }
        }
    }
    
    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : setTarefa) {
            if (t.getDescricao() == descricao) {
                t.setConclusao(false);
            }
        }
    }
    
    public void limparListaTarefas() {
        Set<Tarefa> tarefasParaRemover = new HashSet<>();
        
        for (Tarefa t : setTarefa) {            
            tarefasParaRemover.add(t);            
        }
        
        setTarefa.removeAll(tarefasParaRemover);
    }
    
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Limpar casa");
        listaTarefas.adicionarTarefa("Lavar o carro");
        listaTarefas.adicionarTarefa("Fazer o almoço");
        listaTarefas.adicionarTarefa("Codar");
        
        listaTarefas.exibirTarefas();
        
        listaTarefas.contarTarefas();
        
        listaTarefas.removerTarefa("Limpar casa");
        
        listaTarefas.exibirTarefas();
        
        listaTarefas.marcarTarefaConcluida("Lavar o carro");
        listaTarefas.marcarTarefaConcluida("Codar");
        
        listaTarefas.obterTarefasConcluidas();
        listaTarefas.obterTarefasPendentes();
        
        listaTarefas.marcarTarefaPendente("Codar");
        
        listaTarefas.exibirTarefas();
        
       listaTarefas.limparListaTarefas();
        
        listaTarefas.exibirTarefas();
    }
}
