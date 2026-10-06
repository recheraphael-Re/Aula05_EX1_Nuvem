public class Main {

    public static void main(String[] args) {

        System.out.println("=== ESTOQUE DA LOJA ===");
        System.out.println();

        Produto notebook = new Produto("Notebook", 3500.00, 5);
        Produto mouse = new Produto("Mouse sem fio", 89.90, 40);
        Produto monitor = new Produto("Monitor 24 polegadas", 1250.50, 12);

        notebook.exibirProduto();
        mouse.exibirProduto();
        monitor.exibirProduto();
    }
}
