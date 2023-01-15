package br.com.ada.pablo.modelos;

public class Livro extends Produto {

    private Genero genero;
    private String escritor;
    private String editora;

    public Livro(Categoria categoria, String nome, Double preco, Genero genero, String escritor, String editora) {
        super(categoria, nome, preco);
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }

    @Override
    public Genero getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return super.toString() + " ID[ " + this.getId() + " ]\n" +
                "genero: " + genero +
                ", escritor: " + escritor +
                ", editora: " + editora + "\n";
    }
}
