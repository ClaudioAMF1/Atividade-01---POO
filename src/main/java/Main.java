import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("=== Bem-vindo ao Sistema de Cálculo de Impostos ===");
        System.out.println("Digite o nome do item:");
        String nomeItem = scanner.nextLine();

        System.out.println("Digite o tipo do item:");
        System.out.println("1 - Produto");
        System.out.println("2 - Serviço");
        System.out.print("Escolha: ");
        int tipoItem = scanner.nextInt();

        System.out.println("Digite o valor base do item (em R$):");
        double valorBase = scanner.nextDouble();

        System.out.println("==============================================\n");

        // Criação do item com base no tipo informado
        Item item;
        if (tipoItem == 1) {
            item = new Produto(nomeItem, valorBase);
        } else if (tipoItem == 2) {
            item = new Servico(nomeItem, valorBase);
        } else {
            System.out.println("Tipo de item inválido.");
            return;
        }

        // Criação da operação comercial
        OperacaoComercial operacaoComercial = new OperacaoComercial(item);

        // Detalhamento da operação
        operacaoComercial.detalharOperacao();

        scanner.close();
    }
}
