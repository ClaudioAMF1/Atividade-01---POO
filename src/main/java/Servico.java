public class Servico extends Item {

    public Servico(String nome, double valorBase) {
        super(nome, valorBase);
    }

    @Override
    public double calcularValorComImpostos() {
        ISS iss = new ISS();
        ICMS icms = new ICMS();
        return valorBase + iss.calcular(valorBase) + icms.calcular(valorBase);
    }

    @Override
    public void detalharImpostos() {
        ISS iss = new ISS();
        ICMS icms = new ICMS();

        System.out.println("  - ISS (7,3%): R$ " + String.format("%.2f", iss.calcular(valorBase)));
        System.out.println("  - ICMS (13,2%): R$ " + String.format("%.2f", icms.calcular(valorBase)));
    }
}
