package br.com.ada.pablo.modelos;

public class Brinquedo extends Produto {

    private String tipo;

    public Brinquedo(Categoria categoria, String nome, Double preco, String tipo) {
        super(categoria, nome, preco);
        this.tipo = tipo;
    }
}
