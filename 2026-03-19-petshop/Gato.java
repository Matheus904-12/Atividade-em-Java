public class Gato extends Animal {
    
    public Gato(String nome, double idade, String raca, String cor, double peso) {
        super(nome, idade, raca, cor, peso);
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    public void miar() {
        System.out.println("Miau");
    }

    public static void main(String[] args) {
        Gato gato1 = new Gato ("Mimi", 2, "Persa", "Branco", 5.0);
        System.out.println("Gato: " + gato1.getNome());
        gato1.miar();
        gato1.dormir();
    }
}
