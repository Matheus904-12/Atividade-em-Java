package loja.gerenciamento;

import loja.modelo.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciarProdutos {
    private ArrayList<Produto> listaProdutos;
    private final String ARQUIVO_TXT = "produtos.txt";

    public GerenciarProdutos() {
        listaProdutos = new ArrayList<>();
        carregarDoArquivo();
    }

    public void cadastrarProduto(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("Produto Cadastrado com sucesso!");
        salvarNoArquivo();
    }

    public void listarProdutos() {
        if  (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado!");
            return;
        }
        System.out.println("=====PRODUTOS CADASTRADOS=====");
        for (Produto p : listaProdutos) {
            System.out.println(p.toString());
        }
    }

    public void atualizarProduto(int id, String nome, double preco, int quanidade) {
        for (Produto p : listaProdutos) {
            if (p.getId() == id) {
                p.setNome(nome);
                p.setPreco(preco);
                p.setQuantidade(quanidade);
                System.out.println("Produto atualizado com sucesso!");
                salvarNoArquivo();
                return;
            }
        }
        System.out.println("Produto com ID " +id + "não encontrado!");
    }

    public void removerProduto(int id) {
        boolean removido = listaProdutos.removeIf(p -> p.getId() == id);
        if (removido) {
            System.out.println("Produto removido com sucesso!");
            salvarNoArquivo();
        } else {
            System.out.println("Produto com ID " +id + "não encontrado!");
        }
    }

    // ---- Método Persistente TXT ----

    private void salvarNoArquivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO_TXT))) {
            for (Produto p : listaProdutos) {
                bw.write(p.toTxtLine());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

    private void carregarDoArquivo() {
        File arquivo = new File(ARQUIVO_TXT);
        if (!arquivo.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados  = linha.split(";");
                String tipo = dados[0];
                int id = Integer.parseInt(dados[1]);
                String nome = dados[2];
                double preco = Double.parseDouble(dados[3]);
                int quantidade = Integer.parseInt(dados[4]);

                if (tipo.equals("ELETRONICO")) {
                    int garantia = Integer.parseInt(dados[5]);
                    listaProdutos.add(new ProdutoEletronico((id), nome, preco, quantidade, garantia));
                } else if (tipo.equals("VESTUARIO")) {
                    String tamanho = dados[5];
                    listaProdutos.add(new ProdutoVestuario(id, nome, preco, quantidade, tamanho));
                } else if (tipo.equals("ALIMENTO")) {
                    String validade = dados[5];
                    listaProdutos.add(new ProdutoAlimenticio(id, nome, preco, quantidade, validade));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }
}
