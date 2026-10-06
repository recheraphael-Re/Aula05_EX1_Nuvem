public class Servico {

    String nome;
    String categoria;

    public Servico(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public void exibirInformacoes() {
        System.out.println("--- SERVIÇO ---");
        System.out.println("Serviço: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println();
    }
}
