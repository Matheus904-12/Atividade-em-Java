public class Main {
    public static void main(String[] args) {
        Livro invencivelVolume1 = new Livro("Invencivel - Volume 1", "Robert Kirkman", 450, 89.90);
        Livro invencivelVolume2 = new Livro("Invencivel - Volume 2", "Robert Kirkman", 520, 95.50);
        Livro invencivelVolume3 = new Livro("Invencivel - Volume 3", "Robert Kirkman", 480, 87.80);
        Livro invencivelVolume4 = new Livro("Invencivel - Volume 4", "Robert Kirkman", 510, 92.30);
        Livro invencivelVolume5 = new Livro("Invencivel - Volume 5", "Robert Kirkman", 490, 88.90);

        invencivelVolume1.emprestaLivro(87);
        invencivelVolume1.devolveLivro(27);
        invencivelVolume1.exibirInformacoes();

        invencivelVolume2.exibirInformacoes();
        invencivelVolume3.exibirInformacoes();
        invencivelVolume4.exibirInformacoes();
        invencivelVolume5.exibirInformacoes();
    }
}

