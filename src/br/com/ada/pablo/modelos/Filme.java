package br.com.ada.pablo.modelos;

public class Filme extends Produto {

    private String estudio;
    private String diretores;
    private String generos;
    private String produtores;

    public Filme(Categoria categoria, String nome, Double preco, String estudio, String diretores, String generos, String produtores) {
        super(categoria, nome, preco);
        this.estudio = estudio;
        this.diretores = diretores;
        this.generos = generos;
        this.produtores = produtores;
    }
}
