public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5]; // Declaração de um vetor de inteiros com 5 elementos

        // Atribuição de valores ao vetor
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Acessando e imprimindo os valores do vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }

        System.out.println("\n === ForEach ===");
        for (double numero : numeros) {
            System.out.println(numero);
        }
    }
}