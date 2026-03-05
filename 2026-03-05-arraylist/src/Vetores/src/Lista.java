import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Integer> listaNotas = new ArrayList();

        listaNotas.add(10); //posição 0
        listaNotas.add(8);
        listaNotas.add(6);
        listaNotas.add(4);
        listaNotas.add(2);
        listaNotas.add(0);

        //listaNotas.add(0, 12);

        System.out.println(" === For ===");
        for (int i = 0; i < listaNotas.size(); i++) {
            System.out.println("Nota  " + i + ": " + listaNotas.get(i));
        }

        System.out.println("\n === ForEach ===");
        for (double nota : listaNotas) {
            System.out.println(nota);
        }

        // CRUD - Create, Read, Update, Delete

        System.out.println("\n === Adicionar Valor ==="); //CREATE
        listaNotas.add(10);
        for (double nota : listaNotas) {
            System.out.println(nota);
        }

        System.out.println("\n === Leitura de Valor ==="); //READ
        System.out.println(listaNotas.get(0));

        System.out.println("\n === Alterar Valor ==="); //UPDATE
        listaNotas.set(0, 12);
        for (double nota : listaNotas) {
            System.out.println(nota);
        }

        System.out.println("\n === Remover Valor ==="); //DELETE
        listaNotas.remove(0);
        for (double nota : listaNotas) {
            System.out.println(nota);
        }

        // System.out.println("\n === Limpar Lista ==="); //RESET
        // listaNotas.clear();
        // for (double nota : listaNotas) {
        //    System.out.println(nota);
        //}

        // Verificar se a lista esta vazia, tamanho da lista, verificar se a lista contem um valor

        System.out.println("\n === A lista esta vazia? ===");
        System.out.println(listaNotas.isEmpty());

        System.out.println("\n === Tamanho da Lista ===");
        System.out.println(listaNotas.size());

        System.out.println("\n == A lista contem valor? ===");
        System.out.println(listaNotas.contains(8));

        // Predicados

        System.out.println("\n === forEach ===");
        listaNotas.removeIf(element -> element < 7);
        for (double nota : listaNotas) {
            System.out.println(nota);
        }

        System.out.println("\n === For ===");
        listaNotas.removeIf(element -> element < 7);
        for (Integer nota : listaNotas) {
            System.out.println(nota);
        }
    }
}
