package collections.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }
    
    public void adicionarAluno(String nome, long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }
    
    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        
        for (Aluno a : alunoSet) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
                break;
            }
        }
        
        alunoSet.remove(alunoParaRemover);
    }
    
    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        
        return alunosPorNome;
    }
    
    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        
        return alunosPorNota;
    }
    
    public void exibirAlunos() {
        System.out.println(alunoSet);
    }
    
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Pedro", 01L, 7.8);
        gerenciadorAlunos.adicionarAluno("Ana", 02L, 9.7);
        gerenciadorAlunos.adicionarAluno("Paulo", 03L, 4.1);
        gerenciadorAlunos.adicionarAluno("José", 04L, 5.9);
        
        gerenciadorAlunos.exibirAlunos();
        
        gerenciadorAlunos.removerAluno(01);
        
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());        
        
    }
}
