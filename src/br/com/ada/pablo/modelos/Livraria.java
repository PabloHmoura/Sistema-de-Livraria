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
        Random idRandom = new Random();
        this.produtos.add(produto);
        id = idRandom.nextInt(1000);
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
        System.out.println(categoria);
        List<Produto> lista = this.produtos.stream().filter(produto -> produto.getCategoria() == categoria).toList();
        System.out.println(lista.size() + " produtos\n");
        lista.forEach(System.out::println);
        return lista;
    }

    public List<Produto> listarTodosItensEmSequenciaDeCategoria() {
        this.produtos.sort(Comparator.comparing(Produto::getCategoria));
        this.produtos.forEach(System.out::println);
        return this.produtos;
    }

    public void removerItemPorId(int id) {
        produtos.removeIf(produto -> produto.getId() == id);
        System.out.println("Produto removido com sucesso");
    }

    public void selecionandoProdutoPorId(int id) {
        Produto produto = map.get(id);
        venderItem(produto);
    }

    public Produto selecionandoPorId(int id) {
        return map.get(id);
    }

    public void listarPorCategoriaEPorGenero(Categoria categoria, Genero genero) {
        List<Produto> lista = produtos.stream().filter(produto -> produto.getCategoria() == categoria && produto.getGenero() == genero).toList();

        System.out.println(lista.size() + " produto(s) da categoria " + categoria + " do gênero " + genero);
        System.out.println();
        lista.forEach(System.out::println);

    }
}
