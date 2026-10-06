public class Main {

    public static void main(String[] args) {

        System.out.println("=== CTI INSIGHTS ===");
        System.out.println();

        // Criação dos objetos e dos relacionamentos entre eles
        Consultor consultor = new Consultor("Rafael Barbosa", "CON-0089");

        Cliente cliente = new Cliente("CLI-001", "Indústria", "Premium", consultor);

        Servico servico = new Servico("Monitoramento de Máquinas", "Telemetria Industrial");

        Contrato contrato = new Contrato("04/09/2026", "Ativo", cliente, servico);

        Telemetria telemetria = new Telemetria("Leitura de temperatura", "Sucesso",
                "04/09/2026 15:30", servico);

        Insight insight = new Insight("Alerta", "Temperatura acima da média",
                "04/09/2026 15:31", contrato);

        // Exibição das informações de cada objeto
        consultor.exibirInformacoes();
        cliente.exibirInformacoes();
        servico.exibirInformacoes();
        contrato.exibirInformacoes();
        telemetria.exibirInformacoes();
        insight.exibirInformacoes();
    }
}
