package br.com.ada.pablo.modelos;

import java.util.*;

public class Livraria {
    private List<Produto> produtos = new ArrayList<>();
    private Map<Integer, Produto> map = new HashMap<>();
    private Integer id = 0;
    private Double valorCaixa = 0.00;

    public List<Produto> getProdutos() {
        return Collections.unmodifiableList(produtos);
    }

    public Double getValorCaixa() {
        return valorCaixa;
    }

    public Produto adicionarProduto(Produto produto) {
        this.produtos.add(produto);
        id = this.produtos.size();
        produto.setId(id);
        this.map.put(id, produto);
        return produto;
    }
    public Double venderItem(Produto produto) {
        Double itemARemover = produto.getPreco();
        this.produtos.remove(produto);
        valorCaixa += itemARemover;
        return itemARemover;
    }

    public List<Produto> listarItensPorCategoria(Categoria categoria) {
        this.produtos.stream().filter(produto -> produto.getCategoria() == categoria).forEach(System.out::println);
        System.out.println(this.produtos.size() + " produtos");
        return produtos;
    }

    public List<Produto> listarTodosItensPorCategoria() {
        this.produtos.sort(Comparator.comparing(Produto::getCategoria));
        this.produtos.forEach(System.out::println);
        return this.produtos;
    }

    public void testandoMap() {
    }
}
