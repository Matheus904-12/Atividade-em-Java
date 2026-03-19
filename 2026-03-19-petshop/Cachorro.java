public class Cachorro extends Animal {

    public Cachorro(String nome, double idade, String raca, String cor, double peso) {
        super(nome, idade, raca, cor, peso);
    }

    public void latir() {
        System.out.println("Au au");
    }

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro ("Rex", 2, "Pastor Alemão", "Preto", 5.0);
        System.out.println("Cachorro: " + cachorro1.getNome());
        cachorro1.latir();
        cachorro1.dormir();
    }
}