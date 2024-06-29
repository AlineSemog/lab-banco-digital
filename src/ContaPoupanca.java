public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(int numero, Cliente cliente, double taxaRendimento) {
        super(numero, cliente);
        this.taxaRendimento = taxaRendimento;
    }

    public void renderJuros() {
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "taxaRendimento=" + taxaRendimento +
                ", " + super.toString() +
                '}';
    }
}
