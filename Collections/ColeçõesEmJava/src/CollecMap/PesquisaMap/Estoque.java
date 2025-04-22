package CollecMap.PesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    
    private Map<Long, Produto> estoque;

    public Estoque() {
       this.estoque = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, double preco, int quantidade) {
        estoque.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos () {
        System.out.println(estoque);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Produto produto : estoque.values()) {
            valorTotal += produto.getPreco() * produto.getQuantidade();
        }
        return valorTotal;
    }

    public void obterProdutoMaisCaro () {
        Produto produtoMaisCaro = null;
        for (Produto produto : estoque.values()) {
            if (produtoMaisCaro == null || produto.getPreco() > produtoMaisCaro.getPreco()) {
                produtoMaisCaro = produto;
            }
        }
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    }
}