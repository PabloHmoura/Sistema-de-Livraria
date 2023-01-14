package br.com.ada.pablo.teste;

import br.com.ada.pablo.modelos.Brinquedo;
import br.com.ada.pablo.modelos.*;

import java.util.Scanner;
import static br.com.ada.pablo.modelos.Categoria.*;

public class MetodosDeEntrada {

    public void telaPrincipal(Livraria livraria) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Vender produto");
        System.out.println("2 - Administrar estoque");
        System.out.println("3 - Fechar sistema");
        System.out.println("Digite o número de uma das opções: ");
        int escolha = scanner.nextInt();
        switch (escolha){
            case 1 -> venderProduto(livraria);
            case 2 -> administrarEstoque(livraria);
            case 3 -> System.exit(0);
            default -> System.out.println("Alternativa não válida");
        }

    }

    private void administrarEstoque(Livraria livraria) {
        System.out.println("1 - listar todos os produtos\n2 - listar produtos por categoria\n3 listar produtos por categoria e gênero\n 4 - voltar ao menu principal");
        Scanner scannerAdm = new Scanner(System.in);
        int escolha = scannerAdm.nextInt();
        if (escolha == 1){
            livraria.listarTodosItensEmSequenciaDeCategoria();
            administrarEstoque(livraria);
        } else if (escolha == 2){
            System.out.println();
            Categoria categoria = escolherCategoria();
            livraria.listarItensPorCategoria(categoria);
            administrarEstoque(livraria);
        } else if (escolha == 3){
            Categoria categoria = escolherCategoria();
            Genero genero = escolherGenero();
            livraria.listarPorCategoriaEPorGenero(categoria, genero);
            administrarEstoque(livraria);
        } else {
            telaPrincipal(livraria);
        }
    }

    private void adicionarProduto(Livraria livraria) {
        Scanner scannerAddProduto = new Scanner(System.in);
        System.out.println("1 - Brinquedo\n2 - Filme\n3 - Jogo\n4 - Livro\n5 - Albuns de Música");
        System.out.println("Digite o nome ou numero da categoria do produto que deseja adicionar:");
        String categoriaProduto = scannerAddProduto.nextLine();

        if (categoriaProduto.equalsIgnoreCase("brinquedo") || categoriaProduto.equals("1")) {
            System.out.println("Digite o nome do brinquedo: ");
            String nome = scannerAddProduto.nextLine();
            System.out.println("Digite o preço do brinquedo: ");
            double preco = scannerAddProduto.nextDouble();
            scannerAddProduto.nextLine();
            System.out.println("Digite o tipo do brinquedo: ");
            String tipo = scannerAddProduto.nextLine();
            Produto brinquedo = new Brinquedo(BRINQUEDO, nome, preco, tipo);
            livraria.adicionarProduto(brinquedo);
            System.out.println();
            System.out.println("Produto adicionado com sucesso!");

        } else if (categoriaProduto.equalsIgnoreCase("filme") || categoriaProduto.equals("2")) {
            System.out.println("Digite o nome do filme: ");
            String nome = scannerAddProduto.nextLine();
            System.out.println("Digite o preço do filme: ");
            double preco = scannerAddProduto.nextDouble();
            scannerAddProduto.nextLine();
            System.out.println("Digite o nome do estúdio: ");
            String estudio = scannerAddProduto.nextLine();
            System.out.println("Digite o nome dos diretores separados por vírgula: ");
            String diretores = scannerAddProduto.nextLine();
            Genero genero = escolherGenero();
            System.out.println("Digite o nome dos produtores separados por vírgula: ");
            String produtores = scannerAddProduto.nextLine();
            Produto filme = new Filme(FILME, nome, preco, estudio, diretores, genero, produtores);
            livraria.adicionarProduto(filme);
            System.out.println();
            System.out.println("Produto adicionado com sucesso!");

        } else if (categoriaProduto.equalsIgnoreCase("jogo") || categoriaProduto.equals("3")) {
            System.out.println("Digite o nome do jogo: ");
            String nome = scannerAddProduto.nextLine();
            System.out.println("Digite o preço do jogo: ");
            double preco = scannerAddProduto.nextDouble();
            scannerAddProduto.nextLine();
            System.out.println("Digite o nome da distribuídora: ");
            String distribuidora = scannerAddProduto.nextLine();
            Genero genero = escolherGenero();
            System.out.println("Digite o nome do estúdio: ");
            String estudio = scannerAddProduto.nextLine();
            Produto jogo = new Jogo(JOGO, nome, preco, distribuidora, genero, estudio);
            livraria.adicionarProduto(jogo);
            System.out.println();
            System.out.println("Produto adicionado com sucesso!");

        } else if (categoriaProduto.equalsIgnoreCase("livro") || categoriaProduto.equals("4")) {
            System.out.println("Digite o nome do livro: ");
            String nome = scannerAddProduto.nextLine();
            System.out.println("Digite o preço do livro: ");
            double preco = scannerAddProduto.nextDouble();
            scannerAddProduto.nextLine();
            Genero genero = escolherGenero();
            System.out.println("Digite o nome do escritor(a): ");
            String escritor = scannerAddProduto.nextLine();
            System.out.println("Digite o nome da editora: ");
            String editora = scannerAddProduto.nextLine();
            Produto livro = new Livro(LIVRO, nome, preco, genero, escritor, editora);
            livraria.adicionarProduto(livro);
            System.out.println();
            System.out.println("Produto adicionado com sucesso!");

        } else if (categoriaProduto.equalsIgnoreCase("musica") || categoriaProduto.equals("5")) {
            System.out.println("Digite o nome do álbum: ");
            String nome = scannerAddProduto.nextLine();
            System.out.println("Digite o preço do álbum: ");
            double preco = scannerAddProduto.nextDouble();
            scannerAddProduto.nextLine();
            System.out.println("Digite o nome do músico/banda: ");
            String musico = scannerAddProduto.nextLine();
            Genero genero = escolherGenero();
            System.out.println("Digite os selos: ");
            String selos = scannerAddProduto.nextLine();
            Produto album = new AlbunsMusica(MUSICA, nome, preco, musico, genero, selos);
            livraria.adicionarProduto(album);
            System.out.println();
            System.out.println("Produto adicionado com sucesso!");
        }
        telaPrincipal(livraria);
    }

    private void venderProduto(Livraria livraria) {
        Scanner scannerVenda = new Scanner(System.in);
        System.out.println("1 - Brinquedo\n2 - Filme\n3 - Jogo\n4 - Livro\n5 - Albuns de Música");
        System.out.println("Digite o nome ou numero da categoria do produto:");
        String categoria = scannerVenda.nextLine();
        if (categoria.equalsIgnoreCase("brinquedo") || categoria.equals("1")) {
            livraria.listarItensPorCategoria(BRINQUEDO);
        } else if (categoria.equalsIgnoreCase("filme") || categoria.equals("2")) {
            livraria.listarItensPorCategoria(FILME);
        } else if (categoria.equalsIgnoreCase("jogo") || categoria.equals("3")) {
            livraria.listarItensPorCategoria(JOGO);
        } else if (categoria.equalsIgnoreCase("livro") || categoria.equals("4")) {
            livraria.listarItensPorCategoria(LIVRO);
        } else if (categoria.equalsIgnoreCase("musica") || categoria.equals("5")) {
            livraria.listarItensPorCategoria(MUSICA);
        }
        System.out.println("Digite o ID do produto que deseja vender: ");
        int idProduto = scannerVenda.nextInt();
        livraria.selecionandoProdutoPorId(idProduto);
        System.out.println(livraria.getValorCaixa());

        telaPrincipal(livraria);
    }

    public Genero escolherGenero(){
        Scanner scannerGenero = new Scanner(System.in);
        System.out.println("1 - AÇÃO, 2 - COMÉDIA, 3 - ROMANCE, 4 - FANTASIA, 5 - DRAMA, 6 - TERROR");
        System.out.println("Digite o número do gênero: ");
        int escolhaRomance = scannerGenero.nextInt();
        Genero genero = null;
        switch (escolhaRomance){
            case 1 -> genero = Genero.ACAO;
            case 2 -> genero = Genero.COMEDIA;
            case 3 -> genero = Genero.ROMANCE;
            case 4 -> genero = Genero.FANTASIA;
            case 5 -> genero = Genero.DRAMA;
            case 6 -> genero = Genero.TERROR;
            default -> System.out.println("Opção inválida!") ;
        }
        return genero;
    }

    public Categoria escolherCategoria(){
        Scanner scannerCategoria = new Scanner(System.in);
        System.out.println("1 - Albuns de música, 2 - Brinquedo, 3 - Filmes, 4 - Livros, 5 - Jogos");
        System.out.println("Digite o número do gênero: ");
        int escolhaCategoria = scannerCategoria.nextInt();
        Categoria categoria = null;
        switch (escolhaCategoria){
            case 1 -> categoria = MUSICA;
            case 2 -> categoria = BRINQUEDO;
            case 3 -> categoria = FILME;
            case 4 -> categoria = LIVRO;
            case 5 -> categoria = JOGO;
            default -> System.out.println("Opção inválida!") ;
        }
        return categoria;
    }
}
