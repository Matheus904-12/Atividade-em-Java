package entidades;

public class Lanche {
    private String nome;
    private double preco;
    private String descricao;
    private boolean disponivel;
    private int estoque;

    //constructor
    public Lanche(String nome, double preco, String descricao, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.estoque = estoque;
        this.disponivel = estoque > 0; // Lógica automática
    }

    // Getters e Setters necessários
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Preço inválido. O preço deve ser maior que zero.");
        } else {
            this.preco = preco;
            System.out.println("Preço atualizado para R$ " + preco);
        }
    }

    public int getEstoque() {
        return estoque; // Busca estoque atual
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
        this.disponivel = estoque > 0; // Atualiza disponibilidade ao mudar estoque
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;

    }

    public double precoTotal(int quantidade) {
        return this.preco * quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nPreco: " + preco
                + "\nDescricao: " + descricao
                + "\nDisponibilidade: " + disponivel
                + "\nEstoque: " + estoque;
    }
}
