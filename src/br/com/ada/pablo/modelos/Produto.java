package br.com.ada.pablo.modelos;

import java.util.Random;

public abstract class Produto {

    private String nome;
    private int id;
    private Double preco;
    private Categoria categoria;
    private Genero genero;

    public Produto(Categoria categoria, String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
        this.id = 0;
        this.categoria = categoria;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return this.categoria +
                " " + nome +", preço = " + preco;
    }
}
