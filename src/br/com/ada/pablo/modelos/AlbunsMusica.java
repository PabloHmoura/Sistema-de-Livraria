package br.com.ada.pablo.modelos;

public class AlbunsMusica extends Produto {

    private String musicoOuBanda;
    private String generos;
    private String selos;

    public AlbunsMusica(Categoria categoria, String nome, Double preco, String musicoOuBanda, String generos, String selos) {
        super(categoria, nome, preco);
        this.musicoOuBanda = musicoOuBanda;
        this.generos = generos;
        this.selos = selos;
    }
}
