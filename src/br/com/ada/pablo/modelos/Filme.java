package br.com.ada.pablo.modelos;

public class Filme extends Produto {

    private String estudio;
    private String diretores;
    private String generos;
    private String produtores;

    public Filme(Categoria categoria, String nome, Double preco, String estudio, String diretores, Genero genero, String produtores) {
        super(categoria, nome, preco);
        this.estudio = estudio;
        this.diretores = diretores;
        this.generos = String.valueOf(genero);
        this.produtores = produtores;
    }

    @Override
    public String toString() {
        return super.toString() + " ID[ " + this.getId() + " ]\n" +
                "estudio: " + estudio +
                ", diretores:" + diretores +
                ", generos: " + generos +
                ", produtores: " + produtores+ "\n";
    }
}
