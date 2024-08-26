public class Produto extends Item {

    public Produto(String nome, double valorBase) {
        super(nome, valorBase);
    }

    @Override
    public double calcularValorComImpostos() {
        IPI ipi = new IPI();
        ICMS icms = new ICMS();
        return valorBase + ipi.calcular(valorBase) + icms.calcular(valorBase);
    }

    @Override
    public void detalharImpostos() {
        IPI ipi = new IPI();
        ICMS icms = new ICMS();

        System.out.println("  - IPI (21,9%): R$ " + String.format("%.2f", ipi.calcular(valorBase)));
        System.out.println("  - ICMS (13,2%): R$ " + String.format("%.2f", icms.calcular(valorBase)));
    }
}
