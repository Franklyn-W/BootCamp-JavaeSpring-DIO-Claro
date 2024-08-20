package collectionsJava.List.pesquisaEmList.exerc01;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> catalogo;

    public CatalogoLivros() {
        catalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        catalogo.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        for (Livro livro : catalogo) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(livro);
            }
        }
        System.out.println("Livros do autor: " + autor);
        return livrosPorAutor;
    }

    public void pesquisarPorAnoPublicacao(int anoPublicacao) {
        List<Livro> livroPorAno = new ArrayList<>();

        for (Livro livro : catalogo) {
            if (livro.getAnoPublicacao() == anoPublicacao) {
                livroPorAno.add(livro);
            }
        }
        System.out.println("Livros do ano: " + anoPublicacao + " > " + livroPorAno);
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livroIntervaloAnos = new ArrayList<>();

        for (Livro livro : catalogo) {
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                livroIntervaloAnos.add(livro);
            }
        }
        System.out.println("Os livros publicados entre os anos " + anoInicial + " e " + anoFinal);
        System.out.println(livroIntervaloAnos);
    }

    public void pesquisarPorTitulo(String titulo){
        List<Livro> livrosPorTitulo = new ArrayList<>();

        for (Livro livro : catalogo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livrosPorTitulo.add(livro);
            }
        }
        System.out.println("Titulo pesquisado: " + titulo);
        System.out.println(livrosPorTitulo);
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println(catalogoLivros.pesquisaPorAutor("Robert C. Martin"));
        System.out.println();

        catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022);
        System.out.println();

        catalogoLivros.pesquisarPorTitulo("Java Guia do Programador");
    }

}
