package br.com.ada.pablo.teste;

import br.com.ada.pablo.modelos.*;

public class Main {

    public static void main(String[] args) {
        Produto produto = new Livro(Categoria.LIVRO, "Eu e Ela",  100.00, "Românce", "Romeu", "Julieta");
        Produto produto2 = new Jogo(Categoria.JOGO, "Midnight Club Edition Remix 3", 200.00, "Sony", "Ação", "Rockstar Games");
        Produto produto3 = new AlbunsMusica(Categoria.MUSICA, "Sofrência", 300.00, "Pablo", "Eletrônica", "Alguns");
        Produto produto4 = new Livro(Categoria.LIVRO, "Eu e Ela",  100.00, "Românce", "Romeu", "Julieta");

        Livraria livraria = new Livraria();
        System.out.println(livraria.getValorCaixa());
        livraria.adicionarProduto(produto);
        livraria.adicionarProduto(produto2);
        livraria.adicionarProduto(produto3);
        livraria.adicionarProduto(produto4);

        System.out.println("Valor em caixa " + livraria.getValorCaixa());

        livraria.listarItensPorCategoria(Categoria.LIVRO);

        livraria.listarTodosItensPorCategoria();
    }
}
