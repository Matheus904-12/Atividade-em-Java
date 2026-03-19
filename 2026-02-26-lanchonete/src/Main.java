//Main.java

import entidades.Lanche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lanche Xburguer = new Lanche("X-Burguer", 24.90, "Maionese, Pão, Tomate, Carne, Queijo", 10);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nSeja Bem Vindo ao Burguer King!");
            System.out.println("LISTA DE OPÇÕES DESEJADAS");
            System.out.println("1 - Quero fazer um pedido.");
            System.out.println("2 - Adicionar ao estoque");
            System.out.println("3 - Informações do pedido");
            System.out.println("4 - Atualizar valor");
            System.out.println("5 - Atualizar descrição");
            System.out.println("6 - Finalizar");
            System.out.println("Digite a opção desejada:");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    if (Xburguer.getEstoque() > 0) {
                        System.out.println("Informe a quantidade desejada: ");
                        int quantidade = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Pedido realizado com sucesso!" +
                                "\nValor total: R$ " + Xburguer.precoTotal(quantidade));
                        Xburguer.setEstoque(Xburguer.getEstoque() - quantidade);
                    } else {
                        System.out.println("Desculpe, o lanche " + Xburguer.getNome() + " está indisponível no momento.");
                    }
                    break;

                case "2":
                    System.out.println("Informe a quantidade a ser adicionada ao estoque: "
                            + Xburguer.getNome());
                    int quantidade = sc.nextInt();
                    sc.nextLine();
                    Xburguer.setEstoque(Xburguer.getEstoque() + quantidade);
                    System.out.println("Estoque atualizado!" +
                            "\nQuantidade atual de " + Xburguer.getNome() + ": " + Xburguer.getEstoque());
                    break;

                case "3":
                    System.out.println(Xburguer.toString());
                    break;

                case "4":
                    System.out.println("O lanche " + Xburguer.getNome()
                            + " custa R$ " + Xburguer.getPreco()
                    );
                    System.out.println("Informe o valor do lanche: ");
                    double preco = sc.nextDouble();

                    Xburguer.setPreco(preco);
                    break;

                case "5":
                    System.out.println("O lanche "
                            + Xburguer.getNome()
                            + " tem a seguinte descrição: "
                            + Xburguer.getDescricao());
                    System.out.println("Informe a nova descrição do lanche: ");
                    String descricao = sc.nextLine();
                    Xburguer.setDescricao(descricao);
                    break;

                case "6":
                    System.out.println("Finalizando o programa...");
                    sc.close();
                    System.exit(0);
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");

        }

    }            }
