package CollecSet.OrdenaçaoSet;

public class Produto implements Comparable<Produto> {
    private String nome;
    private long codigoBarras;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, long codigoBarras, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.codigoBarras = codigoBarras;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public long getCodigoBarras() {
        return codigoBarras;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return this.nome.compareToIgnoreCase(outroProduto.getNome());
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", codigoBarras=" + codigoBarras + ", preco=" + preco + ", quantidadeEstoque="
                + quantidadeEstoque + "]";
    }
}