package loja.modelo;

public class ProdutoVestuario extends Produto {
    private String tamanho;

    public ProdutoVestuario(String nome, double preco, int quantidade, String tamanho) {
        super(nome, preco, quantidade);
        this.tamanho = tamanho;
    }

    public ProdutoVestuario(int id, String nome, double preco, int quantidade, String tamanho) {
        super(id, nome, preco, quantidade);
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return "Tamanho: " + tamanho;
    }

    @Override
    public String toTxtLine() {
        return "VESTUARIO;" + getId() + ";" + getNome() + ";" +
                getPreco() + ";" + getQuantidade() + ";" + tamanho;
    }
}
