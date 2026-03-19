public class Peixe extends Animal {

    public Peixe(String nome, double idade, String raca, String cor, double peso) {
        super(nome, idade, raca, cor, peso);
    }

    public void nadar() {
        System.out.println("Nadando...");
    }

    public void soltarBolhas() {
        System.out.println("Blub blub...");
    }
}
