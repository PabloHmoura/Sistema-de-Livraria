package br.com.ada.pablo.modelos;

public class Jogo extends Produto {

    private String distribuidora;
    private String generos;
    private String estudio;

    public Jogo(Categoria categoria, String nome, Double preco, String distribuidora, String generos, String estudio) {
        super(categoria, nome, preco);
        this.distribuidora = distribuidora;
        this.generos = generos;
        this.estudio = estudio;
    }
}
