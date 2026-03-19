import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorProduto gerenciar = new GerenciadorProduto();

        int opcao = 0;
        do {
            System.out.println("\n==== MENU DE OPÇÕES ====");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Remover Produto");
            System.out.println("4. Atualizar Produto");
            System.out.println("5. Buscar Produto");
            System.out.println("6. calcular valor total do estoque");
            System.out.println("7. Sair");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidade = scanner.nextInt();
                    gerenciar.adicionarProduto(new Produto(nome, preco, quantidade));
                    break;
                case 2:
                    gerenciar.listarProdutos();
                    break;
                case 3:
                    System.out.print("Digite o ID do produto: ");
                    int id = scanner.nextInt();
                    gerenciar.removerProduto(id);
                    break;
                case 4:
                    System.out.print("Digite o ID do produto: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o novo nome do produto: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o novo preço do produto: ");
                    double novoPreco = scanner.nextDouble();
                    System.out.print("Digite a nova quantidade do produto: ");
                    int novaQuantidade = scanner.nextInt();
                    gerenciar.atualizarProduto(idAtualizar, novoNome, novoPreco, novaQuantidade);
                    break;
                case 5:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    gerenciar.buscarProduto(nome);
                    break;
                case 6:
                    gerenciar.calcularValorTotalEstoque();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 7);
        scanner.close();
    }
}