//Main.java

import entidades.Lanche;
import java.util.Scanner

public class Main {
    public static void main(String[] args) {

        Lanche Xburguer = new Lanche("X - Burguer", 24.90, "Maionese, Pão, Tomate, Carne, Queijo", 10);

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("LISTA DE OPÇÕES DESEJADAS");
            System.out.println("1 - Quero fazer um pedido.");
            System.out.println("2 - Adicionar ao estoque");
            System.out.println("3 - Informações do pedido");
            System.out.println("4 - Atualizar valor");
            System.out.println("5 - Atualizar descrição");
            System.out.println("6 - Finalizar");
            System.out.println("Digite a opção desejada:");

        }

    }

}