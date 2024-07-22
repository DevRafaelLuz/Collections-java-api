package collections.java.api.list.pesquisa.catalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivro;

    public CatalogoLivros() {
        this.listaLivro = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivro.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        
        if (!listaLivro.isEmpty()) {
            for (Livro l : listaLivro) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        } 
        
        return livrosPorAutor;
    }
    
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        
        if (!listaLivro.isEmpty()) {
            for (Livro l : listaLivro) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        
        return livrosPorIntervaloAnos;
    }
    
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        
        if (!listaLivro.isEmpty()) {
            for (Livro l : listaLivro) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        
        return livroPorTitulo;
    }
    
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2018);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2006);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2019);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 1994);
        
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2020));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
