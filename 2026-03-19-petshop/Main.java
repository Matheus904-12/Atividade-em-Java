public class Main {
    public static void main(String[] args) {
        System.out.println("=== Petshop UMC ===");

        Gato gato = new Gato("Mimi", 2, "Persa", "Branco", 4.5);
        Cachorro cachorro = new Cachorro("Thor", 3, "Golden", "Dourado", 30.0);
        Peixe peixe = new Peixe("Nemo", 1, "Peixe-Palhaço", "Laranja", 0.1);

        System.out.println("\nInformações do Gato:");
        System.out.println("Nome: " + gato.getNome());
        gato.miar();

        System.out.println("\nInformações do Cachorro:");
        System.out.println("Nome: " + cachorro.getNome());
        cachorro.latir();

        System.out.println("\nInformações do Peixe:");
        System.out.println("Nome: " + peixe.getNome());
        peixe.soltarBolhas();
    }
}
