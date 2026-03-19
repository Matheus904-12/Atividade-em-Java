import java.util.ArrayList;

public class GerenciadorProduto {
    private ArrayList<Produto> listaProdutos;

    public GerenciadorProduto() {
        this.listaProdutos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        this.listaProdutos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos() {
        if (this.listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado!");
        } else {
            System.out.println("Lista de produtos:");
            for (Produto produto : listaProdutos) {
                System.out.println(produto);
            }
        }
    }

    public void removerProduto(int id) {
        if (id >= 0 && id < listaProdutos.size()) {
            listaProdutos.remove(id);
            System.out.println("Produto removido com sucesso");
        } else {
            System.out.println("ID invalido ou produto não encontrado!");
        }
    }

    public void atualizarProduto(int id, String novoNome, double novoPreco, int novaQuantidade) {
        if (id >= 0 && id < listaProdutos.size()) {
            Produto produto = listaProdutos.get(id);
            produto.setNome(novoNome);
            produto.setPreco(novoPreco);
            produto.setQuantidade(novaQuantidade);
            System.out.println("Produto atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    public void buscarProduto(String nome) {
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equals(nome)) {
                System.out.println(produto);
            }
        }
        System.out.println("Produto não encontrado!"); 
    }

    public void calcularValorTotalEstoque() {
        double valorTotal = 0;
        for (Produto produto : listaProdutos) {
            valorTotal += produto.calcularValorEstoque();
        }
        System.out.println("Valor total do estoque: " + valorTotal);
    }
}