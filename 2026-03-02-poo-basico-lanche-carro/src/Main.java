public class Main {
    public static void main(String[] args) {
        Lanche xegg = new Lanche();
        Lanche xtudo = new Lanche();

        xegg.nome = "X-Egg";
        xegg.preco = 24.90;
        xegg.descricao = "Maionese, Pao, Tomate, Ovo, Queijo";

        xtudo.nome = "X-Tudo";
        xtudo.preco = 20.50;
        xtudo.descricao = "Maionese, Pao, Tomate, Tudo que um podrao possui";

        xegg.exibir();
        System.out.println();
        xtudo.exibir();

        System.out.println("\n---\n");

        Carro suv = new Carro();
        Carro sedan = new Carro();

        suv.modelo = "Amarok";
        suv.marca = "Volkswagen";
        suv.ano = 2025;

        sedan.modelo = "Sentra";
        sedan.marca = "Nissan";
        sedan.ano = 2024;

        suv.exibirInformacoes();
        System.out.println();
        sedan.exibirInformacoes();
    }
}

