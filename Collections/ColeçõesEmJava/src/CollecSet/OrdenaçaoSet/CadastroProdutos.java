package CollecSet.OrdenaçaoSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtosSet;
    
    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }
    
    public void adicionarProduto (String nome, long codigoBarras, double preco, int quantidadeEstoque) {
        produtosSet.add(new Produto(nome, codigoBarras, preco, quantidadeEstoque));
    }
    
    public Set<Produto> exibirProdutosNome () {
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto("Produto A", 1234567890123L, 10.99, 100);
        cadastro.adicionarProduto("Produto B", 9876543210987L, 20.99, 50);
        cadastro.adicionarProduto("Produto C", 4567891234567L, 15.99, 75);
        
        Set<Produto> produtosOrdenados = cadastro.exibirProdutosNome();
        
        for (Produto produto : produtosOrdenados) {
            System.out.println(produto.getNome() + " - " + produto.getCodigoBarras() + " - " + produto.getPreco() + " - " + produto.getQuantidadeEstoque());
        }    
    }
}
