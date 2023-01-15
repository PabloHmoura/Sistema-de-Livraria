package br.com.ada.pablo.modelos;

public class Jogo extends Produto {

    private String distribuidora;
    private Genero genero;
    private String estudio;

    public Jogo(Categoria categoria, String nome, Double preco, String distribuidora, Genero generos, String estudio) {
        super(categoria, nome, preco);
        this.distribuidora = distribuidora;
        this.genero = generos;
        this.estudio = estudio;
    }

    @Override
    public Genero getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return super.toString() + " ID[ " + this.getId() + " ]\n" +
                "distribuidora: " + distribuidora +
                ", genero: " + genero +
                ", estudio: " + estudio + "\n";
    }
}
