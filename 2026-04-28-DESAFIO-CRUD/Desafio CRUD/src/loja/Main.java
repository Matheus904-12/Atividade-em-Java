package loja;

import loja.gerenciamento.GerenciarProdutos;
import loja.modelo.ProdutoAlimenticio;
import loja.modelo.ProdutoEletronico;
import loja.modelo.ProdutoVestuario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciarProdutos gerenciador = new GerenciarProdutos();
        int opcao = 0;

        while (opcao != 7) {
            System.out.println("\n=====MENU DE OPÇÕES=====");
            System.out.println("1 - Cadastrar Produto Eletrônico");
            System.out.println("2 - Cadastrar Produto Vestuário");
            System.out.println("3 - Cadastrar Produto Alimentício");
            System.out.println("4 - Listar produtos");
            System.out.println("5 - Atualizar produto");
            System.out.println("6 - Remover produto");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir quebra de linha

                switch (opcao) {
                    case 1:
                        System.out.print("Nome: ");
                        String nomeE = scanner.nextLine();
                        System.out.print("Preço: ");
                        double precoE = scanner.nextDouble();
                        System.out.print("Quantidade: ");
                        int qtdE = scanner.nextInt();
                        System.out.print("Garantia (Meses): ");
                        int garantia = scanner.nextInt();
                        gerenciador.cadastrarProduto(new ProdutoEletronico(nomeE, precoE, qtdE, garantia));
                        break;
                    case 2:
                        System.out.print("Nome: ");
                        String nomeV = scanner.nextLine();
                        System.out.print("Preço: ");
                        double precoV = scanner.nextDouble();
                        System.out.print("Quantidade: ");
                        int qtdV = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Tamanho: ");
                        String tamanho = scanner.nextLine();
                        gerenciador.cadastrarProduto(new ProdutoVestuario(nomeV, precoV, qtdV, tamanho));
                        break;
                    case 3:
                        System.out.print("Nome: ");
                        String nomeA = scanner.nextLine();
                        System.out.print("Preço: ");
                        double precoA = scanner.nextDouble();
                        System.out.print("Quantidade: ");
                        int qtdA = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Data de Validade (DD/MM/AAAA): ");
                        String validade = scanner.nextLine();
                        gerenciador.cadastrarProduto(new ProdutoAlimenticio(nomeA, precoA, qtdA, validade));
                        break;
                    case 4:
                        gerenciador.listarProdutos();
                        break;
                    case 5:
                        System.out.print("ID do produto a ser atualizado: ");
                        int idAtualizar = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Novo Nome: ");
                        String novoNome = scanner.nextLine();
                        System.out.print("Novo Preço: ");
                        double novoPreco = scanner.nextDouble();
                        System.out.print("Nova Quantidade: ");
                        int novaQtd = scanner.nextInt();
                        gerenciador.atualizarProduto(idAtualizar, novoNome, novoPreco, novaQtd);
                        break;
                    case 6:
                        System.out.print("ID do produto a ser removido: ");
                        int idRemover = scanner.nextInt();
                        gerenciador.removerProduto(idRemover);
                        break;
                    case 7:
                        System.out.println("Encerrando o sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira o tipo de dado correto.");
                scanner.nextLine(); // Limpa o buffer do scanner em caso de erro
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
            }
        }
        scanner.close();
    }
}