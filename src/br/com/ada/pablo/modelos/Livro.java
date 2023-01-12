package br.com.ada.pablo.modelos;

public class Livro extends Produto {

    private String genero;
    private String escritor;
    private String editora;

    public Livro(Categoria categoria, String nome, Double preco, String genero, String escritor, String editora) {
        super(categoria, nome, preco);
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }
}
