public class OperacaoComercial {
    private Item item;

    public OperacaoComercial(Item item) {
        this.item = item;
    }

    public void detalharOperacao() {
        System.out.println("=== Detalhamento da Operação Comercial ===");
        System.out.println("Item: " + item.getNome());
        System.out.println("Valor Base: R$ " + String.format("%.2f", item.getValorBase()));
        System.out.println("\n--- Impostos Aplicados ---");

        item.detalharImpostos();

        double valorTotal = item.calcularValorComImpostos();
        System.out.println("----------------------------");
        System.out.println("Valor Total com Impostos: R$ " + String.format("%.2f", valorTotal));
        System.out.println("==============================================");
    }
}
