import java.util.Locale;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.printf(Locale.US, "Preço: R$ %.2f%n", preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println();
    }
}
