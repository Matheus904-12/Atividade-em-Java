package loja.modelo;

public class ProdutoAlimenticio extends Produto {
    private String dataValidade;

    public ProdutoAlimenticio(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public ProdutoAlimenticio(int id, String nome, double preco, int quantidade, String dataValidade) {
        super(id, nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String getDescricao() {
        return "Validade: " + dataValidade;
    }

    @Override
    public String toTxtLine() {
        return "ALIMENTO;" +
                getId() + ";" +
                getNome() + ";" +
                getPreco() + ";" +
                getQuantidade() + ";" +
                dataValidade;
    }
}
