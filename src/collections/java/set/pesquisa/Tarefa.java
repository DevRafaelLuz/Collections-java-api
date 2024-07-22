package collections.java.set.pesquisa;

public class Tarefa {
    private String descricao;
    private boolean conclusao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConclusao() {
        return conclusao;
    }

    public void setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
    }

    @Override
    public String toString() {
        return descricao + " - " + conclusao;
    }
}
