import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Petshop UMC (Polimorfismo) ===");

        // Criando uma lista de Animais (Polimorfismo)
        List<Animal> animais = new ArrayList<>();
        
        animais.add(new Gato("Mimi", 2, "Persa", "Branco", 4.5));
        animais.add(new Cachorro("Thor", 3, "Golden", "Dourado", 30.0));
        animais.add(new Peixe("Nemo", 1, "Peixe-Palhaço", "Laranja", 0.1));

        // Percorrendo a lista e chamando o mesmo método para todos
        System.out.println("\n--- Sons des Animais no Petshop ---");
        for (Animal animal : animais) {
            System.out.print(animal.getNome() + " diz: ");
            animal.fazerSom(); // Aqui acontece o POLIMORFISMO! Cada um faz o seu som.
        }

        System.out.println("\n--- Hora de Dormir ---");
        for (Animal animal : animais) {
            System.out.print(animal.getNome() + ": ");
            animal.dormir(); // Esse método é herdado da classe Animal
        }
    }
}
