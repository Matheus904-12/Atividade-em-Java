public class Livro {
    String titulo;
    String autor;
    int quantidade;
    double precoLivro;

    public Livro(String titulo, String autor, int quantidade, double precoLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
        this.precoLivro = precoLivro;
    }

    public void exibirInformacoes() {
        System.out.println("\nTitulo: " + this.titulo
                + "\nAutor: " + this.autor
                + "\nQuantidade: " + this.quantidade
                + "\nPreco Livro: R$ " + this.precoLivro
                + "\nValor Total R$ " + valorTotal());
    }

    public void emprestaLivro(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Nao temos essa quantidade disponivel no momento.");
        }
    }

    public void devolveLivro(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("Livro devolvido com sucesso");
        } else {
            System.out.println("Insira um valor valido");
        }
    }

    public double valorTotal() {
        return this.quantidade * this.precoLivro;
    }
}

