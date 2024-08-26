public abstract class Item {
    protected String nome;
    protected double valorBase;

    public Item(String nome, double valorBase) {
        this.nome = nome;
        this.valorBase = valorBase;
    }

    public String getNome() {
        return nome;
    }

    public double getValorBase() {
        return valorBase;
    }

    public abstract double calcularValorComImpostos();

    public abstract void detalharImpostos();
}
