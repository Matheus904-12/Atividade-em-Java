package loja.modelo;

public class ProdutoEletronico extends Produto {
    private int garantiaMeses;

    public ProdutoEletronico(String nome, double preco, int quantidade, int garantiaMeses) {
        super(nome, preco, quantidade);
        this.garantiaMeses = garantiaMeses;
    }

    public ProdutoEletronico(int id, String nome, double preco, int quantidade, int garantiaMeses) {
        super(id, nome, preco, quantidade);
        this.garantiaMeses =  garantiaMeses;
    }

    @Override
    public String getDescricao() {
        return "Garantia: " + garantiaMeses;
    }

    @Override
    public String toTxtLine() {
        return "ELETRONICO;" +
                getId() + ";" +
                getNome() + ";" +
                getPreco() + ";" +
                getQuantidade() + ";" +
                garantiaMeses
;
    }
}
