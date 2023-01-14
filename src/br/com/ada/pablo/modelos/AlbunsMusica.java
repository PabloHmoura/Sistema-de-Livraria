package br.com.ada.pablo.modelos;

public class AlbunsMusica extends Produto {

    private String musicoOuBanda;
    private String generos;
    private String selos;

    public AlbunsMusica(Categoria categoria, String nome, Double preco, String musicoOuBanda, Genero genero, String selos) {
        super(categoria, nome, preco);
        this.musicoOuBanda = musicoOuBanda;
        this.generos = String.valueOf(genero);
        this.selos = selos;
    }

    @Override
    public String toString() {
        return super.toString() + " ID[ " + this.getId() + " ]\n" +
                "musico/Banda: " + musicoOuBanda +
                ", generos: " + generos +
                ", selos: " + selos + "\n";
    }
}
