package collections.java.api.list.operacoesBasicas.listaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefas> listaTarefa;

    public ListaTarefas() {
        this.listaTarefa = new ArrayList<>();
    }    
    
    public void adicionarTarefa(String descricao) {
        listaTarefa.add(new Tarefas(descricao));
    }
    
    /* Cria uma nova lista para armazenar a tarefa cuja descricao é igual a 
    descricao passada por parâmetro e depois a remove*/
    public void removerTarefa(String descricao) {
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        
        for (Tarefas t : listaTarefa) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        
        listaTarefa.removeAll(tarefasParaRemover);
    }
    
    public int obterNumeroTotalTarefas() {
        return listaTarefa.size();
    }
    
    public void obterDescricoesTarefas() {
        System.out.println(listaTarefa);
    }
    
    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.obterDescricoesTarefas();
    }
}
